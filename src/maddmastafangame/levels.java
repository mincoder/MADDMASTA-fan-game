package maddmastafangame;

public class levels {
	public static Block[][] getLevel1() {
		Block[][] l = new Block[10][10];
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				l[i][j] = new Block(i*50,j*50,0);
			}
		}
		l=getBox(l);
		l[9][7]=new Block(9*50,7*50,1);
		l[8][7]=new Block(8*50,7*50,1);
		l[7][7]=new Block(7*50,7*50,1);
		l[6][7]=new Block(6*50,7*50,1);
		l[5][7]=new Block(5*50,7*50,1);
		l[5][8]=new Block(5*50,8*50,1);
		l[5][9]=new Block(5*50,9*50,1);
		l[8][6]=new Block(8*50,6*50,2);
		return l;
	}
	
	public static Block[][] getLevel2() {
		Block[][] l = new Block[10][10];
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				l[i][j] = new Block(i*50,j*50,0);
			}
		}
		l=getBox(l);
		l[7][7]=new Block(7*50,7*50,1);
		l[4][5]=new Block(4*50,5*50,1);
		l[4][4]=new Block(4*50,4*50,2);
		return l;
	}
	
	public static Block[][] getLevel3() {
		Block[][] l = new Block[10][10];
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				l[i][j] = new Block(i*50,j*50,0);
			}
		}
		l=getBox(l);
		l[5][9]=new Block(5*50,9*50,3);
		l[6][9]=new Block(6*50,9*50,3);
		l[7][9]=new Block(7*50,9*50,3);
		l[8][8]=new Block(8*50,8*50,2);
		return l;
	}
	
	public static Block[][] getLevel6() {
		Block[][] l = new Block[10][10];
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				l[i][j] = new Block(i*50,j*50,0);
			}
		}
		l=getBox(l);
		l[3][8]=new Block(3*50,8*50,3);
		l[1][4]=new Block(1*50,4*50,1);
		l[2][4]=new Block(2*50,4*50,1);
		l[3][4]=new Block(3*50,4*50,1);
		l[2][3]=new Block(2*50,3*50,3);
		l[1][3]=new Block(1*50,3*50,2);
		l[7][8]=new Block(7*50,8*50,1);
		l[5][6]=new Block(5*50,6*50,1);
		
		return l;
	}
	
	public static Block[][] getLevel7() {
		Block[][] l = new Block[10][10];
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				l[i][j] = new Block(i*50,j*50,0);
			}
		}
		l=getBox(l);
		l[3][7]=new Block(3*50,7*50,1);
		l[5][6]=new Block(5*50,6*50,1);
		l[6][4]=new Block(6*50,4*50,1);
		l[6][4]=new Block(6*50,4*50,1);
		l[3][3]=new Block(3*50,3*50,1);
		l[4][3]=new Block(4*50,3*50,3);
		l[2][3]=new Block(2*50,3*50,1);
		l[1][3]=new Block(1*50,3*50,1);
		l[1][2]=new Block(1*50,2*50,2);
		
		return l;
	}
	
	
	public static Block[][] getBox(Block[][] l) {
		for(int i=0;i<10;i++) {
			l[9][i] = new Block(450,i*50,1);
		}
		for(int i=0;i<10;i++) {
			l[0][i] = new Block(0,i*50,1);
		}
		for(int i=0;i<10;i++) {
			l[i][0] = new Block(i*50,0,1);
		}
		for(int i=0;i<10;i++) {
			l[i][9] = new Block(50*i,450,1);
		}
		return l;
	}
}
