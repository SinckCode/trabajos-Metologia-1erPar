Algoritmo OFAD_31_FebreroSwitch
	
	Escribir "Quieres comprar un regalo a tu ser querido?"
	Escribir "Si = 1 No = 0"
	Leer respuesta
	Si respuesta = 1 Entonces
		
		rep=0
		
		Mientras rep = 0 Hacer
			
			Escribir "Perfecto entonces empecemos"
			Escribir "Tenemos los siguientes articulos"
			Escribir "Tarjeta $10 o menos | Num. 1"
			Escribir "Chocolates $11.00 a $100.00 | Num. 2"
			Escribir "Flores $101.00 a $250.00 | Num. 3"
			Escribir "Anillo Más de $251.00| Num. 4"
			Leer valorr
			
			Segun valorr Hacer
				1:
					total = total + 10
					tarjeeta = tarjeeta + 1
				2:
					Escribir "Que precio le gustaria?"
					Escribir "1 para 11 | 2 para 100"
					Leer precioCh
					Si precioCh = 1 Entonces
						total = total + 11
					SiNo
						total = total + 100
					Fin Si
					chocolaaates = chocolaaates + 1
				3:
					Floresss = Floresss + 1
					Escribir "Que precio le gustaria?"
					Escribir "1 para 101 | 2 para 250"
					Leer precioFL
					Si precioFL = 1 Entonces
						total = total + 101
					SiNo
						total = total + 250
					Fin Si
					
				De Otro Modo:
					anillooo = anillooo + 1
					total = total + 251	
			Fin Segun
			Escribir "¿Quieres pedir más?"
			Escribir "Si = 1 | No = 0"
			Leer mas
			Si mas = 1 Entonces
				rep = 0
			SiNo
				rep = 1
			Fin Si
		Fin Mientras
		
		Escribir "Su pedido tuvo un valor de ", total
		Escribir "Usted pidio"
		Escribir tarjeeta, " tarjetas"
		Escribir chocolaaates, " chocolates"
		Escribir Floresss, " flores"
		Escribir anillooo, " anillo"
		
		Escribir "QUE TENGA UN EXCELENTE DIA"
		Escribir "gracias por su compra"
	SiNo
		Escribir "A bueno, que tenga buen dia!"
	Fin Si
	
FinAlgoritmo
