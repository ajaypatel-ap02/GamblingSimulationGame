package gamblingSimulationGame;

public class GamblingSimulationGame {
	private static final int EVERYDAY_STAKE = 100;
	private static final int EVERY_GAME_BET = 1;
	
	public static void gameStatus() {
		
		System.out.println("Stake available for the day : "+EVERYDAY_STAKE);
		System.out.println("Bet for every game : "+EVERY_GAME_BET);
	
	}
	public static void main(String[] args) {
		System.out.println("Welcome to program of Gambling Simulation of Ajay Patel");
		
		gameStatus();
	}

}
