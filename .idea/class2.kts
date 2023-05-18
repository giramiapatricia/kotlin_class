fun myHighOrderFunction(age:(Int)->Int,currentYear:Int = 1998):Int{
    return age(currentYear)

//fun myAge(currentYear:Int, yearOfBirth:Int):Int{
//    var age = currentYear - yearOfBirth
//    return (age)
}
fun main(){
    var currentYear = 2023
    val myNewAge:(Int) -> Int = {yearOfBirth:Int -> currentYear - yearOfBirth}
    println("You are ${myHighOrderFunction(myNewAge)} years old")
//    var age = myAge(2023, 1997)
    println("You are ${myNewAge(1997)} years old")
}
main()