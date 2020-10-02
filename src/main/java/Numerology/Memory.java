package numerology;

public class Memory {
	static int threesReplaced = 0;
	static int foursReplaced = 0;
	
	static boolean lastThree = false;
	static boolean lastFour = false;
	
	public static boolean isLastThree() {
		return lastThree;
	}
	public static void setLastThree(boolean lastThree) {
		Memory.lastThree = lastThree;
	}
	public static boolean isLastFour() {
		return lastFour;
	}
	public static void setLastFour(boolean lastFour) {
		Memory.lastFour = lastFour;
	}
	public static int getThreesReplaced() {
		return threesReplaced;
	}
	public static void incrementThreesReplaced() {
		Memory.threesReplaced++;
	}
	public static void resetThreesReplaced() {
		Memory.threesReplaced = 0;
	}
	public static int getFoursReplaced() {
		return foursReplaced;
	}
	public static void incrementFoursReplaced() {
		Memory.foursReplaced++;
	}
	public static void resetFoursReplaced() {
		Memory.foursReplaced = 0;
	}
	
	
	
}
