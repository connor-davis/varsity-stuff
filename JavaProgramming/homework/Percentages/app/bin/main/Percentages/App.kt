package Percentages

import java.util.Scanner
import java.io.IOException

class App {
    fun main() {
        // Declare the variables
        var a: Double
        var b: Double

        val scanner = Scanner(System.`in`)

        print("Please enter value a:")

        a = scanner.nextLine().toDouble()

        print("Please enter value b:")
            
        b = scanner.nextLine().toDouble()
        
        // Compute the percentage
        computePercentages(a, b)
    }

    fun computePercentages(a: Double, b: Double): Double {
        print("Value a: $a")
        print("Value b: $b")

        val percentage = (a / b) * 100

        print("Value a is $percentage% of value b")

        return percentage
    }
}
