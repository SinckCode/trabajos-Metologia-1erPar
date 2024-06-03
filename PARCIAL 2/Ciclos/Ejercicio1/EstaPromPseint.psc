Proceso EstaProm
    Definir consola como Entero
    Definir miembros, sumaEstaturas como Entero
    Definir prom como Real
    Definir i como Entero
	
    Escribir "Escribe la cantidad de miembros"
    Leer miembros
    sumaEstaturas <- 0
	
    Para i <- 1 Hasta miembros Con Paso 1 Hacer
        Escribir "Escribe la estatura del miembro ", i
        Leer estatura
        Si estatura > 0 Entonces
            sumaEstaturas <- sumaEstaturas + estatura
        Sino
            Escribir "DEBES ESCRIBIR LAS ESTATURAS"
            i <- miembros + 1
        Fin Si
    Fin Para
	
    prom <- sumaEstaturas / miembros
    Escribir "La estatura promedio de las ", miembros, " personas es: ", prom
	
    Escribir "USO DEL WHILE"
    sumaEstaturas <- 0
    i <- 1
	
    Mientras i <= miembros Hacer
        Escribir "Escribe la estatura del miembro ", i
        Leer estatura
        Si estatura > 0 Entonces
            sumaEstaturas <- sumaEstaturas + estatura
        Sino
            Escribir "DEBES ESCRIBIR LAS ESTATURAS"
            i <- miembros + 1
        Fin Si
        i <- i + 1
    Fin Mientras
	
    prom <- sumaEstaturas / miembros
    Escribir "La estatura promedio de las ", miembros, " personas es: ", prom
	
    Escribir "USO DEL DO-WHILE"
    sumaEstaturas <- 0
    i <- 1
	
    Repetir
        Escribir "Escribe la estatura del miembro ", i
        Leer estatura
        Si estatura > 0 Entonces
            sumaEstaturas <- sumaEstaturas + estatura
        Sino
            Escribir "DEBES ESCRIBIR LAS ESTATURAS"
            i <- miembros + 1
        Fin Si
        i <- i + 1
    Hasta Que i > miembros
	
    prom <- sumaEstaturas / miembros
    Escribir "La estatura promedio de las ", miembros, " personas es: ", prom
Fin Proceso
