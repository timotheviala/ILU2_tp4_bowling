package game;

public class Game {
	private int score;
	
	void roll(int points) {
		score+=points;
	}
	int score() {
		return score;
	}
}
