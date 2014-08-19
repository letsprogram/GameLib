package de.cevasoft.gamelib;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpriteSheet {

	private BufferedImage image;
	private int[] pixels;

	private int tileSize, width;

	public SpriteSheet(int tileSize) {
		this.tileSize = tileSize;
		try {
			image = ImageIO.read(SpriteSheet.class.getResource("/TestSpriteSheet.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		pixels = image.getRGB(0, 0, image.getWidth(), image.getHeight(), null, 0, image.getWidth());
		width = image.getWidth();
	}

	public int[] getTile(int column, int row) {
		int[] tilePixels = new int[tileSize * tileSize];
		int findRow = row * width * tileSize;
		int findColumn = column * tileSize;
		for (int i = 0; i < tileSize * tileSize; i++) {
			tilePixels[i] = pixels[findRow + findColumn + (i % tileSize) * findColumn + i];
		}
		return tilePixels;
	}

}
