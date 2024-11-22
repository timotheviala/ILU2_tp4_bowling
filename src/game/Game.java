package game;

public class Game {
	private int[] tableauScore=new int[20];
	private int tour=0;
	
	private boolean spareBefore() {
		return tableauScore[tour-1]+tableauScore[tour-2]==10;
	}
	
	void roll(int points) {
		tableauScore[tour]=points;
		if(tour>1 && tour%2==0 && this.spareBefore()) {
			tableauScore[tour-1]+=points;
		}
		tour++;
	}
	
	int score() {
		int scoreTotal=0;
		for(int i=0;i<20;i++) {
			scoreTotal+=tableauScore[i];
		}
		return scoreTotal;
	}
	
	
}
