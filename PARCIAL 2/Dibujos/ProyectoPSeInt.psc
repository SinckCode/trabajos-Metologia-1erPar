Algoritmo ProyectoPSeInt
    Definir parar, figura, n Como Entero
    
    parar <- 1
    
    Mientras parar = 1 Hacer
        Escribir  "BIENVENIDO"
        Escribir "Que vamos a dibujar hoy?"
        Escribir "FIGURAS"
        Escribir "CUADRADO: 0"
        Escribir "TRIANGULO IZQ SUPERIOR: 1"
        Escribir "TRIANGULO DER SUPERIOR: 2"
        Escribir "TRIANGULO IZQ INFERIOR: 3"
        Escribir "TRIANGULO DER INFERIOR: 4"
        Escribir "ROMBO: 5"
        
        Leer figura
        
        Escribir "__________________________"
        Mostrar "De qué tamaño va a ser la figura?"
        Mostrar "__________________________"
        Leer n
        
        Segun figura Hacer
            Caso 0:
                Cuadrado(n)
            Caso 1:
                TriSupIzq(n)
            Caso 2:
                TriSupDer(n)
            Caso 3:
                TriInfIzq(n)
            Caso 4:
                TriInfDer(n)
            Caso 5:
                Rombo(n)
        FinSegun
        
        
        Mostrar "¿Quieres hacer otra figura?"
        Mostrar "1 = si 0 = no"
        Leer parar
        
    FinMientras
FinAlgoritmo

// Definición de las funciones
Funcion Cuadrado(n)
    Para i = 1 Hasta n Hacer
		Para j = 1 Hasta n Hacer
			Escribir " *" Sin Saltar;
		FinPara
		Escribir "";
	FinPara
FinFuncion

Funcion TriSupDer(n)
    Para i = 1 Hasta n Hacer
		Para j = 1 Hasta i Hacer
			Escribir "*" Sin Saltar;
		FinPara
		Escribir " ";
	FinPara
FinFuncion

Funcion TriSupIzq(n)
    Para i = 1 Hasta n Hacer
		Para j = 1 Hasta (n - i + 1) Hacer
			Escribir " " Sin Saltar;
		FinPara
		Para j = 1 Hasta i Hacer
			Escribir "*" Sin Saltar;
		FinPara
		Escribir "";
	FinPara
FinFuncion

Funcion TriInfDer(n)
    Para i = 1 Hasta n Hacer
		Para j = 1 Hasta (n - i + 1) Hacer
			Escribir "*" Sin Saltar;
		FinPara
		Escribir "";
	FinPara
FinFuncion

Funcion TriInfIzq(n)
	Para i = 1 Hasta n Hacer
		Para j = 1 Hasta i Hacer
			Escribir " " Sin Saltar;
		FinPara
		Para j = 1 Hasta (n - i + 1) Hacer
			Escribir "*" Sin Saltar;
		FinPara
		Escribir "";
	FinPara
FinFuncion

Funcion Rombo(n)
	// Parte superior del rombo
    Para i = 1 Hasta n Con Paso 1 Hacer
        Para j = 0 Hasta n - i - 1 Con Paso 1 Hacer
            Escribir "  " Sin Saltar;
        FinPara
        Para k = 0 Hasta 2 * i - 2 Con Paso 1 Hacer
            Escribir "* " Sin Saltar;
        FinPara
        Escribir "";
    FinPara
	
    // Parte inferior del rombo
    Para i = n - 1 Hasta 1 Con Paso -1 Hacer
        Para j = 0 Hasta n - i - 1 Con Paso 1 Hacer
            Escribir "  " Sin Saltar;
        FinPara
        Para k = 0 Hasta 2 * i - 2 Con Paso 1 Hacer
            Escribir "* " Sin Saltar;
        FinPara
        Escribir "";
    FinPara
FinFuncion

