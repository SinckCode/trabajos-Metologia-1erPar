import java.io.*;

public class ofad_07_azucar {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double costalcant;
		double costalkg;
		double totalkg;
		System.out.println("Cuantos kilos tiene un costal");
		costalkg = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Cuantos costales son");
		costalcant = Double.parseDouble(bufEntrada.readLine());
		totalkg = costalcant*costalkg;
		System.out.println("El total es de "+totalkg+"kg");
	}


}