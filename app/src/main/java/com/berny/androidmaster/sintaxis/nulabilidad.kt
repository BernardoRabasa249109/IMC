package com.berny.androidmaster.sintaxis

//VAR = VARIABLE MUTABLE, VAL = VALOR QUE NO CAMBIA

fun main(){
    var name:String? = "Bernardo"
    println(name?.get(3) ?: "Es nulo wey")
}