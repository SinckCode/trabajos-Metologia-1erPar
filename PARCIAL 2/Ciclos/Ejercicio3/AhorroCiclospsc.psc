Algoritmo AhorroCiclos
	
    Definir sumaCantidad, DineroE, DineroF, DineroM, DineroA, DineroMA, DineroJ, DineroJU, DineroAG, DineroS, DineroO, DineroN, DineroD, dinerp como Entero
    
    sumaCantidad <- 0
    DineroE <- 0
    DineroF <- 0
    DineroM <- 0
    DineroA <- 0
    DineroMA <- 0
    DineroJ <- 0
    DineroJU <- 0
    DineroAG <- 0
    DineroS <- 0
    DineroO <- 0
    DineroN <- 0
    DineroD <- 0
    
    // CODIGO USANDO EL CICLO FOR
    Escribir "CODIGO ESCRITO CON EL CICLO FOR"
    
    Para i <- 0 Hasta 11 Con Paso 1 Hacer
        Si i = 0 Entonces
            mes <- "Enero"
            Escribir "Ingresa la cantidad que ingresaste en " + mes
            Leer dinerp
            sumaCantidad <- sumaCantidad + dinerp
            DineroE <- dinerp
        Sino
            Si i = 1 Entonces
                mes <- "Febrero"
                Escribir "Ingresa la cantidad que ingresaste en " + mes
                Leer dinerp
                sumaCantidad <- sumaCantidad + dinerp
                DineroF <- dinerp
            Sino
                Si i = 2 Entonces
                    mes <- "Marzo"
                    Escribir "Ingresa la cantidad que ingresaste en " + mes
                    Leer dinerp
                    sumaCantidad <- sumaCantidad + dinerp
                    DineroM <- dinerp
                Sino
                    Si i = 3 Entonces
                        mes <- "Abril"
                        Escribir "Ingresa la cantidad que ingresaste en " + mes
                        Leer dinerp
                        sumaCantidad <- sumaCantidad + dinerp
                        DineroA <- dinerp
                    Sino
                        Si i = 4 Entonces
                            mes <- "Mayo"
                            Escribir "Ingresa la cantidad que ingresaste en " + mes
                            Leer dinerp
                            sumaCantidad <- sumaCantidad + dinerp
                            DineroMA <- dinerp
                        Sino
                            Si i = 5 Entonces
                                mes <- "Junio"
                                Escribir "Ingresa la cantidad que ingresaste en " + mes
                                Leer dinerp
                                sumaCantidad <- sumaCantidad + dinerp
                                DineroJ <- dinerp
                            Sino
                                Si i = 6 Entonces
                                    mes <- "Julio"
                                    Escribir "Ingresa la cantidad que ingresaste en " + mes
                                    Leer dinerp
                                    sumaCantidad <- sumaCantidad + dinerp
                                    DineroJU <- dinerp
                                Sino
                                    Si i = 7 Entonces
                                        mes <- "Agosto"
                                        Escribir "Ingresa la cantidad que ingresaste en " + mes
                                        Leer dinerp
                                        sumaCantidad <- sumaCantidad + dinerp
                                        DineroAG <- dinerp
                                    Sino
                                        Si i = 8 Entonces
                                            mes <- "Septiembre"
                                            Escribir "Ingresa la cantidad que ingresaste en " + mes
                                            Leer dinerp
                                            sumaCantidad <- sumaCantidad + dinerp
                                            DineroS <- dinerp
                                        Sino
                                            Si i = 9 Entonces
                                                mes <- "Octubre"
                                                Escribir "Ingresa la cantidad que ingresaste en " + mes
                                                Leer dinerp
                                                sumaCantidad <- sumaCantidad + dinerp
                                                DineroO <- dinerp
                                            Sino
                                                Si i = 10 Entonces
                                                    mes <- "Noviembre"
                                                    Escribir "Ingresa la cantidad que ingresaste en " + mes
                                                    Leer dinerp
                                                    sumaCantidad <- sumaCantidad + dinerp
                                                    DineroN <- dinerp
                                                Sino
                                                    Si i = 11 Entonces
                                                        mes <- "Diciembre"
                                                        Escribir "Ingresa la cantidad que ingresaste en " + mes
                                                        Leer dinerp
                                                        sumaCantidad <- sumaCantidad + dinerp
                                                        DineroD <- DineroD + dinerp
                                                    Fin Si
                                                Fin Si
                                            Fin Si
                                        Fin Si
                                    Fin Si
                                Fin Si
                            Fin Si
                        Fin Si
                    Fin Si
                Fin Si
            Fin Si
        Fin Si
    Fin Para
    
    Escribir "El dinero que ahorrado por meses"
    Escribir "ENERO:" + DineroE
    Escribir "FEBRERO:" + DineroF
    Escribir "MARZO:" + DineroM
    Escribir "ABRIL:" + DineroA
    Escribir "MAYO: " + DineroMA
    Escribir "JUNIO: " + DineroJ
    Escribir "JULIO: " + DineroJU
    Escribir "AGOSTO: " + DineroAG
    Escribir "SEPTIEMBRE: " + DineroS
    Escribir "OCTUBRE: " + DineroO
    Escribir "NOVIEMBRE: " + DineroN
    Escribir "DICIEMBRE: " + DineroD
    Escribir "El dinero ahorrado total en todo el ano es de: " + sumaCantidad
	
    // CODIGO USANDO EL CICLO WHILE
    Escribir "CODIGO ESCRITO CON EL CICLO WHILE"
    
    // REINICIAMOS VARIABLES
    sumaCantidad <- 0
    DineroE <- 0
    DineroF <- 0
    DineroM <- 0
    DineroA <- 0
    DineroMA <- 0
    DineroJ <- 0
    DineroJU <- 0
    DineroAG <- 0
    DineroS <- 0
    DineroO <- 0
    DineroN <- 0
    DineroD <- 0
    
    i <- 0
    
    Mientras i < 12 Hacer
        Si i = 0 Entonces
            mes <- "Enero"
            Escribir "Ingresa la cantidad que ingresaste en " + mes
            Leer dinerp
            sumaCantidad <- sumaCantidad + dinerp
            DineroE <- dinerp
        Sino
            Si i = 1 Entonces
                mes <- "Febrero"
                Escribir "Ingresa la cantidad que ingresaste en " + mes
                Leer dinerp
                sumaCantidad <- sumaCantidad + dinerp
                DineroF <- dinerp
            Sino
                Si i = 2 Entonces
                    mes <- "Marzo"
                    Escribir "Ingresa la cantidad que ingresaste en " + mes
                    Leer dinerp
                    sumaCantidad <- sumaCantidad + dinerp
                    DineroM <- dinerp
                Sino
                    Si i = 3 Entonces
                        mes <- "Abril"
                        Escribir "Ingresa la cantidad que ingresaste en " + mes
                        Leer dinerp
                        sumaCantidad <- sumaCantidad + dinerp
                        DineroA <- dinerp
                    Sino
                        Si i = 4 Entonces
                            mes <- "Mayo"
                            Escribir "Ingresa la cantidad que ingresaste en " + mes
                            Leer dinerp
                            sumaCantidad <- sumaCantidad + dinerp
                            DineroMA <- dinerp
                        Sino
                            Si i = 5 Entonces
                                mes <- "Junio"
                                Escribir "Ingresa la cantidad que ingresaste en " + mes
                                Leer dinerp
                                sumaCantidad <- sumaCantidad + dinerp
                                DineroJ <- dinerp
                            Sino
                                Si i = 6 Entonces
                                    mes <- "Julio"
                                    Escribir "Ingresa la cantidad que ingresaste en " + mes
                                    Leer dinerp
                                    sumaCantidad <- sumaCantidad + dinerp
                                    DineroJU <- dinerp
                                Sino
                                    Si i = 7 Entonces
                                        mes <- "Agosto"
                                        Escribir "Ingresa la cantidad que ingresaste en " + mes
                                        Leer dinerp
                                        sumaCantidad <- sumaCantidad + dinerp
                                        DineroAG <- dinerp
                                    Sino
                                        Si i = 8 Entonces
                                            mes <- "Septiembre"
                                            Escribir "Ingresa la cantidad que ingresaste en " + mes
                                            Leer dinerp
                                            sumaCantidad <- sumaCantidad + dinerp
                                            DineroS <- dinerp
                                        Sino
                                            Si i = 9 Entonces
                                                mes <- "Octubre"
                                                Escribir "Ingresa la cantidad que ingresaste en " + mes
                                                Leer dinerp
                                                sumaCantidad <- sumaCantidad + dinerp
                                                DineroO <- dinerp
                                            Sino
                                                Si i = 10 Entonces
                                                    mes <- "Noviembre"
                                                    Escribir "Ingresa la cantidad que ingresaste en " + mes
                                                    Leer dinerp
                                                    sumaCantidad <- sumaCantidad + dinerp
                                                    DineroN <- dinerp
                                                Sino
                                                    Si i = 11 Entonces
                                                        mes <- "Diciembre"
                                                        Escribir "Ingresa la cantidad que ingresaste en " + mes
                                                        Leer dinerp
                                                        sumaCantidad <- sumaCantidad + dinerp
                                                        DineroD <- DineroD + dinerp
                                                    Fin Si
                                                Fin Si
                                            Fin Si
                                        Fin Si
                                    Fin Si
                                Fin Si
                            Fin Si
                        Fin Si
                    Fin Si
                Fin Si
            Fin Si
        Fin Si
        i <- i + 1
    Fin Mientras
    
    Escribir "El dinero que ahorrado por meses"
    Escribir "ENERO:" + DineroE
    Escribir "FEBRERO:" + DineroF
    Escribir "MARZO:" + DineroM
    Escribir "ABRIL:" + DineroA
    Escribir "MAYO: " + DineroMA
    Escribir "JUNIO: " + DineroJ
    Escribir "JULIO: " + DineroJU
    Escribir "AGOSTO: " + DineroAG
    Escribir "SEPTIEMBRE: " + DineroS
    Escribir "OCTUBRE: " + DineroO
    Escribir "NOVIEMBRE: " + DineroN
    Escribir "DICIEMBRE: " + DineroD
    Escribir "El dinero ahorrado total en todo el ano es de: " + sumaCantidad
	
    // CODIGO USANDO EL CICLO DO-WHILE
    Escribir "CODIGO ESCRITO CON EL CICLO DO-WHILE"
    
    // REINICIAMOS VARIABLES
    sumaCantidad <- 0
    DineroE <- 0
    DineroF <- 0
    DineroM <- 0
    DineroA <- 0
    DineroMA <- 0
    DineroJ <- 0
    DineroJU <- 0
    DineroAG <- 0
    DineroS <- 0
    DineroO <- 0
    DineroN <- 0
    DineroD <- 0
    
    i <- 0
    
    Hacer
        Si i = 0 Entonces
            mes <- "Enero"
            Escribir "Ingresa la cantidad que ingresaste en " + mes
            Leer dinerp
            sumaCantidad <- sumaCantidad + dinerp
            DineroE <- dinerp
        Sino
            Si i = 1 Entonces
                mes <- "Febrero"
                Escribir "Ingresa la cantidad que ingresaste en " + mes
                Leer dinerp
                sumaCantidad <- sumaCantidad + dinerp
                DineroF <- dinerp
            Sino
                Si i = 2 Entonces
                    mes <- "Marzo"
                    Escribir "Ingresa la cantidad que ingresaste en " + mes
                    Leer dinerp
                    sumaCantidad <- sumaCantidad + dinerp
                    DineroM <- dinerp
                Sino
                    Si i = 3 Entonces
                        mes <- "Abril"
                        Escribir "Ingresa la cantidad que ingresaste en " + mes
                        Leer dinerp
                        sumaCantidad <- sumaCantidad + dinerp
                        DineroA <- dinerp
                    Sino
                        Si i = 4 Entonces
                            mes <- "Mayo"
                            Escribir "Ingresa la cantidad que ingresaste en " + mes
                            Leer dinerp
                            sumaCantidad <- sumaCantidad + dinerp
                            DineroMA <- dinerp
                        Sino
                            Si i = 5 Entonces
                                mes <- "Junio"
                                Escribir "Ingresa la cantidad que ingresaste en " + mes
                                Leer dinerp
                                sumaCantidad <- sumaCantidad + dinerp
                                DineroJ <- dinerp
                            Sino
                                Si i = 6 Entonces
                                    mes <- "Julio"
                                    Escribir "Ingresa la cantidad que ingresaste en " + mes
                                    Leer dinerp
                                    sumaCantidad <- sumaCantidad + dinerp
                                    DineroJU <- dinerp
                                Sino
                                    Si i = 7 Entonces
                                        mes <- "Agosto"
                                        Escribir "Ingresa la cantidad que ingresaste en " + mes
                                        Leer dinerp
                                        sumaCantidad <- sumaCantidad + dinerp
                                        DineroAG <- dinerp
                                    Sino
                                        Si i = 8 Entonces
                                            mes <- "Septiembre"
                                            Escribir "Ingresa la cantidad que ingresaste en " + mes
                                            Leer dinerp
                                            sumaCantidad <- sumaCantidad + dinerp
                                            DineroS <- dinerp
                                        Sino
                                            Si i = 9 Entonces
                                                mes <- "Octubre"
                                                Escribir "Ingresa la cantidad que ingresaste en " + mes
                                                Leer dinerp
                                                sumaCantidad <- sumaCantidad + dinerp
                                                DineroO <- dinerp
                                            Sino
                                                Si i = 10 Entonces
                                                    mes <- "Noviembre"
                                                    Escribir "Ingresa la cantidad que ingresaste en " + mes
                                                    Leer dinerp
                                                    sumaCantidad <- sumaCantidad + dinerp
                                                    DineroN <- dinerp
                                                Sino
                                                    Si i = 11 Entonces
                                                        mes <- "Diciembre"
                                                        Escribir "Ingresa la cantidad que ingresaste en " + mes
                                                        Leer dinerp
                                                        sumaCantidad <- sumaCantidad + dinerp
                                                        DineroD <- DineroD + dinerp
                                                    Fin Si
                                                Fin Si
                                            Fin Si
                                        Fin Si
                                    Fin Si
                                Fin Si
                            Fin Si
                        Fin Si
                    Fin Si
                Fin Si
            Fin Si
        Fin Si
        i <- i + 1
    Hasta Que i >= 12
    
    Escribir "El dinero que ahorrado por meses"
    Escribir "ENERO:" + DineroE
    Escribir "FEBRERO:" + DineroF
    Escribir "MARZO:" + DineroM
    Escribir "ABRIL:" + DineroA
    Escribir "MAYO: " + DineroMA
    Escribir "JUNIO: " + DineroJ
    Escribir "JULIO: " + DineroJU
    Escribir "AGOSTO: " + DineroAG
    Escribir "SEPTIEMBRE: " + DineroS
    Escribir "OCTUBRE: " + DineroO
    Escribir "NOVIEMBRE: " + DineroN
    Escribir "DICIEMBRE: " + DineroD
    Escribir "El dinero ahorrado total en todo el ano es de: " + sumaCantidad
    
Fin Algoritmo
