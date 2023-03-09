package com.marsrover;

import java.util.Scanner;

import com.marsrover.entity.MarsRover;

public class MarsRoverMain {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			// Read the upper-right coordinates of the plateau
			int maxX = scanner.nextInt();
			int maxY = scanner.nextInt();

			while (scanner.hasNext()) {
				// Read the position and commands for each rover
				int x = scanner.nextInt();
				int y = scanner.nextInt();
				char direction = scanner.next().charAt(0);
				MarsRover rover = new MarsRover(x, y, direction);

				String commands = scanner.next();
				rover.processCommands(commands);

				// Ensure the rover stays within the plateau
				if (rover.getX() < 0 || rover.getX() > maxX || rover.getY() < 0 || rover.getY() > maxY) {
					throw new IllegalArgumentException("Rover went out of bounds!");
				}

				System.out.println(rover.getPosition());
			}
		}
	}
}
