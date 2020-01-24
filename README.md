# lab01-ARSW
Part I – Introduction to Java Threads
1.	Se realizó el siguiente código para imprimir números entre el rango A y B.
 













2.	 
1.	 Se crearon 3 threads de tipo CountThread asiganadole a cada uno los intervalos solicitados.
 
2.	Se inicializaron los threads con start() 

















3.	 La salida del programa fue:
 


4.	Podemos observar que al cambiar el método start() por el método run(), simplemente el programa se ejecuta y la salida sale ordenadamente, mientras que en el método start() se evidencia el paralelismo por la salida del programa.
Part II – BBP Formule Exercise
1.	Se creo la clase PiThread que nos permite calcular la porción que se requiera de dígitos.
 








2.	Se modifico la función PiDigits.getDigits() de tal forma que recibiera un parámetro adicional, el cual corresponde al numero de hilos que se necesiten.
 




3.	 Se modifico la clase PiCalcTest
 
4.	

