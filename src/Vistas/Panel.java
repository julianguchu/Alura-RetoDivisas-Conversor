package Vistas;

import java.awt.Color;

import java.util.regex.Pattern;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import Controlador.EventoBoton;
import Modelo.ConexionApiConversor;

public class Panel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CajasTexto caja1;
	private JList<String> listaMonedas;
	private Boton boton;
	private Etiqueta labelPrueba;
	// private ConexionApiConversor conectorApi;

	public Panel() {
		// conectorApi = new ConexionApiConversor();

		Etiqueta label = new Etiqueta("Ingrese la Cantidad :", 60, 10, 200, 20);
		caja1 = new CajasTexto(200, 10, 140, 20);
		Etiqueta labelLista = new Etiqueta("Selecciona la Divisa:", 60, 40, 200, 20);

		String[] arregloMoneda = new String[] { "COP-MXN", "COP-EUR", "COP-USD", "COP-BRL", "COP-JPY", "COP-GBP",
				"MXN-COP", "EUR-COP", "USD-COP", "BRL-COP", "JPY-COP", "GBP-COP" };
		listaMonedas = new JList<>(arregloMoneda);
		JScrollPane scroll = new JScrollPane(listaMonedas);
		listaMonedas.setSelectedIndex(0);
		labelPrueba = new Etiqueta("", 150, 200, 200, 20);
		scroll.setBounds(200, 40, 130, 40);

		listaMonedas.addListSelectionListener(a -> {

			// listaMonedas.setSelectedValue(arregloMoneda[0], false);
			listaMonedas.getSelectedValue().toString();
		});

		boton = new Boton("Conversion", 150, 120, 200, 40);

		add(label);
		add(caja1);
		add(labelLista);
		add(scroll);
		add(labelPrueba);
		add(boton);

		setSize(400, 400);
		setLayout(null);
		setVisible(true);
		setBackground(Color.cyan);
		boton.addActionListener(new EventoBoton(this));
		/*
		 * boton.addActionListener(l -> { System.out.println("el valor es" + " " +
		 * this.caja1.getText()); String captura = caja1.getText(); Pattern patron =
		 * Pattern.compile("^\\d+(\\.?\\d+)?"); if (captura.equals("") ||
		 * !patron.matcher(captura).matches()) { JOptionPane.showMessageDialog(null,
		 * "Debes ingresar una cantidad Correcta:incluye  cifras decimales con separador de ."
		 * ); } else { System.out.println(this.caja1.getText()); String[]
		 * monedasEscogidas = listaMonedas.getSelectedValue().toString().split("-");
		 * 
		 * labelPrueba.setText( conectorApi.mostrarRespuesta(monedasEscogidas[1],
		 * monedasEscogidas[0], this.caja1.getText())); } });
		 */

	}

	public CajasTexto getCaja1() {
		return caja1;
	}

	public void setCaja1(CajasTexto caja1) {
		this.caja1 = caja1;
	}

	public JList<String> getListaMonedas() {
		return listaMonedas;
	}

	public void setListaMonedas(JList<String> listaMonedas) {
		this.listaMonedas = listaMonedas;
	}

	public Boton getBoton() {
		return boton;
	}

	public void setBoton(Boton boton) {
		this.boton = boton;
	}

	public JLabel getLabelPrueba() {
		return labelPrueba;
	}

	public void setLabelPrueba(Etiqueta labelPrueba) {
		this.labelPrueba = labelPrueba;
	}

	/*
	 * public ConexionApiConversor getConectorApi() { return conectorApi; }
	 * 
	 * public void setConectorApi(ConexionApiConversor conectorApi) {
	 * this.conectorApi = conectorApi; }
	 */
}
