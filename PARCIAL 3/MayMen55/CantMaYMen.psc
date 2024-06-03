Algoritmo CantMaYMen
    Definir numIngres, i, max, min Como Entero
    Definir valores Como Real
    Escribir "Cuantos numeros vas a ingresar?"
    Leer numIngres
    Dimension valores[numIngres]
    
    Para i = 1 Hasta numIngres  Hacer
        Escribir "Escribe el valor del num ", (i + 1)
        Leer valores[i]  // Cambiar valores[numIngres] a valores[i]
    FinPara
    
    valorarr(valores, numIngres, max, min)
	
FinAlgoritmo

SubAlgoritmo valorarr(valores, numIngres, max, min)
    max=valores[1];
	min=valores[1];
    Para i = 1 Hasta numIngres  Hacer
        Si valores[numIngres] > max Entonces
            max = valores[numIngres]
        FinSi
        Si valores[numIngres] < min Entonces
            min = valores[numIngres]
        FinSi
    FinPara
	
    Escribir "El valor máximo es: ", max
    Escribir "El valor mínimo es: ", min
FinSubAlgoritmo
