import java.io.*;

public class ofand_13_sueldo {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double costoh;
		double horas;
		double pagosemanal;
		System.out.println("Dame las horas que trabajaste");
		horas = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Costo de hora");
		costoh = Double.parseDouble(bufEntrada.readLine());
		pagosemanal = horas*costoh;
		System.out.println("El pago semanal es "+pagosemanal);
		System.out.println("El pago por hora es "+costoh);
	}


}

