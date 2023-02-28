package Vistas;

import javax.swing.JLabel;

public class Etiqueta  extends JLabel{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Etiqueta(String texto, int posX, int posY, int weight, int height) {
		
		
		setText(texto);
		setBounds(posX, posY, weight, height);
		
		
	}

}
