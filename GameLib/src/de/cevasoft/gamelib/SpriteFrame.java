package de.cevasoft.gamelib;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class SpriteFrame {

	private BufferedImage image;
	private int[] pixels;

	private int width;
	private int height;
	private SpriteSheet sheet;

	public SpriteFrame(SpriteSheet sheet, int tileX, int tileY) {
		int[] pixels = sheet.getTile(tileX, tileY);
		for (int i = 0; i < pixels.length; i++) {
			System.out.println(Integer.toHexString(pixels[i]));
		}
	}
	
	public void draw(Graphics g){
		g.drawImage(image, 0, 0, width, height, null);
	}
	
}
