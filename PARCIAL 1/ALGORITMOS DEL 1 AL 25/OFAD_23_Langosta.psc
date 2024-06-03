Algoritmo OFAD_23_Langosta
	
	Escribir "Dime la cantidad de personas"
	Leer cantidad
	Si cantidad <= 100 Entonces
		platillo = 95
	SiNo
		Si cantidad > 300 Entonces
			platillo = 75
		SiNo
			platillo = 85
		Fin Si
	Fin Si
	
	precio = cantidad * platillo
	
	Escribir "El presupuesto para ", cantidad," personas"
	Escribir "Es de ", precio
	
FinAlgoritmo
