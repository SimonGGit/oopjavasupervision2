package uk.ac.cam.stjg2.oopjava.supervision2;

public class ScoreBoard {
	private int gamesPlayed;
	private int gamesWon;
	
	public ScoreBoard() {
		gamesPlayed = 0;
		gamesWon = 0;
	}
	
	public int getGamesPlayed() {
		return gamesPlayed;
	}
	
	public int getGamesWon() {
		return gamesWon;
	}
	
	public void setGamesPlayed(int gp) {
		gamesPlayed = gp;
	}
	
	public void setGamesWon(int gw) {
		gamesWon = gw;
	}
	
	@Override
	public String toString() {
		String p = gamesPlayed > 0 ? String.valueOf(gamesWon * 100 / gamesPlayed) : "N/A";
		return "Game Stats:\nGames Played:\t" + gamesPlayed + "\nGames Won:\t" + gamesWon + "\nGames Lost:\t" + (gamesPlayed - gamesWon) + "\nPercentage Won:\t" + p; 
	}
}
