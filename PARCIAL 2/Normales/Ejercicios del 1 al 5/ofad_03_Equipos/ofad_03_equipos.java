import java.io.*;

public class ofad_03_equipos {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double cantidad;
		double equipos;
		double integrantes;
		System.out.println("Escribe la cantidad de alumnos");
		cantidad = Double.parseDouble(bufEntrada.readLine());
		System.out.println("En cuantos equipos quieres que se divida");
		integrantes = Double.parseDouble(bufEntrada.readLine());
		equipos = cantidad/integrantes;
		System.out.println("Los debes dividir en "+equipos+"Integrantes");
	}


}
