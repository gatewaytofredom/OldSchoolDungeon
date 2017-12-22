package com.Dugneon.Game;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.lang.reflect.Array;

import javax.swing.JPanel;

public class GraphicsEngine extends JPanel{ 
	int x=0;
	int y=0;
	private void moveBall() {
		x = x + 1;
		y = y + 1;
	}
	
	public void init(int winX, int winY) {
		
		JFrame GameWindow = new JFrame("DungeonGame");
		
		GameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		 GameWindow.setSize(winX, winY);
		// GameWindow.add(GameWindow);
		Component emptyLabel = null;
		//GameWindow.getContentPane().add(emptyLabel, BorderLayout.CENTER);
		
		GameWindow.getContentPane().add(new GraphicsEngine());
		
		GameWindow.setVisible(true);
		
	}
	
	
	public void paint(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		g2d.fillOval(x, y, 30, 30);	
	}
	
	public void UpdateRenderMap(){
		
	}
	
}

