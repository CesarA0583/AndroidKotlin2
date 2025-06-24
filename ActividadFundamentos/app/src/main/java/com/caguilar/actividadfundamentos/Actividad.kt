package com.caguilar.actividadfundamentos

fun main() {
    // 10 val
    val nombre: String = "Cesar"
    val edad: Int = 30
    val altura: Double = 1.85
    val peso: Float = 75.5f
    val esEstudiante: Boolean = false
    val inicial: Char = 'C'
    val pais: String = "Guatemala"
    val saldo: Long = 100000L
    val calificacion: Byte = 10
    val temperatura: Short = 25

    // 10 var
    var ciudad: String = "Antigua"
    var puntos: Int = 80
    var velocidad: Double = 90.7
    var energia: Float = 67.3f
    var activo: Boolean = true
    var letra: Char = 'A'
    var producto: String = "Laptop"
    var cantidad: Long = 5000L
    var nivel: Byte = 8
    var clima: Short = 18

    // Mostrar resultados de val
    println("val:")
    println(nombre)
    println(edad)
    println(altura)
    println(peso)
    println(esEstudiante)
    println(inicial)
    println(pais)
    println(saldo)
    println(calificacion)
    println(temperatura)

    // Mostrar resultados de var
    println("\nvar:")
    println(ciudad)
    println(puntos)
    println(velocidad)
    println(energia)
    println(activo)
    println(letra)
    println(producto)
    println(cantidad)
    println(nivel)
    println(clima)

    // Interpolación
    val miNombre = "Cesar Aguilar"
    val profesion = "Desarrollador Android"
    val mensaje = "Hola, mi nombre es $miNombre y soy $profesion."
    println("\nInterpolación:")
    println(mensaje)

    // Llamadas a funciones
    println("\nFunciones:")
    println(retornarNombre())
    println(saludar("Luis"))
    println("Suma: ${sumar(10, 5)}")
    println("División: ${dividir(10.0, 2.0)}")
    println("Multiplicación: ${multiplicar(2, 3, 4)}")
}

// Función 1: retorna solo el nombre "KOTLIN"
fun retornarNombre(): String {
    return "KOTLIN"
}

// Función 2: solicita un parámetro y retorna saludo
fun saludar(nombre: String): String {
    return "Hola, $nombre! Bienvenido a Kotlin."
}

// Función 3: solicita 2 parámetros y retorna suma
fun sumar(a: Int, b: Int): Int {
    return a + b
}