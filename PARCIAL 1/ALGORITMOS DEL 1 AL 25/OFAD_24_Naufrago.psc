Algoritmo OFAD_24_Naufrago
	
	Escribir "Cual es el tipo de tu hamburguesa"
	Escribir "TIPO 1 = Sencilla"
	Escribir "TIPO 2 = Doble"
	Escribir "TIPO 3 = Triple"
	Leer tipo
	Escribir "Cuantas vas a querer"
	Leer cuantas
	
	Si tipo = 1 Entonces
		precio = 20
	SiNo
		Si tipo = 2 Entonces
			precio = 25
		SiNo
			precio = 28
		Fin Si
	Fin Si
	
	total = cuantas * precio
	
	Escribir "Cual es tu tipo de pago"
	Escribir "Tarjeta = 1"
	Escribir "Efectivo = 0"
	Leer tipoP
	
	Si tipoP = 0 Entonces
		Escribir "El total a pagar es ", total
	SiNo
		total = total + total * 0.05
		Escribir "El total a pagar es ", total
	Fin Si
	
FinAlgoritmo
