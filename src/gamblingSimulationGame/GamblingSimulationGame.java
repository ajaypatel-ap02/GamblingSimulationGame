package gamblingSimulationGame;

import java.util.Random;


public class GamblingSimulationGame {
	private static final int EVERYDAY_STAKE = 100;
	private static final int EVERY_GAME_BET = 1;
	private static final int WIN = 1;
	private static final int LOOSE = 0;
	private static final int DAYS_PLAYING = 20;


	
	
	public static void gameStatus(int winStake,int looseStake) {
		
		System.out.println("Stake available for the day : "+EVERYDAY_STAKE);
		System.out.println("Bet for every game : "+EVERY_GAME_BET);
		System.out.println("Winning stack : "+winStake);
		System.out.println("Loossing stack : "+looseStake);
		System.out.println("----------------------------------------------------------");
	}
	
	public static void gamePlay() {

		Random random = new Random();
		
		
//		gameStatus(winStake,looseStake);
		for(int i = 0; i < DAYS_PLAYING; i++) {
			int winStake = 0;
			int looseStake = 0;
			while(true) {
			
				int playStatus = random.nextInt(9) % 2;
				
				if(playStatus == LOOSE) {
					looseStake++;
				}else{
					winStake++;			
				}			
				
				if(looseStake == EVERYDAY_STAKE / 2) {
					break;
				}
				if (winStake == EVERYDAY_STAKE / 2) {
					break;
				}
			}
			System.out.println(i);
			gameStatus(winStake,looseStake);
			
		}			
	}
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to program of Gambling Simulation of Ajay Patel");

		gamePlay();

	}

}
