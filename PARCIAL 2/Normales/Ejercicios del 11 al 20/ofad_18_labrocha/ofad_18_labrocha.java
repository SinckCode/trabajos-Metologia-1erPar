import java.io.*;

public class ofad_18_labrocha {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double cobro;
		double costom2;
		double metros2;
		System.out.println("Ingresa la cantidad de M2");
		metros2 = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingresa el costo por M2");
		costom2 = Double.parseDouble(bufEntrada.readLine());
		cobro = metros2*costom2;
		System.out.println("Lo que se va a cobrar es = "+cobro);
	}


}
