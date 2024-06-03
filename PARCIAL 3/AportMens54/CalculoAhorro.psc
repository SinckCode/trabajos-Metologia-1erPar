Algoritmo CalculoAhorro
    Definir cantAno como Real
    Dimension cantMeses[12]
    Dimension meses[12]
	
    meses[1] <- "ENERO"
    meses[2] <- "FEBRERO"
    meses[3] <- "MARZO"
    meses[4] <- "ABRIL"
    meses[5] <- "MAYO"
    meses[6] <- "JUNIO"
    meses[7] <- "JULIO"
    meses[8] <- "AGOSTO"
    meses[9] <- "SEPTIEMBRE"
    meses[10] <- "OCTUBRE"
    meses[11] <- "NOVIEMBRE"
    meses[12] <- "DICIEMBRE"
	
    Para i <- 1 Hasta 12 Con Paso 1 Hacer
        Escribir "Escribe la cantidad a ahorrar en el mes de ", meses[i]
        Leer cantMeses[i]
        cantAno <- cantAno + cantMeses[i]
    FinPara
	
    Escribir "La cantidad total ahorrada al año es de: ", cantAno
	
    Para i <- 1 Hasta 12 Con Paso 1 Hacer
        Escribir meses[i], " = ", cantMeses[i]
    FinPara
FinAlgoritmo
