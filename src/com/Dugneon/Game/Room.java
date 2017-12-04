package com.Dugneon.Game;

import java.util.ArrayList;

public class Room {

	boolean hasPlayer;
	ArrayList enemies = new ArrayList();
	
	ArrayList items = new ArrayList();
	
	public enum wallType{
		Mossy,
		Brick,
		Clean,
		IronGate
	}
	
	public enum Lighting{
		Bright,
		Dim,
		Dark,
		Pitch
	}
	
	wallType leftWall;
	wallType rightWall;
	wallType northWall;
	wallType southWall;

	
	
	public Room setWallTypes(wallType left, wallType right, wallType north, wallType south ) {
	    leftWall = left;
	    rightWall = right;
	    northWall = north;
	    southWall = south;
		return null;
	}
	
	

	
	
	
/*	public void addEnemy(Enemy enemy) {
*		//ToDo figure out what data to add
*		//to the enemy Arraylist
*	}
*/	
	
	
	
	
}





