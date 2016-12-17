package maddmastafangame;

import java.awt.Rectangle;

public class Block extends Rectangle{
	public int id=0;
	public static final int AIR=0;
	public static final int SOLID=1;
	public static final int GOLD=2;
	public Block(int a,int b,int type) {
		width=50;
		height=50;
		id=type;
		x=a;
		y=b;
	}
}
