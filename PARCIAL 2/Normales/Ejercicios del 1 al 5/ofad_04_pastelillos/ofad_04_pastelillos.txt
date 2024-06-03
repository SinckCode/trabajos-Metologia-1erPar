import java.io.*;

public class ofad_04_pastelillos {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double pastelillos;
		double quedan;
		double vendio;
		System.out.println("Cantidad de pastelillos");
		pastelillos = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Cuantos vendio");
		vendio = Double.parseDouble(bufEntrada.readLine());
		quedan = pastelillos-vendio;
		System.out.println("A la señora Lupita le quedan"+quedan);
	}


}