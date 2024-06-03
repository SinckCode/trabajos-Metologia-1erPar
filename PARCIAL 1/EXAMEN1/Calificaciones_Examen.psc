Algoritmo Calificaciones_Examen
	
	Escribir "Ingresa la calificacion numero 1"
	Leer cal1
	Escribir "Ingresa la calificacion numero 2"
	Leer cal2
	
	porcen1 = (cal1 * 40) /100
	porcen2 = (cal2 * 60) /100
	sumaPorcen = porcen1 + porcen2
	
	Si sumaPorcen > 60 Entonces
		Escribir "FELICIDADES PASASTE"
	SiNo
		Escribir "FELICIDADES PASASTE PERO AL EXTRA"
	Fin Si
	
FinAlgoritmo
