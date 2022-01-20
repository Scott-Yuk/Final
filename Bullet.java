
public class Bullet {

	private EZImage bullets; // gives a name 
	private int x, y; // declares x and y points
	static final int BULLETS = 10; // speed of bullets 


	public Bullet(String filename, int posx, int posy) { // defines how to input bullet class 
		bullets = EZ.addImage(filename, posx, posy); // defines how to import picture and points
		x = posx; // defines x to posx
		y = posy; // defines y to posy

	}

	public void setPosition(int posx, int posy) { // defines for setPosition
		x = posx;
		y = posy;
		setbulletsImagePosition(x, y); // sets the bullet to this position
	}

	private void setbulletsImagePosition(int posx, int posy) { 
		bullets.translateTo(posx, posy); // translate bullets to x and y points
	}

	public void HitIt(int x) { // defines HitIt
		bullets.translateBy(x, 0); //bullets translate along the x-axis
	}


	
}
