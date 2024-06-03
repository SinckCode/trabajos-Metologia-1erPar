import java.io.*;

public class ofad_17_cobroesta {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double cobro;
		double costo;
		double horas;
		System.out.println("Escribe las horas ");
		horas = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Escribe el costo por horas");
		costo = Double.parseDouble(bufEntrada.readLine());
		cobro = horas*costo;
		System.out.println("Lo que pagaras es = "+cobro);
	}


}