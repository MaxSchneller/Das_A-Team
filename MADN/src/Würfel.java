
public class Würfel {
	
	/*
	 * @param random 
	 * gibt Würfelzahl zwischen 1 und 6 zurück
	 */
	public static int wuerfeln(){
		int random = (int) (6 * Math.random()) + 1;
		System.out.println("Es wurde die Zahl: " + random + " gewürfelt!");
		return random;
	}
}
