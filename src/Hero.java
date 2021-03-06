
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Hero extends MoveObject {
	private int stopLocation;
	public Hero(int x, int y, int xVelo, int yVelo, int width, int height,int stopLocation) {
		super(x, y, xVelo, yVelo, width, height);
		this.stopLocation = stopLocation;
		super.setImages(getimage());
		super.changeImage();
	}

	public void update() {
		super.update();
		action();
	}
	private Image[] getimage() {
		Image[] images = new Image[16];
		for (int i = 0; i < images.length; i++) {
			try {
				//images[i] = ImageIO.read(new File("things/hero1.png"));
				images[i] = ImageIO.read(ResourceLoader.load("hero1.png"));
			} catch (IOException e) {
			}
		}
		return images;
	}

	private void action() {
		if (super.getX() > stopLocation) {
			super.setxVelo(0);
		}
	}

}
