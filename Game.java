package uk.ac.cam.stjg2.oopjava.supervision2;
import java.util.Scanner;

public class Game {
	private Configuration c;
	private Player p;
	
	public Game(String n, int d) {
		c = new Configuration(d);
		p = new Player(n);
	}
	
	public Game(Game prev) {
		this.p = prev.p;
		this.c = prev.c;
	}
	
	public void setConfiguration(Configuration next) {
		c = next;
	}
	
	public void start(Scanner in) {
		int guesses = c.getMaxGuesses();
		int toGuess = (int) (Math.random() * c.getMaxValue());
		int cur = -1;
		
		System.out.println("The game has now begun, you have " + guesses +  " guesses to get to the correct answer.");
		System.out.println("Know that in theory it is always possible to get to the correct answer...");
		
		while (guesses > 0) {
			try {
				cur = Integer.parseInt(in.nextLine());
				if (cur < 0) {
					System.out.println("Please enter a valid guess");
				} else {
					guesses--;
					if (cur < toGuess) {
						System.out.println("Go Higher");
					} else if (cur > toGuess){
						System.out.println("Go Lower");
					} else {
						break;
					}
					
				}
			} catch (NumberFormatException e) {
				System.out.println("Please enter a valid guess");
			}
		}
		if (guesses > 0) {
			System.out.println("Very well done, you succeeded to guess the number " + toGuess + " and you had " + guesses + " guesses to spare");
			p.gamePlayed(1);
		} else if (cur == toGuess) {
			System.out.println("That was close, you had no guesses left, but you made it. Well done!");
			p.gamePlayed(1);
		} else {
			System.out.println("Alas, you did not manage to guess the number " + toGuess + " in " + c.getMaxGuesses() + " guesses.");
			p.gamePlayed(0);
		}
	}
	
	@Override
	public String toString() {
		return p.toString();
	}
}
