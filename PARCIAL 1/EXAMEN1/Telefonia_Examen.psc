Algoritmo Telefonia_Examen
	
	Escribir "Ingresa los minutos en los que estuviste de pillo"
	Leer minutos
	
	Si minutos <= 5 Entonces
		costo = minutos * 5
	SiNo
		Si minutos <= 8 Entonces
			excedente = minutos - 5
			excedente2 = excedente * 0.8
			costo = excedente2 + 5
		SiNo
			Si minutos <= 10 Entonces
				excedente = minutos - 8
				excedente2 = excedente * 0.7
				costo = excedente2 + 5 + 2.4
			SiNo
				excedente = minutos - 10
				excedente2 = excedente * 0.5
				costo = excedente2 + 5 +2.4 + 1.4
			Fin Si
		Fin Si
	Fin Si
	
	Escribir "DIMELO AHORA, ACASO ERA DOMINGO?"
	Escribir "Si = 0, No = 1"
	Leer domingo
	Si domingo == 0 Entonces
		impuesto = costo * 0.03
		costo = costo + impuesto
	SiNo
		Escribir "Muy bien ahora dime, ERA MATUTINO O VESPERTINO?"
		Escribir "Matutino = 0, Vespertino = 1"
		Leer horario
		Si horario == 0 Entonces
			impuesto = costo * 0.15
			costo = costo + impuesto
		SiNo
			impuesto = costo * 0.10
			costo = costo + impuesto
		Fin Si
	Fin Si
	
	Escribir "Lo que vas a paga Y AHORA¡¡¡, es ", costo
	
FinAlgoritmo
