package com.marsrover.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MarsRover {

	private int x;
	private int y;
	private char direction;

	public void processCommands(String commands) {
		for (char c : commands.toCharArray()) {
			if (c == 'L') {
				turnLeft();
			} else if (c == 'R') {
				turnRight();
			} else if (c == 'M') {
				move();
			} else {
				throw new IllegalArgumentException("Invalid command: " + c);
			}
		}
	}

	public void turnLeft() {
		switch (direction) {
		case 'N':
			direction = 'W';
			break;
		case 'E':
			direction = 'N';
			break;
		case 'S':
			direction = 'E';
			break;
		case 'W':
			direction = 'S';
			break;
		}
	}

	public void turnRight() {
		switch (direction) {
		case 'N':
			direction = 'E';
			break;
		case 'E':
			direction = 'S';
			break;
		case 'S':
			direction = 'W';
			break;
		case 'W':
			direction = 'N';
			break;
		}
	}

	public void move() {
		switch (direction) {
		case 'N':
			y++;
			break;
		case 'E':
			x++;
			break;
		case 'S':
			y--;
			break;
		case 'W':
			x--;
			break;
		}
	}

	public String getPosition() {
		return x + " " + y + " " + direction;
	}

}
