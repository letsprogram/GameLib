package de.cevasoft.gamelib;

/**
 * Example class for GameLib projects
 *
 */
public class GameLib {

	public static boolean running = false;
	
	public static void main(String[] args) {
		running = true;
		
		SceneView sceneView = new SceneView(320, 200);
		
		Window window = new Window(320, 200);
		window.add(sceneView);
		window.setVisible(true);
		int tick = 0;
		while(running)
		{
			tick++;
			for(int i = 0; i < 320 * 200; i++){
				sceneView.pixels[i] = i + tick;
			}
			sceneView.draw();
		}
	}

}
