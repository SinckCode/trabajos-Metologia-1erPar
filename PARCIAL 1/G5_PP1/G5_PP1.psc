    Algoritmo G5_PP1
	
	//Se introducen los datos de entrada
	Escribir "BANDIDO DE PELUCHE - Banca en Línea"
	Escribir ""
	Escribir "Saldo anterior"
	Leer saldoAnt
	
	Escribir "Monto total de cargos"
	Leer montoCargos
	
	Escribir "Pago del corte anterior"
	Leer pagoAnt
	
	//Calculamos el pago minimo
	porcentajeMinimo = 0.15
	pagoMinimoAnt = saldoAnt * porcentajeMinimo
	
	//Condicionamos el Pago para ver si es meno al pago MINIMO
	//Si es menor el pago entonces nos generará una multa
	Si pagoAnt < pagoMinimoAnt Entonces
		interes = saldoAnt * 0.12
		multa = 200
		Escribir "No se ha realizado el pago minimo"
		Escribir "Interés: $", multa
		Escribir "Multa por adeudo: $", multa
	Fin Si
	
	//En caso de que el pago haya sido mayor entonces no se
	//modifica nada, simplemente haremos otros calculos
	//En este caso estamos generando los datos de salida
	//El saldo que le aparecerá al cliente, el pagoMinimo que deberá
	//hacer despues y el pago nuevo para no Generar Intereses
	saldo = saldoAnt + montoCargos + interes + multa - pagoAnt
	pagoMinimo = saldo * pocentajeMinimo
	pagoNoInteres = saldo * 0.85
	
	//Una vez calculado todo empezamos a dar los datos de salida
	// Saldo, Pago Minimo y Pago No Intereses
	
	Escribir "Saldo actual: $", saldo
	Escribir "Pago minimo: $", pagoMinimo
	Escribir "Pago para no generar interés", pagoNoInteres
	
FinAlgoritmo
