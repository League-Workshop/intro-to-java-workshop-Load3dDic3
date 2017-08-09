package day3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		JOptionPane.showMessageDialog(null,
				"If you find yourself having to cross a pirahna infested river, here's how to do it...");
		// If you find yourself having to cross a piranha-infested river, here's
		// how to do it...
		String nom1 = JOptionPane.showInputDialog("adjactive");
		// Get the user to enter an adjective
		String nom2 = JOptionPane.showInputDialog("type of liquid");
		// Get the user to enter a type of liquid
		String nom3 = JOptionPane.showInputDialog("body part");
		// Get the user to enter a body part
		String nom4 = JOptionPane.showInputDialog("verb");
		// Get the user to enter a verb
		String nom5 = JOptionPane.showInputDialog("place");
		// Get the user to enter a place

		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!

		// Make a pop-up for the final story. You can use \n to go to the next
		// line.

		JOptionPane.showMessageDialog(null, "Piranahas are more " + nom1
				+ " during the day, so cross the river at night. Piranahas are attracted to fresh " + nom2
				+ "and will mostlikely take a bite out of your " + nom3 + "if you " + nom4
				+ ". Whateverr you do if you have an open wound, try to get back to the " + nom5 + ". Good Luck!");
	}
}
