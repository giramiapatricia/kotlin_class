fun main(){
    println("Enter your age to pay for a ticket:")
    var age = readln()!!.toInt()
    var maxAge = 100

    // if statements
    if (age in 1..12){
        println("Yours is a child's ticket: price is $15")
    } else if(age in 13..60){
        println("Yours is a standard ticket: price is $30")
    } else if(age in 61..maxAge){
        println("Yours is a senior ticket: price is $20")
    } else {
        println("-1: Your age is out of range")
    }
    println()
    // when statements
    when(age){
        in 1..12 -> println("Yours is a child's ticket: price is $15")
        in 13..60 -> println("Yours is a standard ticket: price is $30")
        in 61..maxAge -> println("Yours is a senior ticket: price is $20")
        else -> {
            println("-1: Your age is out of range")
        }
    }
}main()