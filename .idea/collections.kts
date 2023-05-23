fun main() {
// maps
    var students = mutableMapOf<Int,String>(1 to "Brian",2 to "Alex",3 to "Tom",4 to "John")
    for (student in students){
        println(student)
    }
    var results = students.remove(3)
    println(students)
}
main()