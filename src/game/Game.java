package game;

public class Game {
	private int[] tableauScore=new int[20];
	private int tour=0;
	
	private boolean spareBefore() {
		return tour%2==0 && (tableauScore[tour-1]+tableauScore[tour-2]==10) && tableauScore[tour-2]!=10;
	}
	
	private boolean strikeBefore() {
		return tour%2!=0 && tableauScore[tour-3]==10;
	}
	
	private boolean beforeLastTour() {
		return tour==18;
	}
	
	private boolean lastTour() {
		return tour==19;
	}
	
	void roll(int points) {
		tableauScore[tour]+=points;
		if(tour>1) {
			if(spareBefore()) {
				tableauScore[tour-1]+=points;
			}else if(strikeBefore()) {
				tableauScore[tour-3]+=tableauScore[tour]+tableauScore[tour-1];
			}
		}
		if(points==10 && tour%2==0 && !beforeLastTour()) {
			tour++;
		}
		if(lastTour() && tableauScore[tour]+tableauScore[tour-1]==10) {
			tour--;
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
