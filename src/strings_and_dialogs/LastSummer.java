package strings_and_dialogs;

import javax.swing.JOptionPane;

public class LastSummer {
	public static void main(String[] args) {
		String answer= JOptionPane.showInputDialog("What is your name? ");
		String activity= JOptionPane.showInputDialog("what did you do?");
		JOptionPane.showMessageDialog(null, "I know that you "+activity+" last summer.\n "
				+ answer+". Muhahaha!");
	}

}
