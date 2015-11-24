package uk.ac.cam.stjg2.oopjava.supervision2;

public class Player {
	private String name;
	private ScoreBoard sb;
	
	public Player(String n) {
		name = n;
		sb = new ScoreBoard();
	}
	
	public void gamePlayed(int res) {
		sb.setGamesPlayed(sb.getGamesPlayed() + 1);
		if (res == 1) {
			sb.setGamesWon(sb.getGamesWon() + 1);
		}
	}
	
	@Override
	public String toString() {
		return "Name:\t" + name + "\n" + sb;
	}
	
	
}
