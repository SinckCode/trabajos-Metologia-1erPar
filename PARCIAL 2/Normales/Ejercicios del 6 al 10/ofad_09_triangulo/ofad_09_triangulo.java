import java.io.*;

public class ofad_09_triangulo {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double altura;
		double base;
		double triangulo;
		System.out.println("Ingresa la base");
		base = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingresa la altura");
		altura = Double.parseDouble(bufEntrada.readLine());
		triangulo = (base*altura)/2;
		System.out.println("El area del triangulo es "+triangulo);
	}


}