import java.io.*;

public class ofad_12_leche {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double galones;
		double leched;
		System.out.println("Cuanto se produjo este dia?");
		leched = Double.parseDouble(bufEntrada.readLine());
		galones = leched/3.785;
		System.out.println("Lo qe se produjo en galones fue = "+galones);
	}


}