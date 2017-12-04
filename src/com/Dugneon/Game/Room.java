package com.Dugneon.Game;

import java.util.ArrayList;

public class Room {

	boolean hasPlayer;
	ArrayList enemies = new ArrayList();
	
	ArrayList items = new ArrayList();
	
	public enum wallType{
		MossyWall,
		BrickWall,
		CleanWall,
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

	
	
	public void setWallTypes(wallType left, wallType right, wallType north, wallType south ) {
	    leftWall = left;
	    leftWall = right;
	    leftWall = north;
	    leftWall = south;
	}
	
	public void addEnemy(Enemy enemy) {
		//ToDo figure out what data to add
		//to the enemy Arraylist
	}
	
	
	
}





