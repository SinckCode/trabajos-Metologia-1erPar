Algoritmo OFAD_27_PaqInteSwitch
	
	Escribir "Cual es el peso de tu paqete?"
	Escribir "Escribelo en gramos"
	Leer peso
	
	Si peso > 5000 Entonces
		Escribir "Lo siento su paquete excede el peso"
	SiNo
		Escribir "De donde envia su paquete?"
		Escribir "América del norte = 1"
		Escribir "América Central = 2"
		Escribir "América del sur = 3"
		Escribir "Europa = 4"
		Escribir "Asia = 5"
		Leer donde
		
		Segun donde Hacer
			1:
				AmerN = 11
				costo = AmerN * peso
			2:
				AmerC = 10
				costo = AmerC * peso
			3:
				AmerS = 12
				costo = AmerS * peso
		    4:
				Asia = 27
				costo = Asia * peso
		    5:
				Europ = 24
				costo = Europ * peso
			De Otro Modo:
				Escribir "Favor de ingresar una opción"
		Fin Segun
		
	Fin Si
	
	Escribir "El costo de tu envio será ", costo
FinAlgoritmo
