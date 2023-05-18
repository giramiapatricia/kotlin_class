import kotlin.ranges.downTo

fun main(){
//    print("hello world")
    val a =1
    val b = 30
    val c =2.5
    val d = 4.5f
    // if else
    val maxNumber = if(a>b) a else if (a>c) c else b

    // when (switch)
    when (a){
        is Int -> {println("its an integer")}
        // in range
        in 0..5 -> {println("its smaller")}
        // 0 -> {println("its negative")}
        10 -> {println("its small")}
        else -> {
            println("its big")
        }
    }
    var t:Float = 3.5f
    print("$t")

    fun myStudent(studentName:String, studentRollNumber:Int, studentAge:Int, studentGrade:String){
        var student = println("Student Name is : $studentName, Student Roll Number is: $studentRollNumber, Student age is: $studentAge, Student Grade is: $studentGrade" )
        return student
    }

    myStudent("Patricia", 45677, 30, "B")

    fun canWatchovie(age:Int):Int{
        return age
    }
    fun main(){
        // decalre the age
        var age = canWatchovie(12)
        //check if the person is under age: which will determine if the person can watch a certain movie
        val isUnderAge = if (age<18) "you cannot watch this movie" else "you can watch the movie"
        // if under age, print "cannot watch" else print "can watch"
        println(isUnderAge)
    }

    val scanner  = Scanner(System.`in`)
    val num1 = scanner.nextInt()
    println("The input one is : $num1")
    val num2 = scanner.nextInt()
    println("The input two is : $num2")

    val sum = num1+num2

    println("The sum of the two inputs is : $sum")

    // readLine()
//    println("The input one is : ")
//    val num1 = readLine()!!.toInt()
//    println("The input two is : ")
//    val num2 = readLine()!!.toInt()
//
//    val sum = num1+num2
//
//    println("The sum of the two inputs is : $sum")
//    println("enter a number")
//    var number = readln()
//    var newNumber = number?:"3"
////    var result = 2 + nextNumber.toInt()
//    println("$newNumber")

    val p = Array<Int>(10, {1})
    for(i in p){
        println(i)
    }
    p.forEach { println(it) }
    //for loop
    for (x in 28..b) println(x)
    for (x in b downTo 20 step 4) println(" X is $x")

    // ?: - elvis operator, ? - safe call operator
    var str: String? = "hey"
    str = null

    val sumFloats = c+d
    val sum = a+c
    val product = a.times(b)

    // dividends and divisors
    val dividend = 25
    val divisor = 4
    val quotient = dividend/divisor
    val remainder = dividend%divisor

    //arrays
    val asc = Array(5) { i -> (i * i).toString() }
    asc.forEach { println(it) }
    // Array of int of size 5 with values [0, 0, 0, 0, 0]
    val arr = IntArray(5)

// Example of initializing the values in the array with a constant
// Array of int of size 5 with values [42, 42, 42, 42, 42]
    val arr = IntArray(5) { 42 }

// Example of initializing the values in the array using a lambda
// Array of int of size 5 with values [0, 1, 2, 3, 4] (values initialized to their index value)
    var arr = IntArray(5) { it * 1 }

    println ("The sum of integers is $sum")
    println ("The sum of floats is $sumFloats")
    println("The product is $product")
    println("The Quotient is $quotient")
    println("The remainder is $remainder")
    println(str)
    println(maxNumber)

    var currentYear: Int = 2023
    var yearOfBirth: Int = 1997
    var age = if (yearOfBirth > currentYear){
        print ("You are not yet born")
    } else if(yearOfBirth < 0){
        println("Wrong year of birth")
    } else {
        var newAge = currentYear - yearOfBirth
        println("you are $newAge years")
    }

    // grade
    var myMark: Int = 45
    var myGrade = if (myMark in 0..50){
        print ("You have a fail")
    } else if (myMark in 70..50){
        print ("you have a pass")
    } else if (myMark in 90..70){
        print ("you have a credit")
    } else print("you have a distiction")
}

//read
println("Enter your result: ")
var result = readln()!!.toInt()
when (result){
    in 0..50 -> {println("good trial")}
    in 51..75 -> {println("Good")}
    in 76..95 -> {println("very good")}
    else -> {
        println("Excellent")
    }
}
}
main()