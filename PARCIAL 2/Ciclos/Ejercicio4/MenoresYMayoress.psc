Algoritmo MenoresYmayores
	
    Dimension cantidad, numero como Entero
    Dimension menorOMayor como Cadena
	
    Escribir "USO DEL CICLO FOR"
    Escribir "Cuantos numeros vamos a valorar?"
    Leer cantidad
	
    Para i <- 0 Hasta cantidad - 1 Con Paso 1 Hacer
        Escribir "______________"
        Escribir "Escribe el valor del numero " + (i + 1)
        Leer numero
		
        Si numero < 0 Entonces
            menorOMayor <- "Menor"
        Sino
            menorOMayor <- "Mayor"
        Fin Si
		
        Escribir "El numero " + numero + " es " + menorOMayor + " que cero."
        Escribir "______________"
    Fin Para
	
    Escribir "USO DEL CICLO WHILE"
    i <- 0
	
    Mientras i < cantidad Hacer
        Escribir "______________"
        Escribir "Escribe el valor del numero " + (i + 1)
        Leer numero
		
        Si numero < 0 Entonces
            menorOMayor <- "Menor"
        Sino
            menorOMayor <- "Mayor"
        Fin Si
		
        Escribir "El numero " + numero + " es " + menorOMayor + " que cero."
        Escribir "______________"
		
        i <- i + 1
    Fin Mientras
	
    Escribir "USO DEL CICLO DO-WHILE"
    i <- 0
	
    Repetir
        Escribir "______________"
        Escribir "Escribe el valor del numero " + (i + 1)
        Leer numero
		
        Si numero < 0 Entonces
            menorOMayor <- "Menor"
        Sino
            menorOMayor <- "Mayor"
        Fin Si
		
        Escribir "El numero " + numero + " es " + menorOMayor + " que cero."
        Escribir "______________"
		
        i <- i + 1
    Hasta Que i >= cantidad
	
Fin Algoritmo
