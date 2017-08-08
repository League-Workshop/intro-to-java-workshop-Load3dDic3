package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {

		// START HERE
		Robot r2d2 = new Robot();
		r2d2.sparkle();
		r2d2.setSpeed(10);
		r2d2.penDown();
		r2d2.setPenColor(Color.RED);
		for (int i = 0; i < 1000000000; i++) {

		}
	}
}
