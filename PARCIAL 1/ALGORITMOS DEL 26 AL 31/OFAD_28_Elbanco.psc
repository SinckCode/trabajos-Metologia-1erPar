Algoritmo OFAD_28_Elbanco
	
	Escribir "Tiene más de una tarjeta 1 = si 0 = no"
	Leer mas
	
	Si mas = 1 Entonces
		Escribir "Cual tarjeta vas a seleccionar para tu aumento?"
		Escribir "Tipo 1 = 1"
		Escribir "Tipo 2 = 2"
		Escribir "Tipo 3 = 3"
		Escribir "Otro tipo = 4"
		Leer tipo
		Si tipo = 1 Entonces
			Escribir "Tu aumento será del 25%"
		SiNo
			Si tipo = 2 Entonces
				Escribir "Tu aumento será del 35%"
			SiNo
				Si tipo = 3 Entonces
					Escribir "Tu aumento será del 40%"
				SiNo
					Escribir "Tu aumento será del 50%"
				Fin Si
			Fin Si
		Fin Si
	SiNo
		Escribir "Ingresa el tipo de tu tarjeta"
		Escribir "Tipo 1 = 1"
		Escribir "Tipo 2 = 2"
		Escribir "Tipo 3 = 3"
		Escribir "Otro tipo = 4"
		Leer tipo
		
		Si tipo = 1 Entonces
			Escribir "Tu aumento será del 25%"
		SiNo
			Si tipo = 2 Entonces
				Escribir "Tu aumento será del 35%"
			SiNo
				Si tipo = 3 Entonces
					Escribir "Tu aumento será del 40%"
				SiNo
					Escribir "Tu aumento será del 50%"
				Fin Si
			Fin Si
		Fin Si
	Fin Si
	
FinAlgoritmo
