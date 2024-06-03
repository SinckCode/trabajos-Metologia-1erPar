import java.io.*;

public class ofad_08_regresoclases {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double cp;
		double np;
		double npr;
		double npr2;
		double suma;
		double tnp;
		double tnpr;
		double total;
		System.out.println("Cuanto pago?");
		total = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Cuantos hijos en preescolar");
		np = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Cuantos hijos en primaria");
		npr = Double.parseDouble(bufEntrada.readLine());
		npr2 = npr*1.5;
		suma = np+npr2;
		cp = total/suma;
		tnp = np*cp;
		tnpr = npr*cp;
		System.out.println("El total de gasto para los hijos de Primaria es "+tnpr);
		System.out.println("El total de gasto para los de prescolar es "+tnp);
	}


}