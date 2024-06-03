Algoritmo PromedioEdades
    Definir n, suma, i como Entero
    Definir promedio como Real
    Escribir "Introduce la cantidad de alumnos:"
    Leer n
    Dimension edades[n]
	
    Para i <- 0 Hasta n - 1 Hacer
        Escribir "Introduce la edad del alumno ", (i + 1)
        Leer edades[n]  // Cambiar edades[n] a edades[i]
        suma <- suma + edades[n]  // Cambiar edades[n] a edades[i]
    FinPara
	
    promedioo(suma, n)
    listado(edades, n)  // Pasar edades y n como argumentos a listado
	
FinAlgoritmo

SubAlgoritmo promedioo(suma, n)
    promedio <- suma / n
    Escribir "El promedio de edades es: ", promedio 
FinSubAlgoritmo

SubAlgoritmo listado(edades, n)  // Cambiar edades[n] a edades y ajustar la firma del subalgoritmo
    Escribir "Listado de edades de los alumnos:"
    Para i <- 0 Hasta n - 1 Hacer
        Escribir "Edad del alumno ", (i + 1), ": ", edades[n]  // Cambiar edades[n] a edades[i]
    FinPara
FinSubAlgoritmo
