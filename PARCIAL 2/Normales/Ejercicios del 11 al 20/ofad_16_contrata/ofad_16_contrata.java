import java.io.*;

public class ofad_16_contrata {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double ano;
		double anoa;
		double edad;
		System.out.println("Escribe tu año");
		ano = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Escribe el año actual");
		anoa = Double.parseDouble(bufEntrada.readLine());
		edad = anoa-ano;
		System.out.println("Tu edad es "+edad);
	}


}
