package de.cevasoft.gamelib;

/**
 * Example class for GameLib projects
 *
 */
public class GameLib {

	public static boolean running = false;
	
	public static void main(String[] args) {
		running = true;
		Window window = new Window(0, 200, 2);
		window.setVisible(true);
		while(running)
		{
			
		}
	}

}
