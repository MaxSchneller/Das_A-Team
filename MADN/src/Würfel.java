
public class Würfel {
	public static int wuerfeln(){
		int random = (int) (6 * Math.random()) + 1;
		System.out.println("Es wurde die Zahl: " + random + " gewürfelt!");
		return random;
	}
}
