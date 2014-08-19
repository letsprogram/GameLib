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
		int tick = 0, frames = 0;
		long lastTime = System.currentTimeMillis();
		
		// Game loop
		while(running)
		{
			// FPS Counter			
			tick++;
			frames++;
			long now = System.currentTimeMillis();
			if(now - lastTime >= 1000){
				System.out.println(frames);
				lastTime = now;
				frames = 0;
			}
			
			// TODO: Temporary FPS controller needs to be automated
			try {
				Thread.sleep(12);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			for(int i = 0; i < 320 * 200; i++){
				sceneView.pixels[i] = i + tick;
			}
			sceneView.draw();
		}
	}

}
