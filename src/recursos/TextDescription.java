package recursos;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextArea;

public class TextDescription extends JTextArea{
	public TextDescription() {
		Font fuente2 = new Font("Comic Sans MS", Font.PLAIN, 15);
		setBounds(500, 70, 250, 150);
		setForeground(Color.WHITE);
		setBackground(Color.black);
		setFont(fuente2);
		setLineWrap(true);
		setWrapStyleWord(true);
		setEditable(false);
	}
}
