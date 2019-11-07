package recursos;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class MonkeyButton extends JButton{

	public MonkeyButton(){
		ImageIcon monkey = new ImageIcon(getClass().getClassLoader().getResource("recursos/monkeyCoder.jpg"));
		setBackground(Color.BLACK);
		setFocusPainted(false);
		setBorder(null);
		setIcon(monkey);
	}
}
