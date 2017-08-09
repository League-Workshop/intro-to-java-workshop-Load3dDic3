package day3;

import javax.swing.JOptionPane;

public class StephenHawking {

	public static void main(String[] args) {
		String word = JOptionPane.showInputDialog("Type a Sentence");
		// 1. make a main method and put steps 2, 3 & 4 inside it
		// 2. ask the user for a sentence
		// 3. call the speak method below and send it the sentence
		speak(word);
	}
	// 4. repeat steps 2 and 3 a lot of times

	/* Don’t change this…. */
	static void speak(String word) {
		try {
			Runtime.getRuntime().exec("say " + word).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
