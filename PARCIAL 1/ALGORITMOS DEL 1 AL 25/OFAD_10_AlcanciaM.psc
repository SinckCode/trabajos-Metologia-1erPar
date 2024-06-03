Algoritmo OFAD_10_AlcanciaM
	
	Escribir "Cuanto tienes ahorrado"
	Leer ahorro
	Escribir "Cuanto costo tu balon?"
	Leer balon
	Escribir "Cuanto costo tu playera?"
	Leer playera
	Escribir "Cuanto costaron tus tenis?"
	Leer tenis
	
	gasto = balon + playera + tenis;
	quedo = ahorro - balon - playera - tenis;
	
	Escribir "Le quedo de dinero = ", quedo;
	Escribir "Lo que gasto fue lo siguiente ", gasto;

FinAlgoritmo
