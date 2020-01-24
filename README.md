# lab01-ARSW
Part I – Introduction to Java Threads
1.	Se realizó el siguiente código para imprimir números entre el rango A y B.
 
![img1](https://user-images.githubusercontent.com/48091585/73084920-d43f6980-3e9b-11ea-88f1-7cad59f8da3e.jpg)












2.	 
 1.	 Se crearon 3 threads de tipo CountThread asiganadole a cada uno los intervalos solicitados.
 
   2.	Se inicializaron los threads con start() 




   ![img2](https://user-images.githubusercontent.com/48091585/73087369-6a758e80-3ea0-11ea-992e-89f6d3edf275.jpg)













   3.	 La salida del programa fue:
 
   ![img3](https://user-images.githubusercontent.com/48091585/73087459-88db8a00-3ea0-11ea-8f18-a925d2cec230.jpg)

   4.	Podemos observar que al cambiar el método start() por el método run(), simplemente el programa se ejecuta y la salida sale       ordenadamente, mientras que en el método start() se evidencia el paralelismo por la salida del programa.
Part II – BBP Formule Exercise
1.	Se creo la clase PiThread que nos permite calcular la porción que se requiera de dígitos.
 

![img4](https://user-images.githubusercontent.com/48091585/73087540-a7da1c00-3ea0-11ea-8171-b90baaf1b5eb.jpg)






2.	Se modifico la función PiDigits.getDigits() de tal forma que recibiera un parámetro adicional, el cual corresponde al numero de hilos que se necesiten.
 
![img5](https://user-images.githubusercontent.com/48091585/73087629-cfc97f80-3ea0-11ea-988c-2a458a3adc68.jpg)




3.	 Se modifico la clase PiCalcTest
 ![img6](https://user-images.githubusercontent.com/48091585/73087758-fe475a80-3ea0-11ea-8b81-5a561ef1290c.jpg)

Part III - Performance Evaluation
1.  Para este punto se utilizó la herramienta jVisualVM para evaluar el rendimiento de la CPU, teniendo en cuenta que cada uno fue ejecutado con la cantidad de threads solicitados.
 ![img7](https://user-images.githubusercontent.com/48091585/73088491-5df23580-3ea2-11ea-8a60-2cf3cd7067c6.png)
 ![img8](https://user-images.githubusercontent.com/48091585/73088496-634f8000-3ea2-11ea-9748-7369f66dd1a7.png)
 ![img9](https://user-images.githubusercontent.com/48091585/73088505-664a7080-3ea2-11ea-9cf5-63a9540ba163.png)
 ![img10](https://user-images.githubusercontent.com/48091585/73088507-68143400-3ea2-11ea-9373-985524573917.png)
