Algoritmo CantMaYmen
    Definir numIngres, i, max, min Como Entero
    Definir valores Como Real
    Escribir "Cuantos numeros vas a ingresar?"
    Leer numIngres
    Dimension valores[numIngres]
    
    max = 0
    min = 0
    
    Para i = 0 Hasta numIngres - 1 Hacer
        Escribir "Escribe el valor del num ", (i + 1)
        Leer valores[numIngres]
        
        Si i = 0 Entonces
            max = valores[numIngres]
            min = valores[numIngres]
        Sino
            Si valores[numIngres] > max Entonces
                max = valores[numIngres]
            FinSi
            Si valores[numIngres] < min Entonces
                min = valores[numIngres]
            FinSi
        FinSi
    FinPara
    
    Escribir "El valor máximo es: ", max
    Escribir "El valor mínimo es: ", min
FinAlgoritmo
