Algoritmo OFAD_25_Sueldo
	
	Escribir "Dime las horas trabajadas"
	Leer Horas
	Escribir "Costo de las horas"
	Leer costo
	
	
	Si Horas > 40 Entonces
		Horas2 = (Horas - 40) * 2
		pago = (Horas2 + 40) * costo
	SiNo
		pago = Horas * costo
	Fin Si
	
	Escribir "AHora vas a cobrar ", pago
FinAlgoritmo
