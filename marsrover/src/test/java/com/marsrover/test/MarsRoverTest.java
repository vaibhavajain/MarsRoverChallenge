package com.marsrover.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.marsrover.entity.MarsRover;

public class MarsRoverTest {

	@Test
	public void testTurnLeft() {
		MarsRover rover = new MarsRover(0, 0, 'N');
		rover.turnLeft();
		assertEquals('W', rover.getDirection());

		rover = new MarsRover(0, 0, 'E');
		rover.turnLeft();
		assertEquals('N', rover.getDirection());

		rover = new MarsRover(0, 0, 'S');
		rover.turnLeft();
		assertEquals('E', rover.getDirection());

		rover = new MarsRover(0, 0, 'W');
		rover.turnLeft();
		assertEquals('S', rover.getDirection());
	}

	@Test
	public void testTurnRight() {
		MarsRover rover = new MarsRover(0, 0, 'N');
		rover.turnRight();
		assertEquals('E', rover.getDirection());

		rover = new MarsRover(0, 0, 'E');
		rover.turnRight();
		assertEquals('S', rover.getDirection());

		rover = new MarsRover(0, 0, 'S');
		rover.turnRight();
		assertEquals('W', rover.getDirection());

		rover = new MarsRover(0, 0, 'W');
		rover.turnRight();
		assertEquals('N', rover.getDirection());
	}

	@Test
	public void testMove() {
		MarsRover rover = new MarsRover(0, 0, 'N');
		rover.move();
		assertEquals(1, rover.getY());

		rover = new MarsRover(0, 0, 'E');
		rover.move();
		assertEquals(1, rover.getX());

		rover = new MarsRover(1, 1, 'S');
		rover.move();
		assertEquals(0, rover.getY());

		rover = new MarsRover(1, 1, 'W');
		rover.move();
		assertEquals(0, rover.getX());
	}

	@Test
	public void testProcessCommands() {
		MarsRover rover = new MarsRover(1, 2, 'N');
		rover.processCommands("LMLMLMLMM");
		assertEquals("1 3 N", rover.getPosition());

		rover = new MarsRover(3, 3, 'E');
		rover.processCommands("MMRMMRMRRM");
		assertEquals("5 1 E", rover.getPosition());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testOutOfBounds() {
		MarsRover rover = new MarsRover(0, 0, 'N');
		rover.processCommands("RRRXXXXX");
	}

}
