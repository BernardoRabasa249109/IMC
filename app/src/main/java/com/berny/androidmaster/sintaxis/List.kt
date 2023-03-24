package com.berny.androidmaster.sintaxis
//VAR = VARIABLE MUTABLE, VAL = VALOR QUE NO CAMBIA
/*
Esta lista es inmutable no se puede cambiar
 */
fun main(){
    mutableList()
}

fun mutableList() {
    val weekDays:MutableList<String> = mutableListOf("Lunes","Martes","Miercols","Jueves","Viernes","Sabado","Domingo")
    println(weekDays)
    //Añadir valor nuevo y posicion con index(llave, valor)
    weekDays.add(0,"BernyDay")
    println(weekDays)

    if (weekDays.isEmpty()){
        //No hare nada
    }else{
        weekDays.forEach { println(it) }
    }

    if (weekDays.isNotEmpty()){
        weekDays.forEach { println(it) }
    }

    println(weekDays.last())

    weekDays.forEach { weekDays -> println(weekDays) }
}

fun inmutableList(){
    var readOnly:List<String> = listOf("Lunes","Martes","Miercols","Jueves","Viernes","Sabado","Domingo")

    println(readOnly.size)
    println(readOnly.toString())
    println(readOnly[0])
    println(readOnly.last())
    println(readOnly.first())

    //Filtrar
    val example = readOnly.filter { it.contains("a") }
    println(example)
    //Iterar
    readOnly.forEach { weekDay -> println(weekDay) }
}