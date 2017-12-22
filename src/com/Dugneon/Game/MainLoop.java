package com.Dugneon.Game;

public class MainLoop {

	public static void main(String[] args) {
		MapHandler Map = new MapHandler();
		GraphicsEngine GraphicsEngine = new GraphicsEngine();
	
		Map.generateNewMap();
		GraphicsEngine.init(800, 600);
		//GraphicsEngine.paint(null);
		
		

	}
	
	

}
