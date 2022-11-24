﻿# Enterprise-Java-Development-1.08

Se utiliza la documentación de BigDecimal, se crea un método que acepte un BigDecimal y devuelva un doble del número BigDecimal redondeado a la centésima más cercana. Por ejemplo, 4,2545 debería devolver 4,25.

Se utiliza la documentación de BigDecimal, se crea un método que acepte un BigDecimal, se invierte el signo (si el parámetro es positivo, el resultado debe ser negativo y viceversa), se redondea el número a la décima más cercana y devuelve el resultado. Por ejemplo, 1,2345 debería devolver -1,2 y -45,67 debería devolver 45,7.

Suponga que está construyendo un sistema de inventario de coches. Todos los coches tienen un vinNumber, una make, un model y un mileage. Pero ningún coche es sólo un coche. Cada coche es un Sedan, un UtilityVehicle o un Truck. Los vehículos utilitarios tienen un booleano que representa si tienen fourWheelDrive. Los camiones tienen una towingCapacity numérica. Crea una clase abstracta llamada Car y 3 clases que extienden a Car llamadas Sedan, UtilityVehicle y Truck.

Supongamos que estás construyendo un servicio de streaming de vídeo. Todos los vídeos son series de televisión o películas. Crea las clases TvSeries y Movie que extienden la clase abstracta Video. Añade algunos métodos y propiedades a cada una.

Crea una interfaz IntList. Una IntList es simplemente una forma de almacenar una lista ordenada de enteros.

Todas las IntList deben tener un método add mediante el cual el usuario puede añadir un nuevo número a la lista.

Todas las IntList deben tener un método get mediante el cual los usuarios pueden recuperar un elemento por su id.

Necesitarás dos implementaciones de IntList.
La primera implementación es IntArrayList. IntArrayList debe almacenar los números en un array con una longitud de 10 por defecto. Cuando se llama al método add, primero hay que determinar si el array está lleno. Si lo está, crea un nuevo array que sea un 50% más grande, mueve todos los elementos al nuevo array y añade el nuevo elemento. (por ejemplo, un array de longitud 10 se incrementaría a 15)

La segunda implementación es IntVector. IntVector debe almacenar los números en un array con una longitud de 20 por defecto. Cuando se llama al método add, primero debe determinar si el array está lleno. Si lo está, crea un nuevo array que sea el doble del tamaño del array actual, mueve todos los elementos al nuevo array y añade el nuevo elemento. (por ejemplo, un array de longitud 10 se incrementaría a 20)
