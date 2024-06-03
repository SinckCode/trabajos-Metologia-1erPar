import java.io.*;

public class ofad_14_metrospulg {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double metros;
		double pulg;
		System.out.println("Dame la cantidad de metros");
		metros = Double.parseDouble(bufEntrada.readLine());
		pulg = metros*39.3701;
		System.out.println("Los metros en pulg son "+pulg);
	}


}