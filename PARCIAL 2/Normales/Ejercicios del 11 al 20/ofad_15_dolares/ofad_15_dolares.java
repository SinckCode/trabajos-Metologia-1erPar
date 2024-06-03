import java.io.*;

public class ofad_15_dolares {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double dinerom;
		double dolares;
		System.out.println("Cual es la cantidad de dinero");
		dinerom = Double.parseDouble(bufEntrada.readLine());
		dolares = dinerom*0.059;
		System.out.println("Los dolares son "+dolares);
	}


}