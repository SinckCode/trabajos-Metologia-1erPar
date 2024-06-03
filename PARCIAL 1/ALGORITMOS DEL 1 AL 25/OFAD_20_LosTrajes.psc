Algoritmo OFAD_20_LosTrajes
	
	Escribir "Ingresa el costo del articulo"
	Leer costArt
	Si costArt > 2500 Entonces
		descuento = (costArt*15) / 100
		postDesc = (costArt - descuento)
	SiNo
		descuento = (costArt*8) / 100
		postDesc = (costArt - descuento)
	Fin Si
	
	Escribir "El descuento es igual a ", descuento
	Escribir "El precio del articulo es de ", postDesc
	
FinAlgoritmo
