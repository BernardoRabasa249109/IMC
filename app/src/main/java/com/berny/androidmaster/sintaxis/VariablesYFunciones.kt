package com.berny.androidmaster.sintaxis

//VAR = VARIABLE MUTABLE, VAL = VALOR QUE NO CAMBIA
fun main() {

    showMyName()
    showMyAge(8)
    add(27, 78)
    subtractCool(80,40)

    val mySubtract = subtract(10, 8)
    println(mySubtract)

}

fun showMyName(){
    println("Me llamo Bernardo")
}


fun showMyAge(currentAge: Int = 99){
    println("Tengo $currentAge años")
}

fun add(firstNumber:Int, secondNumber: Int){
    println(firstNumber +  secondNumber)

}

fun subtract(firstNumber:Int, secondNumber: Int):Int {
    return firstNumber +  secondNumber
}

fun subtractCool(firstNumber:Int, secondNumber: Int) = firstNumber +  secondNumber
