import java.io.*;

public class ofad_01_la_resta {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double numero1;
		double numero2;
		double resta;
		System.out.println("Escribe un numero");
		numero1 = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Escribe un numero");
		numero2 = Double.parseDouble(bufEntrada.readLine());
		resta = numero1-numero2;
		System.out.println("El resultado de la resta es "+resta);
	}


}
