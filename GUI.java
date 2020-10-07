import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI implements ActionListener {

	private static JPanel panel;
	private static JFrame frame;
	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel successOrNot;

	public static void main(String[] args) {

		panel = new JPanel();
		frame = new JFrame();
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);

		panel.setLayout(null);

		userLabel = new JLabel("Användare");
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);

		userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);

		passwordLabel = new JLabel("Lösenord");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);

		passwordText = new JPasswordField();
		passwordText.setBounds(100, 50, 165, 25);
		panel.add(passwordText);

		button = new JButton("logga in");
		button.setBounds(10, 80, 80, 25);
		panel.add(button);
		button.addActionListener(new GUI());

		successOrNot = new JLabel("");
		successOrNot.setBounds(10, 110, 300, 25);
		panel.add(successOrNot);

		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String user = userText.getText();
		String password = passwordText.getText();

		if (user.equals("Chogge") && password.equals("lolboll123")) {

			successOrNot.setText("Inloggningen lyckades");

		} else {

			successOrNot.setText("Fel användare eller lösenord");

		}

	}

}
