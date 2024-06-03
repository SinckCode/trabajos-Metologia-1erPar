Algoritmo EXAMEN
	
    Definir trabajadores, acumulador como Entero
    acumulador <- 0
    
    Escribir "Cuantos trabajadores va a registrar?"
    Leer trabajadores
    
    Para i <- 1 Hasta trabajadores Paso 1
        Definir nombre como Cadena
        Definir ganas, sueldo, descuento como Entero
        
        Escribir "Cual es tu nombre?"
        Leer nombre
        
        Escribir "Cuanto es lo que ganas"
        Leer ganas
        
        // Calcular el descuento y el sueldo
        Si ganas <= 1500 Entonces
            descuento <- (ganas * 5) / 100
        Sino
            Si ganas <= 3000 Entonces
                descuento <- (ganas * 7) / 100
            Sino
                Si ganas <= 4500 Entonces
                    descuento <- (ganas * 9) / 100
                FinSi
            FinSi
        FinSi
        
        sueldo <- ganas - descuento
        
        // Mostrar resultados
        Escribir "-------------------"
        Escribir nombre + " tu sueldo es ", sueldo, " y tu impuesto fue de ", descuento
        Escribir "-------------------"
        
        acumulador <- acumulador + sueldo // Acumula el sueldo
    FinPara
    
    Escribir "Nomina total es de ", acumulador // Muestra la nómina total
    
FinAlgoritmo
