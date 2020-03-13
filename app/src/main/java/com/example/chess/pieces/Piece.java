package com.example.chess.pieces;
import android.view.View;

import com.example.chess.game.*;


import java.util.ArrayList;

public abstract class Piece {
	public static final boolean WHITE = true, BLACK = false;
	protected boolean color;
	protected int value;
	private int firstPositionX=0;
	private int firstPositionY=0;
//	public ImageIcon imageIcon;
	public View view;
	public boolean getColor() {
		return color;
	}

	public Piece(boolean color) {
		this.color = color;
		value = 0;
	}
	
	public int getValue() {
		return value;
	}
	
	public abstract Piece clone();
	
	public abstract ArrayList<Move> getMoves(Board b, int x, int y);
	public abstract ArrayList<Move> getOpenFire(Board b,int x,int y);

	static public boolean valid(int x, int y) {
		if(x < 0 || x > 7 || y < 0 || y > 7)
			return false;
		else
			return true;
	}
	public void makeMove(Move move) {
		firstPositionX+=(move.getX2()-move.getX1())*134;
		firstPositionY+=(move.getY2()-move.getY1())*134;
		view.setTranslationX(firstPositionX);
		view.setTranslationY(firstPositionY);
	}
	public void hide(){
		view.setAlpha(0);
	}
}
