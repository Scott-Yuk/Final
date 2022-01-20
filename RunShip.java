import java.awt.Color;
import java.util.ArrayList;

public class RunShip {

	public static void main(String[] args) {
		EZ.initialize(900, 500);
		EZ.setBackgroundColor(new Color(200, 200, 200));
		ArrayList<Bullet> bullet2 = new ArrayList <> ();
		
		new Mothership("ShipSS.png", 830, 100);
		while (true) {
			Mothership.move();
			if (Mothership.get() == 1) {
				Bullet myBullets = new Bullet("sprites.png",Mothership.get2X(),Mothership.get2Y()); // transfer the spaceship points to the bullet
				bullet2.add(myBullets); // add bullet each time space bar is pressed
			}
			for (int i = 0; i<bullet2.size(); i++) { // for each bullet is less than the size of array list, add one bullet.
				bullet2.get(i).HitIt(-5);
			}
			EZ.refreshScreen();
		}
	}
}