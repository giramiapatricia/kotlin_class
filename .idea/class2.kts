fun myHighOrderFunction(age:(Int)->Int,birthYear:Int):Int{
    return age(birthYear)
}
fun main(){
    var currentYear = 2023
    val myNewAge:(Int) -> Int = {yearOfBirth:Int -> currentYear - yearOfBirth}
    println("You are ${myHighOrderFunction(myNewAge,1997)} years old")
}
main()
//// immutable lists - read-only
//val names = listOf<String>("Gilbert","Jane","Tom","Alex")
//println(names[0])
//
//for (name in names){
//    println(name)
//}
//names.forEach { it
//    println(it)
//}
//
//// mutable lists
//var name = mutableListOf<String>("Gilbert","Jane","Tom","Alex")
//name.add("Donald")
//for (any in name){
//    println(any)
//}

//val names = mutableSetOf<String>("Tom","Jane")
//names.add("Jerry")
//names.add("Joan")
//names.add("Alice")
//names.add("Boris")
//names.add("Winnie")
//println(names)