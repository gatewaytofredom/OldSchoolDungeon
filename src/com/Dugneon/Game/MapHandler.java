package com.Dugneon.Game;

import java.util.ArrayList;

import com.Dugneon.Game.Room.wallType;

public class MapHandler {
	
	int MapX = 10;
	int MapY = 10;
	
	
	
	Room[][] Map = new Room[MapY][MapX];{
	
	//Now to generate the map
	
	//loop through the MapY
	for (int i=0; i<MapY; i++) {
		
		//loop through the MapX
		for (int j=0; j<MapX; j++) {
			//if area is north or south map edge, generate a room with all walls
			if (i==0 || i==MapY) {
				Map[i][j] = new Room();
				Map[i][j].setWallTypes(wallType.Brick, wallType.Brick, wallType.Brick, wallType.Brick);
				
				
			}
			
			
		}
		
		
	}
	

	
	
	
}
}

