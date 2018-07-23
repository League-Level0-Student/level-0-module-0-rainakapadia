package strings_and_dialogs;

import javax.swing.JOptionPane;

public class SecretMessageBox {
	public static void main(String[] args) {
		String password= JOptionPane.showInputDialog("Enter a password");
		String secret= JOptionPane.showInputDialog("enter secret message");
		String answer= JOptionPane.showInputDialog("you can only see the secret message if you guess the passord right.\n Guess the password.");
		if(password.equals(answer)) {
			JOptionPane.showMessageDialog(null, secret);
		}else {
			JOptionPane.showMessageDialog(null, " INTRUDER!");
		}
	}

}
