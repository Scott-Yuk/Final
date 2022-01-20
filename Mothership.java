import java.util.Random;

public class Mothership {

	static private EZImage MothershipPicture;
	static private int MSpeed = 5;
	static private int number = 0;

	public Mothership(String filename, int MSX, int MSY) {
		MothershipPicture = EZ.addImage(filename, MSX, MSY);
	}
	static public void randomNumber() {
		Random randomNumber = new Random();
		number = randomNumber.nextInt(50);
	}

	static public int get() {
		return number;
	}
	
	static public int get2X() {
		return MothershipPicture.getXCenter();
	}

	static public int get2Y() {
		return MothershipPicture.getYCenter();
	}

	static public void move() {
		randomNumber();
		if (get2Y() <= 0 || get2Y() >= 500) {
			MSpeed *= -1;
		}
		MothershipPicture.translateBy(0, MSpeed);
	}

}
