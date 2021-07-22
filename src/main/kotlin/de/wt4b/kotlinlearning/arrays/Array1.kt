package de.wt4b.kotlinlearning.arrays

fun main() {
    val wert = intArrayOf(1, 2, 3, 4, 5, 6)
    println("Wert an Position 1: " + wert[0])
    val laenge = wert.size
    println("Länge des Arrays: $laenge")
    println("Wert an Postion 4: " + wert[3])
    wert[3] = 10
    println("Wert an Postion 4: " + wert[3])

}