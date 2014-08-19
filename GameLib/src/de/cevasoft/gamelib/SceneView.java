package de.cevasoft.gamelib;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

public class SceneView extends Canvas {

	private static final long serialVersionUID = 1L;

	private BufferedImage sceneView;
	private int width, height, scale;
	public int[] pixels;
	
	public SceneView(int width, int height, int scale){
		this.width = width;
		this.height = height;
		this.scale = scale;
		sceneView = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		pixels = ((DataBufferInt) sceneView.getRaster().getDataBuffer()).getData();
		SpriteFrame testFrame = new SpriteFrame(spriteSheet, 0, 0);
	}
	
	public void draw (){
		BufferStrategy bs = null;
		bs = getBufferStrategy();
		if (bs == null){
			createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();
		g.drawImage(sceneView, 0, 0, width * scale, height * scale, null);
		g.dispose();
		bs.show();
	}
	
}
