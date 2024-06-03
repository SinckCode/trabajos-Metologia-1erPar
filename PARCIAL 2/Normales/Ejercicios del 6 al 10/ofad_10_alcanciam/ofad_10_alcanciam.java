import java.io.*;

public class ofad_10_alcanciam {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double ahorro;
		double balon;
		double gasto;
		double playera;
		double quedo;
		double tenis;
		System.out.println("Cuanto tienes ahorrado");
		ahorro = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Cuanto costo tu balon?");
		balon = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Cuanto costo tu playera?");
		playera = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Cuanto costaron tus tenis?");
		tenis = Double.parseDouble(bufEntrada.readLine());
		gasto = balon+playera+tenis;
		quedo = ahorro-balon-playera-tenis;
		System.out.println("Le quedo de dinero = "+quedo);
		System.out.println("Lo que gasto fue lo siguiente "+gasto);
	}


}