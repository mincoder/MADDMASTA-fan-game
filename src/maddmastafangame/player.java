package maddmastafangame;

import java.awt.Rectangle;

public class player extends Rectangle{
	int xspeed=0;
	double yspeed=0;
	boolean stand=false;
	int jumptime=0;
	public void update(Block[][] level) {
		stand=false;
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if(level[i][j].id==1) {
				if(this.intersects(level[i][j])) {
					if(y+50>level[i][j].y&&!(y+50>level[i][j].y&&y-50<level[i][j].y)) {
						stand=true;
					} else {
						if(y>level[i][j].y+50&&(x>level[i][j].x-50&&x<level[i][j].x+50)) {
							jumptime=0;
							yspeed=1;
							y=level[i][j].y+50;
						} else if((x+50<level[i][j].x)) {
							x=level[i][j].x-50;
						} else if((x>level[i][j].x+50)) {
							x=level[i][j].x+50;
						}
					}
				}
				} else if(level[i][j].id==3) {
					if(this.intersects(level[i][j]))
					game.p = new player(60,400);
				}
			}
		}
		if(jumptime>0) {
			if(jumptime>10) {
				yspeed=-6;
				jumptime--;
			} else if(jumptime>=5){
				yspeed=-4;
				jumptime--;
			} else if(jumptime<5) {
				yspeed=-2;
				jumptime--;
			}
		}
		if(stand==false) {
			if(jumptime==0) {
				if(yspeed<=6) {
					yspeed+=1;
				}
			}
		} else {
			yspeed=0;
		}
		x+=xspeed;
		y+=(int)yspeed;
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if(level[i][j].id==1) {
				if(this.intersects(level[i][j])) {
					if(y+50>level[i][j].y&&!(y+40>level[i][j].y&&y-50<level[i][j].y)) {
						y=level[i][j].y-50;
						yspeed=1;
						stand=true;
					} else {
						if(y>level[i][j].y+44&&(x>=level[i][j].x-50&&x<=level[i][j].x+50)) {
							jumptime=0;
							y=level[i][j].y+50;
						} else if((x+50<level[i][j].x+50)) {
							x=level[i][j].x-50;
						} else if((x>level[i][j].x)) {
							x=level[i][j].x+50;
						}
					}
				}
				} else if(level[i][j].id==2) {
					if(this.intersects(level[i][j])) {
					game.levelcount++;
					game.lv.loadlv(game.levelcount);
					}
				} else if(level[i][j].id==3) {
					if(this.intersects(level[i][j]))
					game.p = new player(60,400);
				}
			}
		}
	}
	public player(int a,int b) {
		width=50;
		height=50;
		x=a;
		y=b;
	}
}
