fun main() {
    var a: Int = 10
    var b: Int = 3

    // Arithmetic Operators
    println("Arithmetic Operators:")
    println("a + b = ${a + b}")     // Addition
    println("a - b = ${a - b}")     // Subtraction
    println("a * b = ${a * b}")     // Multiplication
    println("a / b = ${a / b}")     // Division
    println("a % b = ${a % b}")     // Modulus
    println("a++ = ${a++}")         // Post-increment
    println("Now a = $a")
    println("b-- = ${b--}")         // Post-decrement
    println("Now b = $b")

    // Assignment Operators
    println("Assignment Operators:")
    var x = 5
    println("Initial x = $x")
    x += 2
    println("x += 2 -> $x")
    x -= 1
    println("x -= 1 -> $x")
    x *= 3
    println("x *= 3 -> $x")
    x /= 2
    println("x /= 2 -> $x")
    x %= 4
    println("x %= 4 -> $x")

    // Comparison Operators
    println("\nComparison Operators:")
    println("a == b: ${a == b}")    // Equal
    println("a != b: ${a != b}")    // Not equal
    println("a > b: ${a > b}")      // Greater than
    println("a < b: ${a < b}")      // Less than
    println("a >= b: ${a >= b}")    // Greater or equal
    println("a <= b: ${a <= b}")    // Less or equal

    // Logical Operators
    println("\nLogical Operators:")
    val condition1 = true
    val condition2 = false
    println("condition1 && condition2: ${condition1 && condition2}")  // AND
    println("condition1 || condition2: ${condition1 || condition2}")  // OR
    println("!condition1: ${!condition1}")                             // NOT
}
