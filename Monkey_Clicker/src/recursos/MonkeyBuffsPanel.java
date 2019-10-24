package recursos;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;
public class MonkeyBuffsPanel extends JPanel{
	public MonkeyBuffsPanel() {
		setBounds(500, 170, 250, 250);
		setBackground(Color.BLACK);
		setLayout(new GridLayout(4, 1));
	}
}
