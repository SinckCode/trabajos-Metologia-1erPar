package lpbc_series;

import java.util.Scanner;

public class LPBC_Series {

    public static void main(String[] args) {
        Serie[] bdSeries = new Serie[20];

        int opcion;
        int cantidad;
        int encontrado;

        cantidad = precargarSeries(bdSeries);

        do {

            opcion = menu();
            switch (opcion) {
                case 1: //Insertar
                    System.out.println("Introduce los datos de la siguiente serie");
                    bdSeries[cantidad++] = leerSerie();

                    break;

                case 2: //Buscar

                    encontrado = buscarSerie(bdSeries, cantidad);
                    if (encontrado != -1) {
                        imprimirSerie(bdSeries[encontrado]);
                    } else {
                        System.out.println("Serie no encontrada, vuelve a intentarlo.");
                    }

                    break;

                case 3: //Modificar

                    encontrado = buscarSerie(bdSeries, cantidad);
                    if (encontrado != -1) {
                        imprimirSerie(bdSeries[encontrado]);
                        actualizarSerie(bdSeries, encontrado);
                    } else {
                        System.out.println("Serie no encontrada, vuelve a intentarlo.");
                    }

                    break;

                case 4: //Eliminar

                    encontrado = buscarSerie(bdSeries, cantidad);
                    if (encontrado != -1) {
                        imprimirSerie(bdSeries[encontrado]);
                        bdSeries[encontrado].estatus = "Inactivo";
                        imprimirSerie(bdSeries[encontrado]);
                    } else {
                        System.out.println("Serie no encontrada, vuelve a intentarlo.");
                    }

                    break;

                case 5:
                    imprimir(bdSeries, cantidad);
                    
                    //Ver listado

                    break;

                case 6: //Salir

                    System.out.println("Gracias por utilizar SW Series. Hasta pronto.");

                    break;

                default:
                    throw new AssertionError();
            }

        } while (opcion != 6);

    }//fin main

    public static int menu() {
        Scanner lector = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("**** C A T A L O G O D E S E R I E S ****");
            System.out.println("*** MENU ***");
            System.out.println("1 Insertar Nueva Serie");
            System.out.println("2 Buscar/Consultar");
            System.out.println("3 Modificar");
            System.out.println("4 Eliminar");
            System.out.println("5 Ver listado");
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
    public static void actualizarSerie(Serie[] bdSerie, int encontrado) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el titulo de la serie");
        bdSerie[encontrado].nombre = lector.next();
        System.out.println("Introduce el nommbre del director");
        bdSerie[encontrado].director = lector.next();
        System.out.println("Introduce el nombre de la casa productora");
        bdSerie[encontrado].productora = lector.next();
        System.out.println("Introduce el genero de la serie");
        bdSerie[encontrado].genero = lector.next();
        System.out.println("Introduce la fecha de lanzamiento");
        bdSerie[encontrado].fechaLanzamiento = lector.next();
        System.out.println("Introduce el pais de origen de la serie");
        bdSerie[encontrado].pais = lector.next();
        System.out.println("Introduce el numero de temporadas");
        bdSerie[encontrado].noTemporadas = lector.nextInt();
        System.out.println("Introduce el estatus de la canción 1 Activo, 2 Inactivo");
        int estatus = lector.nextInt();
        if (estatus == 1) {
            bdSerie[encontrado].estatus = "Activo";
        } else {
            bdSerie[encontrado].estatus = "Inactivo";
        }
    }// fin de método

    /* */
    public static int buscarSerie(Serie[] bdSerie, int cantidad) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el título de la serie a buscar:");
        String nombre = lector.next();
        int encontrado = -1;
        int i = 0;
        do {
            if (nombre.equals(bdSerie[i].nombre)) {
                encontrado = i;
            }

            i++;
        } while (encontrado == -1 && i < cantidad);
        return encontrado;
    }

    public static void imprimirSerie(Serie bdSerie) {
        System.out.println("\n** Información de la Serie **");
        System.out.println("Nombre: " + bdSerie.nombre);
        System.out.println("Director: " + bdSerie.director);
        System.out.println("Productora: " + bdSerie.productora);
        System.out.println("Genero: " + bdSerie.genero);
        System.out.println("Fecha de Lanzamiento: " + bdSerie.fechaLanzamiento);
        System.out.println("Pais: " + bdSerie.pais);
        System.out.println("Numero de Temporadas: " + bdSerie.noTemporadas);
    }

    

    public static void imprimir(Serie[] bdSerie, int cantidad) {
        System.out.println("Nombre\tDirector\tProductora\tGenero\tFecha de Lanzamiento\tPais\tNum Temp");
        for (int i = 0; i < cantidad; i++) {
            System.out.print(bdSerie[i].nombre + "\t");
            System.out.print(bdSerie[i].director + "\t");
            System.out.print(bdSerie[i].productora + "\t");
            System.out.print(bdSerie[i].genero + "\t");
            System.out.println(bdSerie[i].fechaLanzamiento + "\t");
            System.out.println(bdSerie[i].pais + "\t");
            System.out.println(bdSerie[i].noTemporadas + "\t");
        }
    }

    /* */

    public static Serie leerSerie() {
        Scanner lector = new Scanner(System.in);
        Serie bdSerie = new Serie();
        System.out.println("Introduce el titulo de la serie");
        bdSerie.nombre = lector.next();
        System.out.println("Introduce el nommbre del director");
        bdSerie.director = lector.next();
        System.out.println("Introduce el nombre de la casa productora");
        bdSerie.productora = lector.next();
        System.out.println("Introduce el genero de la serie");
        bdSerie.genero = lector.next();
        System.out.println("Introduce la fecha de lanzamiento");
        bdSerie.fechaLanzamiento = lector.next();
        System.out.println("Introduce el pais de origen de la serie");
        bdSerie.pais = lector.next();
        System.out.println("Introduce el numero de temporadas");
        bdSerie.noTemporadas = lector.nextInt();
        return bdSerie;

    }

    public static int precargarSeries(Serie[] bdSerie) {

        bdSerie[0] = new Serie();
        bdSerie[0].nombre = "Gambito de dama";
        bdSerie[0].director = "Scott Frank";
        bdSerie[0].productora = "Netflix";
        bdSerie[0].genero = "Drama";
        bdSerie[0].fechaLanzamiento = "23 de octubre de 2020";
        bdSerie[0].pais = "USA";
        bdSerie[0].noTemporadas = 1;

        bdSerie[1] = new Serie();
        bdSerie[1].nombre = "Hannibal";
        bdSerie[1].director = "Adam Kane";
        bdSerie[1].productora = "Amazon Prime";
        bdSerie[1].genero = "Terror";
        bdSerie[1].fechaLanzamiento = "4 de abril de 2013";
        bdSerie[1].pais = "USA";
        bdSerie[1].noTemporadas = 3;

        bdSerie[2] = new Serie();
        bdSerie[2].nombre = "30 Monedasa";
        bdSerie[2].director = "Álex de la Iglesia";
        bdSerie[2].productora = "HBO";
        bdSerie[2].genero = "Terror";
        bdSerie[2].fechaLanzamiento = "29 de noviembre de 2020";
        bdSerie[2].pais = "España";
        bdSerie[2].noTemporadas = 2;
        
        bdSerie[3] = new Serie();
        bdSerie[3].nombre = "30 Monedasa";
        bdSerie[3].director = "Álex de la Iglesia";
        bdSerie[3].productora = "HBO";
        bdSerie[3].genero = "Terror";
        bdSerie[3].fechaLanzamiento = "29 de noviembre de 2020";
        bdSerie[3].pais = "España";
        bdSerie[3].noTemporadas = 2;
        
        bdSerie[4] = new Serie();
        bdSerie[4].nombre = "30 Monedasa";
        bdSerie[4].director = "Álex de la Iglesia";
        bdSerie[4].productora = "HBO";
        bdSerie[4].genero = "Terror";
        bdSerie[4].fechaLanzamiento = "29 de noviembre de 2020";
        bdSerie[4].pais = "España";
        bdSerie[4].noTemporadas = 2;
        
        bdSerie[5] = new Serie();
        bdSerie[5].nombre = "30 Monedasa";
        bdSerie[5].director = "Álex de la Iglesia";
        bdSerie[5].productora = "HBO";
        bdSerie[5].genero = "Terror";
        bdSerie[5].fechaLanzamiento = "29 de noviembre de 2020";
        bdSerie[5].pais = "España";
        bdSerie[5].noTemporadas = 2;
        
        bdSerie[6] = new Serie();
        bdSerie[6].nombre = "30 Monedasa";
        bdSerie[6].director = "Álex de la Iglesia";
        bdSerie[6].productora = "HBO";
        bdSerie[6].genero = "Terror";
        bdSerie[6].fechaLanzamiento = "29 de noviembre de 2020";
        bdSerie[6].pais = "España";
        bdSerie[6].noTemporadas = 2;

        return 7;
    }
}

class Serie {

    public String nombre;
    public String genero;
    public String director;
    public String pais;
    public String productora;
    public int noTemporadas;
    public String fechaLanzamiento;
    public String estatus = "Activo";
}
