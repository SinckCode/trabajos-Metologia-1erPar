import java.io.*;

public class ofad_05_huevos {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double cajas;
		double cantidad;
		double total;
		System.out.println("Cuantas cajas");
		cajas = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Cuantos huevos tiene la caja?");
		cantidad = Double.parseDouble(bufEntrada.readLine());
		total = cajas*cantidad;
		System.out.println("La cantidad de huevos en total es "+total);
	}


}
