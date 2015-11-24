package uk.ac.cam.stjg2.oopjava.supervision2;
import java.util.Scanner;

public class PlayGame {

	public static void main(String[] args) {

		System.out.println("Welcome to the HiLow Guessing Game.");

		int difficulty = 0;
		String name = "";
		Scanner s = new Scanner(System.in);
		while (difficulty == 0) {
			try {
				System.out.println("Please enter your name:");
				name = s.nextLine();
				System.out.println("Please enter a positive integer as game difficulty:");
				difficulty = Integer.parseInt(s.nextLine());
				if (difficulty < 1) { difficulty = 0; }
			} catch (NumberFormatException e) {
				System.out.println("Please enter a valid integer.");
			}
		}
		Game g = new Game(name, difficulty);
		boolean anotherGame = true;
		
		while (anotherGame) {
			g.start(s);
			System.out.println("Your current stats are:");
			System.out.println(g);
			System.out.println("Do you want to play another game? (y/n)");
			if (!s.nextLine().equals("y")) {
				anotherGame = false;
			} else {
				System.out.println("Do you want to play the same difficulty? (y or a positive integer)");
				String sameDiff = s.nextLine();
				if (!sameDiff.equals("y")) {
					try {
						g.setConfiguration(new Configuration(Integer.parseInt(sameDiff)));
					} catch (NumberFormatException e) {
						System.out.println("Suit it yourself");
						break;
					}
				}
				g = new Game(g);
			}
		}
		
		System.out.println("Thank you for playing the HiLow Guessing Game. Your final stats were:");
		System.out.println(g);
		
	}

}
