package Vistas;

import javax.swing.JFrame;

public class Ventana extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Panel panel;

	public Ventana(int largo, int ancho) {

		setSize(largo, ancho);

		setTitle("Conversor De Divisas");
		panel = new Panel();
		add(panel);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public Panel getPanel() {
		return panel;
	}

	public void setPanel(Panel panel) {
		this.panel = panel;
	}

}
