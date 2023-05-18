fun main(){
    val array = arrayOf("Sweet", "Peter", "Deep", "Salt", "Pepper", "Corn", "Swallow", "Lead", "Smart", "Posho")

    // for loop
    for (word in array){
        if (word[0] == 'S') {
            println(word)
        }
    }
    println()
    // for each
    array.forEach {
        if (it[0] == 'S'){
            println(it)
        }
    }
}
main()