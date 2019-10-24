package recursos;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PanelDescription extends JPanel{
	private TextDescription texto;
	public PanelDescription(TextDescription texto){
		this.texto = texto;
		add(texto);
		setBounds(500, 70, 250, 150);
		setBackground(Color.BLACK);
	}
	public TextDescription getTexto() {
		return texto;
	}
	public void setTexto(TextDescription texto) {
		this.texto = texto;
	}
}
