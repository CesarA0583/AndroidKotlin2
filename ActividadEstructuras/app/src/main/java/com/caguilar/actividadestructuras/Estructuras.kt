package com.caguilar.actividadestructuras

fun main() {
    // 1. IF/ELSE: Verificar si una persona puede votar
    val edad = 18
    if (edad >= 18) {
        println("Puede votar")
    } else {
        println("No puede votar")
    }

    // 2. IF/ELSE: Comparar dos números
    val num1 = 10
    val num2 = 20
    if (num1 > num2) {
        println("$num1 es mayor que $num2")
    } else if (num1 < num2) {
        println("$num1 es menor que $num2")
    } else {
        println("$num1 es igual a $num2")
    }

    // 3. IF/ELSE: Verificar si un número es positivo
    val numero = -5
    if (numero > 0) {
        println("El número es positivo")
    } else if (numero < 0) {
        println("El número es negativo")
    } else {
        println("El número es cero")
    }

    // 4. WHEN: Clasificar nota de un alumno (1 al 10)
    val nota = 7
    val clasificacion = when (nota) {
        in 1..4 -> "Reprobado"
        in 5..6 -> "Regular"
        in 7..8 -> "Bueno"
        in 9..10 -> "Aprobado"
        else -> "Nota inválida"
    }
    println("Clasificación: $clasificacion")

    // 5. FOR: Mostrar números del 1 al 100
    println("Números del 1 al 100:")
    for (i in 1..100) {
        print("$i ")
    }
    println("\n")

    // 6. WHILE: Contador hasta 50
    var contador = 1
    println("Contador con while hasta 50:")
    while (contador <= 50) {
        print("$contador ")
        contador++
    }
    println("\n")

    // 7. DO WHILE: 5 intentos
    var intentos = 1
    println("Ciclo do..while con 5 intentos:")
    do {
        println("Intento $intentos")
        intentos++
    } while (intentos <= 5)

    // 8. Arreglo y mostrar datos
    val arreglo = arrayOf("Toyota", "Mazda", "Kia", "Honda")
    println("Elementos del arreglo:")
    for (elemento in arreglo) {
        println(elemento)
    }

    // 9. Lista y mostrar datos
    val lista = listOf("Ana", "Luis", "Carlos", "María")
    println("Elementos de la lista:")
    for (nombre in lista) {
        println(nombre)
    }
}
