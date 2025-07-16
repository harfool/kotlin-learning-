
fun main(){
    println("Enter a number:")
    val input1 = readLine()
    val num1 = input1?.toInt()

    println("Enter operater (+ - / * )")
    val operator = readLine()

    println("Enter second Number")
    val input2 = readLine()
    val  num2 = input2?.toInt()

    if (num1 != null && operator !=null && num2 != null ){
        val reuslt = when(operator){
            "+" -> num1 + num2
            "-" -> num1 - num2
            "/" -> num1 / num2
            "*" -> num1 * num2
            else -> println("Enter a valid operator")
        }

        println(reuslt)
    }

}
