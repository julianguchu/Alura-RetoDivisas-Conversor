package Vistas;

import javax.swing.JButton;

public class Boton extends JButton {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Boton(String texto, int posX, int posY, int weight, int height) {
		setText(texto);
		setBounds(posX, posY, weight, height);

	}

}
