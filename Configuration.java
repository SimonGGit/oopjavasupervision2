package uk.ac.cam.stjg2.oopjava.supervision2;

public class Configuration {
	private int maxGuesses;
	private int maxValue;
	
	public Configuration(int d) {
		maxValue = (int) Math.pow(2.0, (double) d);
		maxGuesses = (int) (Math.log((double) maxValue) / Math.log(2.0));
	}
	
	public int getMaxGuesses() {
		return maxGuesses;
	}
	
	public int getMaxValue() {
		return maxValue;
	}
}
