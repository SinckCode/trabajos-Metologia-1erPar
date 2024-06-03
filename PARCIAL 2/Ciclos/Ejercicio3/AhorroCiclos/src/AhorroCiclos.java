
import java.util.Scanner;

public class AhorroCiclos {

    public static void main(String args[]) {
        Scanner consola = new Scanner(System.in);
        int sumaCantidad = 0;

        int DineroE = 0;
        int DineroF = 0;
        int DineroM = 0;
        int DineroA = 0;
        int DineroMA = 0;
        int DineroJ = 0;
        int DineroJU = 0;
        int DineroAG = 0;
        int DineroS = 0;
        int DineroO = 0;
        int DineroN = 0;
        int DineroD = 0;
        int dinerp;
        
        //CODIGO USANDO EL CICLO FOR
        
        System.out.println("CODIGO ESCRITO CON EL CICLO FOR");

        for (int i = 0; i < 12; i++) {

            if (i == 0) {
                var mes = "Enero";
                System.out.println("Ingresa la cantidad que ingresaste en " + mes);
                dinerp = consola.nextInt();
                sumaCantidad += dinerp;
                DineroE = dinerp;
            } else {
                if (i == 1) {
                    var mes = "Febrero";
                    System.out.println("Ingresa la cantidad que ingresaste en " + mes);
                    dinerp = consola.nextInt();
                    sumaCantidad += dinerp;
                    DineroF = dinerp;

                } else {
                    if (i == 2) {
                        var mes = "Marzo";
                        System.out.println("Ingresa la cantidad que ingresaste en " + mes);
                        dinerp = consola.nextInt();
                        sumaCantidad += dinerp;
                        DineroM = dinerp;
                    } else {
                        if (i == 3) {
                            var mes = "Abri";
                            System.out.println("Ingresa la cantidad que ingresaste en " + mes);
                            dinerp = consola.nextInt();
                            sumaCantidad += dinerp;
                            DineroA = dinerp;
                        } else {
                            if (i == 4) {
                                var mes = "Mayo";
                                System.out.println("Ingresa la cantidad que ingresaste en " + mes);
                                dinerp = consola.nextInt();
                                sumaCantidad += dinerp;
                                DineroMA = dinerp;
                            } else {
                                if (i == 5) {
                                    var mes = "Junio";
                                    System.out.println("Ingresa la cantidad que ingresaste en " + mes);
                                    dinerp = consola.nextInt();
                                    sumaCantidad += dinerp;
                                    DineroJ = dinerp;
                                } else {
                                    if (i == 6) {
                                        var mes = "Julio";
                                        System.out.println("Ingresa la cantidad que ingresaste en " + mes);
                                        dinerp = consola.nextInt();
                                        sumaCantidad += dinerp;
                                        DineroJU = dinerp;
                                    } else {
                                        if (i == 7) {
                                            var mes = "Agosto";
                                            System.out.println("Ingresa la cantidad que ingresaste en " + mes);
                                            dinerp = consola.nextInt();
                                            sumaCantidad += dinerp;
                                            DineroAG = dinerp;
                                        } else {
                                            if (i == 8) {
                                                var mes = "Septiembre";
                                                System.out.println("Ingresa la cantidad que ingresaste en " + mes);
                                                dinerp = consola.nextInt();
                                                sumaCantidad += dinerp;
                                                DineroS = dinerp;
                                            } else {
                                                if (i == 9) {
                                                    var mes = "Octubre";
                                                    System.out.println("Ingresa la cantidad que ingresaste en " + mes);
                                                    dinerp = consola.nextInt();
                                                    sumaCantidad += dinerp;
                                                    DineroO = dinerp;
                                                } else {
                                                    if (i == 10) {
                                                        var mes = "Noviembre";
                                                        System.out.println("Ingresa la cantidad que ingresaste en " + mes);
                                                        dinerp = consola.nextInt();
                                                        sumaCantidad += dinerp;
                                                        DineroN = dinerp;
                                                    } else {
                                                        if (i == 11) {
                                                            var mes = "Diciembre";
                                                            System.out.println("Ingresa la cantidad que ingresaste en " + mes);
                                                            dinerp = consola.nextInt();
                                                            sumaCantidad += dinerp;
                                                            DineroD += dinerp;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            
       

        }
        
             System.out.println("El dinero que ahorrado por meses");
        System.out.println("ENERO:" + DineroE);
        System.out.println("FEBRERO:" + DineroF);
        System.out.println("MARZO:" + DineroM);
        System.out.println("ABRIL:" + DineroA);
        System.out.println("MAYO: " + DineroMA);
        System.out.println("JUNIO: " + DineroJ);
        System.out.println("JULIO: " + DineroJU);
        System.out.println("AGOSTO: " + DineroAG);
        System.out.println("SEPTIEMBRE: " + DineroS);
        System.out.println("OCTUBRE: " + DineroO);
        System.out.println("NOVIEMBRE: " + DineroN);
        System.out.println("DICIEMBRE: " + DineroD);
        System.out.println("El dinero ahorrado total en todo el ano es de: " + sumaCantidad);

        //CODIGO USANDO EL CICLO WHILE
        
       System.out.println("CODIGO ESCRITO CON EL CICLO WHILE");
       
       //REINICIAMOS VARIABLES
       
       sumaCantidad = 0;

       DineroE = 0;
       DineroF = 0;
       DineroM = 0;
       DineroA = 0;
       DineroMA = 0;
       DineroJ = 0;
       DineroJU = 0;
       DineroAG = 0;
       DineroS = 0;
       DineroO = 0;
       DineroN = 0;
       DineroD = 0;
       
       int i = 0;
       
       
        while (i < 12) {            
            if (i == 0) {
                var mes = "Enero";
                System.out.println("Ingresa la cantidad que ingresaste en " + mes);
                dinerp = consola.nextInt();
                sumaCantidad += dinerp;
                DineroE = dinerp;
            } else {
                if (i == 1) {
                    var mes = "Febrero";
                    System.out.println("Ingresa la cantidad que ingresaste en " + mes);
                    dinerp = consola.nextInt();
                    sumaCantidad += dinerp;
                    DineroF = dinerp;

                } else {
                    if (i == 2) {
                        var mes = "Marzo";
                        System.out.println("Ingresa la cantidad que ingresaste en " + mes);
                        dinerp = consola.nextInt();
                        sumaCantidad += dinerp;
                        DineroM = dinerp;
                    } else {
                        if (i == 3) {
                            var mes = "Abri";
                            System.out.println("Ingresa la cantidad que ingresaste en " + mes);
                            dinerp = consola.nextInt();
                            sumaCantidad += dinerp;
                            DineroA = dinerp;
                        } else {
                            if (i == 4) {
                                var mes = "Mayo";
                                System.out.println("Ingresa la cantidad que ingresaste en " + mes);
                                dinerp = consola.nextInt();
                                sumaCantidad += dinerp;
                                DineroMA = dinerp;
                            } else {
                                if (i == 5) {
                                    var mes = "Junio";
                                    System.out.println("Ingresa la cantidad que ingresaste en " + mes);
                                    dinerp = consola.nextInt();
                                    sumaCantidad += dinerp;
                                    DineroJ = dinerp;
                                } else {
                                    if (i == 6) {
                                        var mes = "Julio";
                                        System.out.println("Ingresa la cantidad que ingresaste en " + mes);
                                        dinerp = consola.nextInt();
                                        sumaCantidad += dinerp;
                                        DineroJU = dinerp;
                                    } else {
                                        if (i == 7) {
                                            var mes = "Agosto";
                                            System.out.println("Ingresa la cantidad que ingresaste en " + mes);
                                            dinerp = consola.nextInt();
                                            sumaCantidad += dinerp;
                                            DineroAG = dinerp;
                                        } else {
                                            if (i == 8) {
                                                var mes = "Septiembre";
                                                System.out.println("Ingresa la cantidad que ingresaste en " + mes);
                                                dinerp = consola.nextInt();
                                                sumaCantidad += dinerp;
                                                DineroS = dinerp;
                                            } else {
                                                if (i == 9) {
                                                    var mes = "Octubre";
                                                    System.out.println("Ingresa la cantidad que ingresaste en " + mes);
                                                    dinerp = consola.nextInt();
                                                    sumaCantidad += dinerp;
                                                    DineroO = dinerp;
                                                } else {
                                                    if (i == 10) {
                                                        var mes = "Noviembre";
                                                        System.out.println("Ingresa la cantidad que ingresaste en " + mes);
                                                        dinerp = consola.nextInt();
                                                        sumaCantidad += dinerp;
                                                        DineroN = dinerp;
                                                    } else {
                                                        if (i == 11) {
                                                            var mes = "Diciembre";
                                                            System.out.println("Ingresa la cantidad que ingresaste en " + mes);
                                                            dinerp = consola.nextInt();
                                                            sumaCantidad += dinerp;
                                                            DineroD += dinerp;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            i++;
            
            
        }
        System.out.println("El dinero que ahorrado por meses");
        System.out.println("ENERO:" + DineroE);
        System.out.println("FEBRERO:" + DineroF);
        System.out.println("MARZO:" + DineroM);
        System.out.println("ABRIL:" + DineroA);
        System.out.println("MAYO: " + DineroMA);
        System.out.println("JUNIO: " + DineroJ);
        System.out.println("JULIO: " + DineroJU);
        System.out.println("AGOSTO: " + DineroAG);
        System.out.println("SEPTIEMBRE: " + DineroS);
        System.out.println("OCTUBRE: " + DineroO);
        System.out.println("NOVIEMBRE: " + DineroN);
        System.out.println("DICIEMBRE: " + DineroD);
        System.out.println("El dinero ahorrado total en todo el ano es de: " + sumaCantidad);
        
         //CODIGO USANDO EL CICLO DO-WHILE
        
       System.out.println("CODIGO ESCRITO CON EL CICLO DO-WHILE");
       
       //REINICIAMOS VARIABLES
       
       sumaCantidad = 0;

       DineroE = 0;
       DineroF = 0;
       DineroM = 0;
       DineroA = 0;
       DineroMA = 0;
       DineroJ = 0;
       DineroJU = 0;
       DineroAG = 0;
       DineroS = 0;
       DineroO = 0;
       DineroN = 0;
       DineroD = 0;
       
       i = 0;
       
       do{
           if (i == 0) {
                var mes = "Enero";
                System.out.println("Ingresa la cantidad que ingresaste en " + mes);
                dinerp = consola.nextInt();
                sumaCantidad += dinerp;
                DineroE = dinerp;
            } else {
                if (i == 1) {
                    var mes = "Febrero";
                    System.out.println("Ingresa la cantidad que ingresaste en " + mes);
                    dinerp = consola.nextInt();
                    sumaCantidad += dinerp;
                    DineroF = dinerp;

                } else {
                    if (i == 2) {
                        var mes = "Marzo";
                        System.out.println("Ingresa la cantidad que ingresaste en " + mes);
                        dinerp = consola.nextInt();
                        sumaCantidad += dinerp;
                        DineroM = dinerp;
                    } else {
                        if (i == 3) {
                            var mes = "Abri";
                            System.out.println("Ingresa la cantidad que ingresaste en " + mes);
                            dinerp = consola.nextInt();
                            sumaCantidad += dinerp;
                            DineroA = dinerp;
                        } else {
                            if (i == 4) {
                                var mes = "Mayo";
                                System.out.println("Ingresa la cantidad que ingresaste en " + mes);
                                dinerp = consola.nextInt();
                                sumaCantidad += dinerp;
                                DineroMA = dinerp;
                            } else {
                                if (i == 5) {
                                    var mes = "Junio";
                                    System.out.println("Ingresa la cantidad que ingresaste en " + mes);
                                    dinerp = consola.nextInt();
                                    sumaCantidad += dinerp;
                                    DineroJ = dinerp;
                                } else {
                                    if (i == 6) {
                                        var mes = "Julio";
                                        System.out.println("Ingresa la cantidad que ingresaste en " + mes);
                                        dinerp = consola.nextInt();
                                        sumaCantidad += dinerp;
                                        DineroJU = dinerp;
                                    } else {
                                        if (i == 7) {
                                            var mes = "Agosto";
                                            System.out.println("Ingresa la cantidad que ingresaste en " + mes);
                                            dinerp = consola.nextInt();
                                            sumaCantidad += dinerp;
                                            DineroAG = dinerp;
                                        } else {
                                            if (i == 8) {
                                                var mes = "Septiembre";
                                                System.out.println("Ingresa la cantidad que ingresaste en " + mes);
                                                dinerp = consola.nextInt();
                                                sumaCantidad += dinerp;
                                                DineroS = dinerp;
                                            } else {
                                                if (i == 9) {
                                                    var mes = "Octubre";
                                                    System.out.println("Ingresa la cantidad que ingresaste en " + mes);
                                                    dinerp = consola.nextInt();
                                                    sumaCantidad += dinerp;
                                                    DineroO = dinerp;
                                                } else {
                                                    if (i == 10) {
                                                        var mes = "Noviembre";
                                                        System.out.println("Ingresa la cantidad que ingresaste en " + mes);
                                                        dinerp = consola.nextInt();
                                                        sumaCantidad += dinerp;
                                                        DineroN = dinerp;
                                                    } else {
                                                        if (i == 11) {
                                                            var mes = "Diciembre";
                                                            System.out.println("Ingresa la cantidad que ingresaste en " + mes);
                                                            dinerp = consola.nextInt();
                                                            sumaCantidad += dinerp;
                                                            DineroD += dinerp;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            i++;
            
            
       }while(i<12);
       
       
  
        System.out.println("El dinero que ahorrado por meses");
        System.out.println("ENERO:" + DineroE);
        System.out.println("FEBRERO:" + DineroF);
        System.out.println("MARZO:" + DineroM);
        System.out.println("ABRIL:" + DineroA);
        System.out.println("MAYO: " + DineroMA);
        System.out.println("JUNIO: " + DineroJ);
        System.out.println("JULIO: " + DineroJU);
        System.out.println("AGOSTO: " + DineroAG);
        System.out.println("SEPTIEMBRE: " + DineroS);
        System.out.println("OCTUBRE: " + DineroO);
        System.out.println("NOVIEMBRE: " + DineroN);
        System.out.println("DICIEMBRE: " + DineroD);
        System.out.println("El dinero ahorrado total en todo el ano es de: " + sumaCantidad);
    }
    
    

    
}
