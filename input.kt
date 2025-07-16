fun main() {
    println("Enter a Number num 1: ")
    val input1: String? = readLine()
    val num1: Int? = input1?.toIntOrNull()

    println("Enter a Number num 2: ")
    val input2: String? = readLine()
    val num2: Int? = input2?.toIntOrNull()

    if (num1 != null && num2 != null) {
        val total: Int = num1 + num2
        println("The sum of $num1 + $num2 = $total")
    } else {
        println("Invalid input. Please enter valid numbers.")
    }
}
