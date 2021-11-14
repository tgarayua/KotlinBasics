package com.example.kotlinbasics

fun main(){
    //Arithmetic operators (+, -, *, /, %)
    var result = 5+3
    result = result / 2
    // alternatively
    // result /= 2
    result = result * 5
    result = result - 1
    var moduloResult = 5%2
//    println( moduloResult)

    //Comparison operators (==, !=, <, >, <=, >=)
    val isEqual = 5==3
    // Concatenation - adding of "Strings"
//    println("isEqual is " + isEqual)
    val isNotEqual = 5!=5
    // Kotlin has a feature called String Interpolation.
    // This feature allows you to directly insert a template expression inside a String.
    // Template expressions are tiny pieces of code that are evaluated and
    // their results are concatenated with the original String.
    // A template expression is prefixed with $ symbol.
    // Following are examples of String interpolation
//    println("isNotEqual is $isNotEqual")

//    println("is5Greater3 ${5 > 3}")
//    println("is5LowerEqual3 ${5 >= 3}")
//    println("is5LowerEqual5 ${5 >= 5}")

    //Assignment operators (+=, -=, *=, /=, %=)
//    var myNum = 5
//    myNum += 3
//    println("myNum is $myNum")
//    myNum *= 4
//    println("myNum is $myNum")


    //Increment & Decrement operators (++, --)
//    myNum++
//    println("myNum is $myNum")
//    // increments after use
//    println("myNum is ${myNum++}")
//    // increments before use
//    println("myNum is ${++myNum}")
//    println("myNum is ${--myNum}")


    var heightPerson1 = 189
    var hightPerson2 = 189

    if (heightPerson1 > hightPerson2) {
        println("use raw force")
    } else if (heightPerson1 == hightPerson2) {
        println("use your power technique 1337")
    } else {
        println("use technique")
    }

    val age = 30

    if (age > 21) {
        println("You can drink")
    } else if (age == 21) {
        println("Happy birthday enjoy your drink")
    } else {
        println("You can not drink")
    }

}

