package gamblingSimulationGame;

import java.util.Random;

public class GamblingSimulationGame {
	private static final int EVERYDAY_STAKE = 100;
	private static final int EVERY_GAME_BET = 1;
	private static final int WIN = 1;
	private static final int LOOSE = 0;

	static int winStack = 0;
	static int looseStack = 0;
	
	
	public static void gameStatus() {
		
		System.out.println("Stake available for the day : "+EVERYDAY_STAKE);
		System.out.println("Bet for every game : "+EVERY_GAME_BET);
		System.out.println("Winning stack : "+winStack);
		System.out.println("Loossing stack : "+looseStack);
		System.out.println("----------------------------------------------------------");
	}
	
	public static void gamePlay() {

		Random random = new Random();
		
		gameStatus();
		
		int playStatus = random.nextInt(9) % 2;
		
		if(playStatus == LOOSE) {
			looseStack++;
		}else{
			winStack++;			
		}
			
		gameStatus();
		
	}
	public static void main(String[] args) {
		System.out.println("Welcome to program of Gambling Simulation of Ajay Patel");

		gamePlay();

	}

}
