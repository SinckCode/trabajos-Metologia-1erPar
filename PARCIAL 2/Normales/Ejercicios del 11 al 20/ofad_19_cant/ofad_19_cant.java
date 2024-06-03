import java.io.*;

public class ofad_19_cant {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double cantlap;
		double x;
		System.out.println("Escribe la cantidad de lápices");
		cantlap = Double.parseDouble(bufEntrada.readLine());
		if (cantlap>1000) {
			x = cantlap*85;
		} else {
			x = cantlap*90;
		}
		System.out.println("La cantidad a pagar es de "+x);
	}


}