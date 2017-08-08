package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot j = new Robot();

		// 5. Set your robot's pen to the down position
		j.penDown();
		// 3. Set the robot to go at max speed (10)
		j.setSpeed(10);
		// 4. Do the following (steps 6-9) 75 times
		for (int i = 0; i < 10000; i++) {

			// 7. Change the pen color to random
			j.setRandomPenColor();
			// 6. Move the robot 5 times the current line number you are drawing
			// (5*i)
			j.move(3 * i);
			// 2. Turn the robot 1/3 of 360 degrees to the right
			j.turn(360 / 3);

			// 8. Change the number of sides to 7 (don’t add a new line of code
			// for
			j.setPenWidth(5);
			// this one!)

			// 9. Set the pen width to i
		}
	}
}
