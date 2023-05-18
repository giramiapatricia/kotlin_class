fun main(){
    // K, C, F
    println("Pick a temperature scale: K, C or F: ")
    var tempScale = readln()!!.toString()
    println("Enter a temperature to convert: ")
    var temperature = readln()!!.toFloat()

    var celciusToFahrenheit = 9*temperature/5+32
    var kelvinToCelcius = temperature - 273.15
    var fahrenheitToKelvin = (temperature - 32)*5/9+273.15
    var fahrenheitToCelcius = (temperature - 32)*5/9
    var celciusToKelvin = temperature + 273.15
    var kelvinToFahrenheit = (temperature - 273.15)*9/5+32


    // if statement
    if (tempScale == "K"){
        println("The temperature in Celcius is: $kelvinToCelcius")
        println("The temperature in Fahrenheit is: $kelvinToFahrenheit")
    } else if (tempScale == "C"){
        println("The temperature in Fahrenheit is: $celciusToFahrenheit")
        println("The temperature in Kelvin is: $celciusToKelvin")
    } else if (tempScale == "F"){
        println("The temperature in Kelvin is: $fahrenheitToKelvin")
        println("The temperature in Celcius is: $fahrenheitToCelcius")
    } else{
        println("Pick either K, F or C: These are case sensitive")
    }

    println()

    // when statement
    when(tempScale){
        in "K" -> {
            println("The temperature in Celcius is: $kelvinToCelcius")
            println("The temperature in Fahrenheit is: $kelvinToFahrenheit")
        }
        in "C" -> {
            println("The temperature in Fahrenheit is: $celciusToFahrenheit")
            println("The temperature in Kelvin is: $celciusToKelvin")
        }
        in "F" -> {
            println("The temperature in Kelvin is: $fahrenheitToKelvin")
            println("The temperature in Celcius is: $fahrenheitToCelcius")
        }
        else -> {
            println("Pick either K, F or C: These are case sensitive")
        }
    }
}
main()