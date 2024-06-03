Algoritmo OFAD_29_ElbancoSwitch
	
	Escribir "Tiene más de una tarjeta 1 = si 0 = no"
	Leer mas
	
	Si mas = 1 Entonces
		Escribir "Cual tarjeta vas a seleccionar para tu aumento?"
		Escribir "Tipo 1 = 1"
		Escribir "Tipo 2 = 2"
		Escribir "Tipo 3 = 3"
		Escribir "Otro tipo = 4"
		Leer tipo

		Segun tipo Hacer
			1:
				Escribir "Tu aumento será del 25%"
			2:
				Escribir "Tu aumento será del 35%"

			3:
				Escribir "Tu aumento será del 40%"

			De Otro Modo:
				Escribir "Tu aumento será del 50%"

		Fin Segun
	SiNo
		Escribir "Ingresa el tipo de tu tarjeta"
		Escribir "Tipo 1 = 1"
		Escribir "Tipo 2 = 2"
		Escribir "Tipo 3 = 3"
		Escribir "Otro tipo = 4"
		Leer tipo
		
		
		Segun tipo Hacer
			1:
				Escribir "Tu aumento será del 25%"
			2:
				Escribir "Tu aumento será del 35%"
				
			3:
				Escribir "Tu aumento será del 40%"
				
			De Otro Modo:
				Escribir "Tu aumento será del 50%"
		Fin Segun

	Fin Si
	
FinAlgoritmo
