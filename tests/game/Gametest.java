package game;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Gametest {
	Game game;
	
	@BeforeEach
	void init() {
		game=new Game();
	}
	@Test
	void testAucunLancer() {
		assertEquals(game.score(),0);
	}
	
	@Test
	void testLancersNul() {
		for(int i=0;i<20;i++) {
			game.roll(0);
		}
		assertEquals(game.score(), 0);
	}
}
