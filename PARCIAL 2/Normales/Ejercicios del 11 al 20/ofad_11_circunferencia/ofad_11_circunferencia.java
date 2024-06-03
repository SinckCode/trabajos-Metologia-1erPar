import java.io.*;

public class ofad_11_circunferencia {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double areacircun;
		double radio;
		System.out.println("Ingresa los datos del radio");
		radio = Double.parseDouble(bufEntrada.readLine());
		areacircun = (radio*3.1416)/2;
		System.out.println("La área de la circunferencia es = "+areacircun);
	}


}