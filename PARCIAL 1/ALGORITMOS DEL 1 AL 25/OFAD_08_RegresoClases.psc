Algoritmo OFAD_08_RegresoClases
	
	Escribir "Cuanto pago?"
	Leer total
	Escribir "Cuantos hijos en preescolar"
	Leer nP
	Escribir "Cuantos hijos en primaria"
	Leer nPr
	
	nPr2=nPr*1.5
	suma = nP+nPr2
	cP=total/suma
	TnP=nP*cP
	TnPr=nPr*cP
	
	Escribir "El total de gasto para los hijos de Primaria es ", TnPr
	Escribir "El total de gasto para los de prescolar es ", TnP
	
FinAlgoritmo
