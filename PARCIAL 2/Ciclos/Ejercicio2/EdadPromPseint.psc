Proceso EdadProm
    Definir consola como Entero
    Definir ninos, sumaEdades como Entero
    Definir edad como Entero
    Definir promedio como Real
    Definir i como Entero
	
    Escribir "Escribe la cantidad de niños"
    Leer ninos
    sumaEdades <- 0
	
    Para i <- 1 Hasta ninos Con Paso 1 Hacer
        Escribir "Ingrese la edad del alumno ", i, ": "
        Leer edad
        sumaEdades <- sumaEdades + edad
    Fin Para
	
    promedio <- sumaEdades / ninos
    Escribir "La edad promedio de los ", ninos, " alumnos es: ", promedio
	
    Escribir "AHORA CON CICLO WHILE"
    i <- 1
    sumaEdades <- 0
	
    Mientras i <= ninos Hacer
        Escribir "Ingrese la edad del alumno ", i, ": "
        Leer edad
        sumaEdades <- sumaEdades + edad
        i <- i + 1
    Fin Mientras
	
    promedio <- sumaEdades / ninos
    Escribir "La edad promedio de los ", ninos, " alumnos es: ", promedio
	
    Escribir "AHORA CON CICLO DO-WHILE"
    i <- 1
    sumaEdades <- 0
    Repetir
        Escribir "Ingrese la edad del alumno ", i, ": "
        Leer edad
        sumaEdades <- sumaEdades + edad
        i <- i + 1
    Hasta Que i > ninos
	
    promedio <- sumaEdades / ninos
    Escribir "La edad promedio de los ", ninos, " alumnos es: ", promedio
Fin Proceso
