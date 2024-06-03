Algoritmo PromedioEdades
    Definir n, suma, i como Entero
    Definir promedio como Real
    Escribir "Introduce la cantidad de alumnos:"
    Leer n
    Definir edades como Entero  
    Dimension edades[n]  
	
    Para i <- 0 Hasta n - 1 Hacer
        Escribir "Introduce la edad del alumno ", (i + 1)
        Leer edades[n]
        suma <- suma + edades[n] 
    FinPara
	
    promedio <- suma / n
	
    Escribir "Listado de edades de los alumnos:"
    Para i <- 0 Hasta n - 1 Hacer
        Escribir "Edad del alumno ", (i + 1), ": ", edades[n]
    FinPara
	
    Escribir "El promedio de edades es: ", promedio
FinAlgoritmo
