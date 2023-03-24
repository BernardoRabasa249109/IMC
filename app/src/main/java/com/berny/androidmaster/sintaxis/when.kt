package com.berny.androidmaster.sintaxis
//VAR = VARIABLE MUTABLE, VAL = VALOR QUE NO CAMBIA

fun main(){
    getSemester(9)
}

//fun getMonth(month:Int){
//    if (month == 1){
//        println("Enero")
//    }else if (month == 2){
//        println("Febrero")
//    }else if (month == 3){
//        println("Marzo")
//    }else if (month == 4){
//        println("Abril")
//    }else if (month == 5){
//        println("Mayo")
//    }else if (month == 6){
//        println("Junio")
//    }else if (month == 7){
//        println("Julio")
//    }else if (month == 8){
//        println("Agosto")
//    }else if (month == 9){
//        println("Septiembre")
//    }else if (month == 10){
//        println("Octubre")
//    }else if (month == 11){
//        println("Noviembre")
//    }else if (month == 12){
//        println("Diciembre")
//    }else{
//        println("Ese mes no existe")
//    }
//}
fun getSemester(month: Int) = when(month) {
        in 1..6 ->  print("Primer Semestre")
        in 7..12 ->  print("Segundo Semestre")
        !in 1..12 ->  print("semestre no valido")
        else -> print("dawa")
    }

fun getTtrimester(month: Int){
    when(month) {
        1, 2, 3 -> print("Primer Trimestre")
        4, 5, 6 -> print("Segundo Trimestre")
        7, 8, 9 -> print("Tercer Trimestre")
        10, 11, 12 -> print("Cuarto Trimestre")
        else -> print("No es un mes valido")
    }
}

fun getMonth(month:Int) {
    when (month) {
        1 -> print("Enero")
        2 -> print("Febreo")
        3 -> print("Marzo")
        4 -> print("Abril")
        5 -> print("Mayo")
        6 -> print("Junio")
        7 -> print("Julio")
        8 -> print("Agosto")
        9 -> print("Septiembre")
        10 -> print("Octubre")
        11 -> print("Noviembre")
        12 -> print("Diciembre")
        else -> print("No es un mes valido")
    }
}

fun result(value:Any){
    when(value){
        is Int -> value + value
        is String -> println(value)
        is Boolean -> if (value) println("holiwi")
    }
}