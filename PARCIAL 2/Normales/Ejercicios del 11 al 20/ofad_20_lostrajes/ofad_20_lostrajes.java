import java.io.*;

public class ofad_20_lostrajes {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double costart;
		double descuento;
		double postdesc;
		System.out.println("Ingresa el costo del articulo");
		costart = Double.parseDouble(bufEntrada.readLine());
		if (costart>2500) {
			descuento = (costart*15)/100;
			postdesc = (costart-descuento);
		} else {
			descuento = (costart*8)/100;
			postdesc = (costart-descuento);
		}
		System.out.println("El descuento es igual a "+descuento);
		System.out.println("El precio del articulo es de "+postdesc);
	}


}
