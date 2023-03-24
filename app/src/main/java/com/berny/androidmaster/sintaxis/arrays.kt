package com.berny.androidmaster.sintaxis
//VAR = VARIABLE MUTABLE, VAL = VALOR QUE NO CAMBIA

/**
 * Array son secuencias de datos
 */

//Indice -> index 0..6
//Tamaño -> 7 elementos en el array
fun main(){
    val weekDays = arrayOf("Lunes","Martes","Miercols","Jueves","Viernes","Sabado","Domingo")
    println(weekDays.size)
    println(weekDays[4])

    //Tamaños
    if (weekDays.size >= 8){
        println(weekDays[7])
    }else{
        println("no hay mas valores en el array")
    }

    //Modificar valores de u array
    weekDays[0] = "LUNMAR"
    println(weekDays[0])

    //Bucles para arrays para recorrerlas un elemento por elemento

    for(position in weekDays.indices){
        println(weekDays[position])
    }
    //position and value
    for ((position, value) in weekDays.withIndex()){
        println("The position $position contains $value")
    }

    for (weekDays in weekDays) {
        println("Today is $weekDays")
    }
}
