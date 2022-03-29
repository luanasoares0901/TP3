package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ViewLogin {

	/*public static void main(String[] args) {
		JFrame frame = new JFrame("BiciGama");
		frame.setSize(650, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);

		frame.setVisible(true);
	}*/

	private static void placeComponents(JPanel panel) {

		panel.setLayout(null);

		JLabel userLabel = new JLabel("Usuario");
		userLabel.setBounds(200, 10, 80, 25);
		panel.add(userLabel);

		JTextField userText = new JTextField(20);
		userText.setBounds(250, 10, 160, 25);
		panel.add(userText);

		JLabel passwordLabel = new JLabel("Senha");
		passwordLabel.setBounds(200, 40, 80, 25);
		panel.add(passwordLabel);

		JPasswordField passwordText = new JPasswordField(20);
		passwordText.setBounds(250, 40, 160, 25);
		panel.add(passwordText);

		JButton loginButton = new JButton("login");
		loginButton.setBounds(282, 80, 80, 25);
		panel.add(loginButton);
		
		JButton registerButton = new JButton("registrar-se");
		registerButton.setBounds(270, 115, 105, 25);
		panel.add(registerButton);
	}
}
   
