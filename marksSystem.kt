
fun main() {
    println("Enter your Marks")
    val marks = readLine()?.toIntOrNull()

    if (marks != null) {
        when {
            marks in 90..100 -> println("A grade")
            marks in 80..89  -> println("B grade")
            marks in 70..79  -> println("C grade")
            marks in 60..69  -> println("D grade")
            marks in 50..59  -> println("E grade")
            marks in 0..49   -> println("Fail")
            else             -> println("Invalid marks")
        }
    } else {
        println("Invalid input")
    }
}

