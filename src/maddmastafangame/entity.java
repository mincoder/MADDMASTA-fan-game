package maddmastafangame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class entity extends Rectangle{
	int id;
	int ox;
	int oy;
	int tx;
	int ty;
	boolean toTarg=true;
	boolean targ;
	public entity(int a, int b,int ta, int tb) {
		id=0;
		ox=a;
		oy=b;
		x=a;
		y=b;
		tx=ta;
		ty=tb;
		width=50;
		height=50;
		targ=true;
	}
	
	public entity(int a, int b, int s) {
		x=a;
		y=b;
		width=50;
		height=50;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(x, y, 50, 50);
	}
	
	public void update() {
		if(toTarg&&targ) {
			if(x>tx) {
				x-=2;
			} else if(x<tx){
				x+=2;
			}
			if(y>ty) {
				y-=2;
			} else if(y<ty) {
				y+=2;
			}
			if(x==tx&&y==ty) {
				toTarg=false;
			}
		} else if(targ){
			if(x>ox) {
				x-=2;
			} else if(x<ox){
				x+=2;
			}
			if(y>oy) {
				y-=2;
			} else if(y<oy) {
				y+=2;
			}
			if(x==ox&&y==oy) {
				toTarg=true;
			}
		}
	}
	
}
