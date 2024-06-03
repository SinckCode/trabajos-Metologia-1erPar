Algoritmo OFAD_22_Votar
	
	Escribir "Dime tu edad"
	Leer edad
	
	Si edad >= 18 Entonces
		Escribir "Tienes INE? 1 = si 0 = no"
		Leer ine
		Si ine == 1 Entonces
			puedeV = "Puedes VOTAR"
		SiNo
			puedeV = "NO Puedes VOTAR"
		Fin Si
	SiNo
		puedeV = "NO Puedes VOTAR"
	Fin Si
	
	Escribir  puedeV
	
FinAlgoritmo
