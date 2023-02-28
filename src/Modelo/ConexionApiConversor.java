package Modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ConexionApiConversor {

	private String urlApi = "https://api.apilayer.com/exchangerates_data/convert?to=A&from=desde&amount=cantidad";
	private static ConexionApiConversor conexionApi;

	public static ConexionApiConversor getConexion() {

		if (conexionApi == null) {

			conexionApi = new ConexionApiConversor();
		}
		return conexionApi;

	}

	public String mostrarRespuesta(String to, String from, String amount) throws IOException {

		ResponseApi objeto = null;
		try {
			urlApi = urlApi.replace("A", to);
			urlApi = urlApi.replace("desde", from);
			urlApi = urlApi.replace("cantidad", amount);
			System.out.println(urlApi);

			URL url = new URL(urlApi);
			URLConnection conexion = url.openConnection();
			conexion.setRequestProperty("apikey", "kZbxLglhFsGxspN5wLJJb6fUJHEHL1GL");

			conexion.setRequestProperty("User-Agent",
					"Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");

			Reader objRespuesta = new InputStreamReader(conexion.getInputStream());
			BufferedReader buferSlida = new BufferedReader(objRespuesta);
			String salida;
			StringBuilder b = new StringBuilder();
			while ((salida = buferSlida.readLine()) != null) {

				b.append(salida);

			}
			ObjectMapper b1 = new ObjectMapper();

			objeto = b1.readValue(b.toString(), ResponseApi.class);
			System.out.println(objeto);
			urlApi = "https://api.apilayer.com/exchangerates_data/convert?to=A&from=desde&amount=cantidad";

		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new IOException();
		}
		String d = "####################################";

		return (new StringBuilder().append("El resultado en ").append(objeto.getQuery().getTo()).append(" es: ")
				.append(new DecimalFormat("#." + d + d + d).format(objeto.getResult()))).toString();

	}
}
