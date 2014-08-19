/**
 * 
 */
package de.cevasoft.gamelib;

import java.awt.Dimension;

import javax.swing.JFrame;

/**
 * @author letsprogram
 *
 *         Creates a Frame with default values
 * 
 */
public class Window extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * @param width
	 * Width in points
	 * @param height
	 * Height in points
	 * @param scale
	 * Square pixels per point
	 */
	public Window(int width, int height, int scale) {
		super();
		this.setMaximumSize(new Dimension(width * scale, height * scale));
		this.setMinimumSize(new Dimension(width * scale, height * scale));
		this.setPreferredSize(new Dimension(width * scale, height * scale));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public Window(int width, int height) {
		super();
		this.setMaximumSize(new Dimension(width, height));
		this.setMinimumSize(new Dimension(width, height));
		this.setPreferredSize(new Dimension(width, height));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
