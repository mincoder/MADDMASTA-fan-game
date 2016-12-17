package maddmastafangame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class game extends JPanel implements KeyListener, ActionListener {
	static level lv = new level();
	static int levelcount=1;
	static player p=new player(60,400);
	Timer tim = new Timer(30,this);
	entity[] entities = new entity[15];
	public game() {
		tim.start();
		lv.loadlv(1);
	}
	
	
	
	public void paint(Graphics g) {
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if(lv.block[i][j].id==0) {
				      g.setColor(Color.WHITE);
				} else if(lv.block[i][j].id==1) {
					  g.setColor(Color.BLACK);
				} else if(lv.block[i][j].id==2){
					  g.setColor(Color.ORANGE);
				} else if(lv.block[i][j].id==3){
					  g.setColor(Color.RED);
				}
				g.fillRect(lv.block[i][j].x, lv.block[i][j].y, 50, 50);
				g.setColor(Color.BLACK);
				//g.drawRect(level[i][j].x, level[i][j].y, 50, 50);
			
			}
		}
		g.setColor(new Color(0,100,155));
		g.fillRect(p.x, p.y, 50, 50);
		g.setColor(Color.RED);
		for(int i=0;i<15;i++) {
			lv.entities[i].draw(g);
			if(p.intersects(lv.entities[i])) {
				p=new player(60,400);
			}
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==e.VK_LEFT) {
			p.xspeed=-4;
		} else if(e.getKeyCode()==e.VK_RIGHT) {
			p.xspeed=4;
		} else if(e.getKeyCode()==e.VK_SPACE) {
			if(p.stand) {
				p.jumptime=24;
			}
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode()==e.VK_LEFT) {
			p.xspeed=0;
		} else if(e.getKeyCode()==e.VK_RIGHT) {
			p.xspeed=0;
		} else if(e.getKeyCode()==e.VK_SPACE) {
			p.yspeed=0;
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		p.update(lv.block);
		for(int i=0;i<15;i++) {
			lv.entities[i].update();
		}
		repaint();
	}
}
