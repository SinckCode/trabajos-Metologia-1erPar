Algoritmo OFAD_26_PaqueInter
	
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
		Si donde = 1 Entonces
			AmerN = 11
			costo = AmerN * peso
		SiNo
			Si donde = 2 Entonces
				AmerC = 10
				costo = AmerC * peso
			SiNo
				Si donde = 3 Entonces
					AmerS = 12
					costo = AmerS * peso
				SiNo
					Si donde = 5 Entonces
						Asia = 27
						costo = Asia * peso
					SiNo
						Europ = 24
						costo = Europ * peso
					Fin Si
				Fin Si
			Fin Si
		Fin Si
	Fin Si
	
	Escribir "El costo de tu envio será ", costo
FinAlgoritmo
