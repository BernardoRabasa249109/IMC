package com.berny.androidmaster.sintaxis
//VAR = VARIABLE MUTABLE, VAL = VALOR QUE NO CAMBIA
//un if es una condicion, si ocurre esto haz esto
fun main(){

    ifMultipleOR()
}

fun ifBasics(){
    val name = "Bernardo"

    if (name == "Aris"){
        println("Name es aris")
    }else{
        println("Este no es Aris")
    }
}

fun ifAnidado(){
    val animal = "Aris"

    if (animal == "dog"){
        println("Es perrito")
    }else if (animal == "cat"){
        println("Es gatito")
    }else if (animal == "bird"){
        println("Es un pajaro")
    }else
        println("No es ningun animal")
}

fun ifBoolean(){
    var imHappy = false

    //sin nada == true
    //con ! al principio == true

    if (!imHappy)
        println("Estoy triste")
}

fun ifInt(){
    var age = 18

    if (age >= 18){
        println("Beber Cerbeza")
    }else {
        println("Bever jugo")
    }
}
//comprobar varias opciones

fun ifMultiple(){ //evitar if anidados , probar una de 2
    var age = 19
    var parentPermission = false
    var imHappy = true

    if (age >= 18 && parentPermission && imHappy){
        println("puedo beber")
    }
}
fun ifMultipleOR(){  //OR ||
    val pet = "cat"
    val isHappy = true

    if (pet == "dog" || (pet == "cat" && isHappy)){
        println("Es un gato o un perro")
    }
}

