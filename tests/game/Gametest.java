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
	
	@Test
	void testLancersUn() {
		for(int i=0;i<20;i++) {
			game.roll(1);
		}
		assertEquals(game.score(), 20);
	}
	
	@Test
	void testDifferentsLancers() {
		for(int i=0;i<10;i++) {
			game.roll(3);
		}
		for(int i=0;i<10;i++) {
			game.roll(7);
		}
		assertEquals(game.score(), 100);
	}
	
	@Test
	void testSpare() {
		game.roll(7);
		game.roll(3);
		game.roll(4);
		for(int i=0;i<17;i++) {
			game.roll(0);
		}
		assertEquals(game.score(), 18);
	}
	
	@Test
	void testStrike() {
		game.roll(10);
		game.roll(2);
		game.roll(5);
		for(int i=0;i<16;i++) {
			game.roll(0);
		}
		assertEquals(game.score(),24);
	}
	
	@Test
	void testRandomGame() {
		game.roll(1);
		game.roll(2);
		game.roll(10);
		game.roll(0);
		game.roll(10);
		game.roll(4);
		game.roll(2);
		game.roll(0);
		game.roll(10);
		game.roll(6);
		game.roll(2);
		game.roll(0);
		game.roll(10);
		game.roll(6);
		game.roll(4);
		game.roll(8);
		game.roll(2);
		game.roll(2);
		game.roll(7);
		assertEquals(game.score(), 122);
	}
}
