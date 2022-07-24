package one.digitalinnovation.collection

fun main() {
    val values = intArrayOf(2, 3, 4, 1, 10, 7, 11)

//    for (valor in values) {
//        println(valor)
//    }
    values.sort()
    values.forEach {
        println(it)
    }
}