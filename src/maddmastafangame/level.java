package maddmastafangame;

public class level {
	entity[] entities = new entity[15];
	Block[][] block = new Block[10][10];
	public void loadlv(int lv) {
		for(int i=0;i<15;i++) {
			entities[i]=new entity(600,600,0);
		}
		//lv=9;
		if(lv==1) {
			block=levels.getLevel1();
			game.p = new player(60,400);
		} else if(lv==2){
			block=levels.getLevel2();
			game.p = new player(60,400);
		} else if(lv==3){
			block=levels.getLevel3();
			game.p = new player(60,400);
		} else if(lv==4) {
			block=levels.getLevel1();
			game.p = new player(60,400);
			entities[0]=new entity(275,200,275,400);
		} else if(lv==5) {
			block=levels.getLevel2();
			game.p = new player(60,400);
			entities[0]=new entity(275,100,275,300);
		} else if(lv==6) {
			block=levels.getLevel6();
			game.p = new player(60,400);
		} else if(lv==7) {
			block=levels.getLevel7();
			game.p = new player(60,400);
		} else if(lv==8) {
			block=levels.getLevel6();
			game.p = new player(60,400);
			entities[0]=new entity(200,150,200,400);
		} else if(lv==9) {
			Block[][] l = new Block[10][10];
			for(int i=0;i<10;i++) {
				for(int j=0;j<10;j++) {
					l[i][j]=new Block(i*50,j*50,0);
				}
			}
			block=levels.getBox(l);
			game.p = new player(50,400);
			entities[5]=new entity(100,300,100,400);
			entities[0]=new entity(150,300,150,400);
			entities[1]=new entity(200,250,200,350);
			entities[2]=new entity(250,250,250,350);
			entities[3]=new entity(300,300,300,400);
			entities[4]=new entity(350,300,350,400);
			block[8][8]=new Block(400,400,2);
		}
	}
}
