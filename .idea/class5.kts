class House{
    // all elements must be instantiated in classes
    // var attributes
    protected var location:String = ""
    // or use an init block
    var size:Int
    init {
        size = 24
    }
    var type:String = ""
    // fun attributes
    fun getLength(){
        println("Length is 5")
    }
}
class Car(color:String, var horsePower:Int){
    val theColor = color
    //color is not known within the code block without defining it as a var or val
    // elements here are instantiated
    // primary constructor
    fun getColor(){
        println("The color is $theColor")
    }
    fun getHorsePower(){
        println("The color is $horsePower")
    }
}
class Book{
    // secondary constructor
    var t:String = ""
    constructor(type:String, title:String){
        this.t = title
    }

    fun getTitle(){
        println("Title is $t")
    }
}

// inheritence
class Bible:Book(){
    //open allows inheritence

}
open class Shape{
    private var name:String = ""
    var number:Int = 0
    open protected var type:String = ""
    var dimension:String = ""

    fun getType(){
        println("The type is a $type")
    }
}
open class Circle(x:String):Shape(){
    override var type:String = x  // now private
}
class Sphere:Circle("sphere"){

}
fun main(){
    var circle = Circle("circle")
    circle.getType()
    var shpere = Sphere()
    shpere.number
    shpere.dimension

}
main()