package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String name = JOptionPane.showInputDialog("Do You Know Code");
		// 2. If they say "yes", tell them they will rule the world.
		if (name.equals("Yes")) {
			JOptionPane.showMessageDialog(null, "You Will Rule The World");
		}
		// 3. Otherwise, wish them good luck washing dishes.
		else {
			JOptionPane.showMessageDialog(null, "Good Luck Washing dishes");
		}
	}
}
