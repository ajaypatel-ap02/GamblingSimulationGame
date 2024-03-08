package gamblingSimulationGame;

import java.util.Random;


public class GamblingSimulationGame {
	private static final int DAILY_STAKE = 100;
	private static final int EVERY_GAME_BET = 1;
	private static final int WIN = 1;
	private static final int LOOSE = 0;
	private static final int DAYS_PLAYING = 20;
	private static int[] winningAmount = new int[DAYS_PLAYING]; 
	private static int[] loosingAmount = new int[DAYS_PLAYING];
	public static void gameStatus() {
		
		System.out.println("Stake available for start of the day : "+DAILY_STAKE);
		System.out.println("Bet for every game : "+EVERY_GAME_BET);
		
	}
	
	public static void gamePlay() {

		Random random = new Random();

		for(int i = 0; i < DAYS_PLAYING; i++) {

			int winCount = 0 ;
			int looseCount = 0;
			
			System.out.println("");
			System.out.println("Day : "+(i+1));

			gameStatus();
			
			while(true) {
			
				int playStatus = random.nextInt(2,9) % 2;
				
				if(playStatus == LOOSE) {
					looseCount++;
				}else{
					winCount++;			
				}
							
				if(looseCount == DAILY_STAKE / 2 || winCount == DAILY_STAKE / 2) {
					break;
				}
			}
			
			loosingAmount[i] = looseCount;
			winningAmount[i] = winCount;

			displayTotal(i);
			System.out.println("\n--------------------------");
		}	
	}
	
	public static void displayTotal(int i) {

		int total;

		total = DAILY_STAKE + (winningAmount[i] - loosingAmount[i]);
		
		System.out.println("Total Winning in the day : "+winningAmount[i]);
		System.out.println("Total lossing in the day : "+loosingAmount[i]);
		System.out.println("Available stake at the end of the day : "+total);
		
		if (total > DAILY_STAKE) {
			System.out.println("Win by "+(total - DAILY_STAKE));
		}else {
			System.out.println("Loose by "+(DAILY_STAKE - total));
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to program of Gambling Simulation of Ajay Patel");

		gamePlay();

	}

}
