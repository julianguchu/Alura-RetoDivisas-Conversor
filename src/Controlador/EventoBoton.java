package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import Modelo.ConexionApiConversor;
import Vistas.Panel;

public class EventoBoton implements ActionListener {

	private Panel panel;

	public EventoBoton(Panel panel) {

		this.panel = panel;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == panel.getBoton()) {

			String captura = panel.getCaja1().getText();
			Pattern patron = Pattern.compile("^\\d+(\\.?\\d+)?");
			if (!patron.matcher(captura).matches()) {
				JOptionPane.showMessageDialog(null,
						"Debes ingresar una cantidad Correcta:incluye  cifras decimales con separador de .");
				panel.getCaja1().setText("");
				panel.getLabelPrueba().setText("");
			} else {

				String[] monedasEscogidas = panel.getListaMonedas().getSelectedValue().toString().split("-");

				try {
					panel.getLabelPrueba().setText(ConexionApiConversor.getConexion()
							.mostrarRespuesta(monedasEscogidas[1], monedasEscogidas[0], panel.getCaja1().getText()));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					panel.getLabelPrueba().setText("error al conectar con el api");
				}
			}

		}
	}

	public Panel getPanel() {
		return panel;
	}

	public void setPanel(Panel panel) {
		this.panel = panel;
	}

}
