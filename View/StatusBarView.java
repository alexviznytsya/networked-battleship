//
//
// Alex Viznytsya, https://github.com/alexviznytsya
// Michal Bochnak, https://github.com/michalbochnak
//
// Nov 16, 2017
//


package View;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class StatusBarView extends JPanel{

	private static final long serialVersionUID = 1L;

	//
	// Default constructor:
	//
	public JLabel getHitMissMsg() {
		return hitMissMsg;
	}

	private JLabel hitMissMsg;
	private JLabel statusBarMessage;

	public StatusBarView() {

		this.hitMissMsg = new JLabel();
		this.statusBarMessage = new JLabel();

		this.initialize();
	}

	//
	// Getter methods:
	//
	public StatusBarView getView() {
		return this;
	}

	//
	// Setter methods:
	//
	public void setStatusMessage(String message) {
		this.statusBarMessage.setText(message);
	}

	public void setHitMissMsg(String msg) {
		this.hitMissMsg.setText(msg);
	}


	//
	// Class methods:
	//
	private void initialize() {
		setBounds(340, 550, 1050, 30);
		setOpaque(true);
		setBackground(Color.WHITE);
		setLayout(null);

		this.statusBarMessage.setOpaque(true);
		this.statusBarMessage.setBackground(Color.WHITE);
		this.statusBarMessage.setBounds(0,0, 500, 30);
		this.statusBarMessage.setFont(new Font("TimesRoman", Font.BOLD, 24));
		this.statusBarMessage.setHorizontalAlignment(SwingConstants.CENTER);
		this.statusBarMessage.setText("Place your ships on the board");

		this.hitMissMsg.setOpaque(true);
		this.hitMissMsg.setBackground(Color.WHITE);
		this.hitMissMsg.setBounds(550,0, 500, 30);
		this.hitMissMsg.setFont(new Font("TimesRoman", Font.BOLD, 24));
		this.hitMissMsg.setHorizontalAlignment(SwingConstants.CENTER);
		this.hitMissMsg.setText("");

		add(this.statusBarMessage);
		add(this.hitMissMsg);
	}
}
