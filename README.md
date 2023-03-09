# MarsRoverChallenge


## Philosophy:

The MarsRover class is designed to simulate the movement of a rover on the surface of Mars. It takes input commands that represent the movement of the rover in a 2D plane with four cardinal directions (N, S, E, W) and updates the position of the rover accordingly. The program also takes input for the maximum coordinates of the plateau, ensuring that the rover does not go out of bounds.

## Assumptions:

The input commands consist of a string of characters, where L represents a left turn, R represents a right turn, and M represents a move forward.
The rover always starts at a valid position within the plateau boundaries.
The plateau is a 2D plane with a rectangular shape.
The rover cannot move past the boundaries of the plateau.
The rover can only move one unit at a time in the current direction.

## Explanation of the code:

The code is written in Java. The JDK used is version 17.
The MarsRover class contains private variables for the x and y coordinates and the direction of the rover. Project Lombok is used to generate field baased construct and setters and getters. This avoids boiler plate code. It also contains three methods to process the movement commands: turnLeft(), turnRight(), and move(). These methods update the direction and position of the rover based on the input command. The class also contains a method to get the current position of the rover.

The MarsRoverMain class has a main method to take input from the user for the maximum plateau coordinates, rover position, and commands. It creates a new MarsRover object and runs the commands using the processCommands() method. It then checks if the rover is within the boundaries of the plateau and prints the final position of the rover.

Junit test cases are written for all the methods.

The build tool used is maven. I have also impletemented Sonarqube for code quality check.

## Steps to run the code:

1. Pull the repository in your local pc.

2. Run the commands "mvn clean", then "mvn install".

3. Run the java application.

4. Enter the maximum coordinates of the plateau and the rover's initial position and commands as input when prompted by the program.
The program will output the final position of the rover after executing the commands. If the rover goes out of bounds, an error message will be displayed.

5. To execite Sonarqube, first install Sonarqube in your local machine.
Run the startSonar.bat file (Windows) or sonar.sh file (MAC OS).
Sonarqube will run on port 9000 by default. Access the dashboard by hitting http://localhost:9000
Go to the project directory and run the command "mvn sonar:sonar".

6. To run the jUnit test cases, run the command "mvn test".

Sonarqube results:

![image](https://user-images.githubusercontent.com/22928913/224025991-5bd7a231-11ed-4052-9c0a-dacfc18afe60.png)

![image](https://user-images.githubusercontent.com/22928913/224026186-ad486747-a3c4-4e8e-a4ed-a247257286e7.png)
