import java.io.*;

public class ofad_06_escritorios {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double costoesc;
		double costopubli;
		double escritorios;
		double gasto;
		System.out.println("Cuanto gasto?");
		gasto = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Con eso cuantos escritorios hace?");
		escritorios = Double.parseDouble(bufEntrada.readLine());
		costoesc = gasto/escritorios;
		costopubli = costoesc*2;
		System.out.println("El costo de elaboración es "+costoesc);
		System.out.println("El costo de venta es "+costopubli);
	}


}