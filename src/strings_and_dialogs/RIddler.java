package strings_and_dialogs;

import javax.swing.JOptionPane;

public class RIddler {
	public static void main(String[] args) {
		int score = 0;
		String answer = JOptionPane.showInputDialog("What has hands but can not clap?");
		if (answer.equals("a clock")) {
			JOptionPane.showMessageDialog(null, " Correct");
			score += 10;
		} else {
			JOptionPane.showMessageDialog(null, " Wrong");
			score -= 2;
		}
		String answer1 = JOptionPane.showInputDialog("What kind of room has no doors or windows?");
		if (answer1.equals("a mushroom")) {
			JOptionPane.showMessageDialog(null, " Correct");
			score += 10;
		} else {
			JOptionPane.showMessageDialog(null, " Wrong");
			score -= 2;
		}
		String answer2 = JOptionPane.showInputDialog("What kind of tree can you carry in your hand?");
		if (answer2.equals("a palm")) {
			JOptionPane.showMessageDialog(null, " Correct");
			score += 10;
		} else {
			JOptionPane.showMessageDialog(null, " Wrong");
			score -= 2;

		}
	}
}
