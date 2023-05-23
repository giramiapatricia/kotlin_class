fun adTwoNumbers(num1:Int,num2:Int){
    var sum = num1 + num2
    println(sum)
}

fun main(){
    println("Enter first number:")
    var num1 = readln()!!.toInt()
    println("Enter second number:")
    var num2 = readln()!!.toInt()
    adTwoNumbers(num1,num2)
}
main()