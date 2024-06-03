
import java.util.Scanner;

public class ProyectoClases {

    /* */
    public static void main(String[] args) {
        Cancion[] canciones = new Cancion[20];
        int cantidad;
        int opcion;
        int encontrado;
        cantidad = precargarCanciones(canciones);
        do {
            opcion = mostrarMenu();
            switch (opcion) {
                case 1:
                    canciones[cantidad++] = leerCancion(); //Insertar
                    break;
                case 2:
                    encontrado = buscarCancion(canciones, cantidad);
                    if (encontrado != -1) {
                        imprimirCancion(canciones[encontrado]);
                    } else {
                        System.out.println("Canción no encontrada, vuelve a intentarlo.");
                    }
                    break;
                case 3:
                    encontrado = buscarCancion(canciones, cantidad);
                    if (encontrado != -1) {
                        imprimirCancion(canciones[encontrado]);
                        actualizarCancion(canciones, encontrado);
                    } else {
                        System.out.println("Canción no encontrada, vuelve a intentarlo.");
                    }
                    break;
                case 4:
                    encontrado = buscarCancion(canciones, cantidad);
                    if (encontrado != -1) {
                        imprimirCancion(canciones[encontrado]);
                        canciones[encontrado].estatus = "Inactivo";
                        imprimirCancion(canciones[encontrado]);
                    } else {
                        System.out.println("Canción no encontrada, vuelve a intentarlo.");
                    }
                    break;
                case 5:
                    imprimir(canciones, cantidad);
                    break;
                case 6:
                    System.out.println("Gracias por utilizar SW Canciones. Hasta pronto.");
                    break;

            }
        } while (opcion < 6);
    }//fin de main 

    /* */
    public static void actualizarCancion(Cancion[] c, int encontrado) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el título de la canción:");
        c[encontrado].titulo = lector.next();
        System.out.println("Introduce el autor de la canción");
        c[encontrado].autor = lector.next();
        System.out.println("Introduce el interprete de la canción:");
        c[encontrado].interprete = lector.next();
        System.out.println("Introduce el genero de la canción");
        c[encontrado].genero = lector.next();
        System.out.println("Introduce la duracion en minutos de la canción");
        c[encontrado].duracion = lector.nextDouble();
        System.out.println("Introduce el estatus de la canción 1 Activo, 2 Inactivo");
        int estatus = lector.nextInt();
        if (estatus == 1) {
            c[encontrado].estatus = "Activo";
        } else {
            c[encontrado].estatus = "Inactivo";
        }
    }// fin de método

    /* */
    public static int buscarCancion(Cancion[] c, int cantidad) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el título de la canción a buscar:");
        String nombre = lector.next();
        int encontrado = -1;
        int i = 0;
        do {
            if (nombre.equals(c[i].titulo)) {
                encontrado = i;
            }

            i++;
        } while (encontrado == -1 && i < cantidad);
        return encontrado;
    }

    /* */
    public static void imprimirCancion(Cancion c) {
        System.out.println("\n** Información de la canción **");
        System.out.println("Título: " + c.titulo);
        System.out.println("Autor: " + c.autor);
        System.out.println("Interprete: " + c.interprete);
        System.out.println("Genero: " + c.genero);
        System.out.println("Duración: " + c.duracion);
        System.out.println("Estatus: " + c.estatus);
    }

    /* */

    public static int mostrarMenu() {
        Scanner lector = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("**** C A T A L O G O D E C A N C I O N E S S W ****");
            System.out.println("*** MENU ***");
            System.out.println("1 Nueva canción");
            System.out.println("2 Buscar canción");
            System.out.println("3 Actualizar canción");
            System.out.println("4 Eliminar canción");
            System.out.println("5 Listado canciones");
            System.out.println("6 Salir");
            System.out.println("Introduce la opción:");
            opcion = lector.nextInt();
            if (opcion < 1 || opcion > 6) {
                System.out.println("Opción NO Válida");
            }
        } while (opcion < 1 || opcion > 6);
        return opcion;
    }

    /* */

    public static void imprimir(Cancion[] canciones, int cantidad) {
        System.out.println("Titulo\tAutor\tInterprete\tGenero\tDuracion");
        for (int i = 0; i < cantidad; i++) {
            System.out.print(canciones[i].titulo + "\t");
            System.out.print(canciones[i].autor + "\t");
            System.out.print(canciones[i].interprete + "\t");
            System.out.print(canciones[i].genero + "\t");
            System.out.println(canciones[i].duracion + "\t");
        }
    }

    /* */

    public static Cancion leerCancion() {
        Scanner lector = new Scanner(System.in);
        Cancion c = new Cancion();
        System.out.println("Introduce el título de la canción:");
        c.titulo = lector.next();
        System.out.println("Introduce el autor de la canción");
        c.autor = lector.next();
        System.out.println("Introduce el interprete de la canción:");
        c.interprete = lector.next();
        System.out.println("Introduce el genero de la canción");
        c.genero = lector.next();
        System.out.println("Introduce la duracion en minutos de la canción");
        c.duracion = lector.nextDouble();
        return c;
    } // fin de método leerCancion
/* */
    public static int precargarCanciones(Cancion[] c) {

        c[0] = new Cancion();
        c[0].titulo = "Querida";
        c[0].autor = "AGV";
        c[0].interprete = "JG";
        c[0].genero = "pop";
        c[0].duracion = 4.55;
        c[1] = new Cancion();
        c[1].titulo = "Querida2";
        c[1].autor = "AGV";
        c[1].interprete = "JG";
        c[1].genero = "pop";
        c[1].duracion = 3.55;
        c[2] = new Cancion();
        c[2].titulo = "Querida3";
        c[2].autor = "AGV";
        c[2].interprete = "JG";
        c[2].genero = "pop";
        c[2].duracion = 3.15;
        c[3] = new Cancion();
        c[3].titulo = "Querida4";
        c[3].autor = "AGV";
        c[3].interprete = "JG";
        c[3].genero = "pop";
        c[3].duracion = 4.25;
        c[4] = new Cancion();
        c[4].titulo = "Querida5";
        c[4].autor = "AGV";
        c[4].interprete = "JG";
        c[4].genero = "pop";
        c[4].duracion = 6.55;
        c[5] = new Cancion();
        c[5].titulo = "Querida6";
        c[5].autor = "AGV";
        c[5].interprete = "JG";
        c[5].genero = "pop";
        c[5].duracion = 4.00;

        return 6;
    }
}

/* */
class Cancion {

    public String titulo;
    public String genero;
    public double duracion;
    public String autor;
    public String interprete;
    public String estatus = "Activo";
}
/*************************************/
