package gamblingSimulationGame;

import java.util.Random;


public class GamblingSimulationGame {
	private static final int DAILYSTAKE = 100;
	private static final int EVERY_GAME_BET = 1;
	private static final int WIN = 1;
	private static final int LOOSE = 0;
	private static final int DAYS_PLAYING = 20;

	private static int[] winningAmount = new int[20]; 
	private static int[] loosingAmount = new int[20];
	public static void gameStatus() {
		
		System.out.println("Stake available for start of the day : "+DAILYSTAKE);
		System.out.println("Bet for every game : "+EVERY_GAME_BET);
		System.out.println("--------------------------\n");
		
	}
	
	public static void gamePlay() {

		Random random = new Random();

		for(int i = 0; i < DAYS_PLAYING; i++) {

			gameStatus();
			
			int winStake = 0 ;
			int looseStake = 0;
			
			System.out.println("Day : "+(i+1));
			
			while(true) {
			
				int playStatus = random.nextInt(9) % 2;
				
				if(playStatus != WIN) {
					looseStake++;
				}else{
					winStake++;			
				}
				
				loosingAmount[i] += looseStake;
				winningAmount[i] += winStake;
				
				
				if(looseStake == DAILYSTAKE / 2 || winStake == DAILYSTAKE / 2) {
					break;
				}
			}
			
			System.out.println("Winnings for day "+(i+1)+" : "+winningAmount[i]);
			System.out.println("loosings for day "+(i+1)+" : "+loosingAmount[i]);
		}	
		
	}
	public static void total_Winning() {
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to program of Gambling Simulation of Ajay Patel");

		gamePlay();

	}

}
