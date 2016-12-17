package maddmastafangame;

import javax.swing.JFrame;

public class maingame {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500,500);
		game g = new game();
		f.add(g);
		f.setResizable(false);
		f.setTitle("MADDMASTA fan game");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.addKeyListener(g);
		f.setFocusable(true);
	}
}
