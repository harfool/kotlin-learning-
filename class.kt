class User (val fullName : String , val Age : Int , val isMarried : Boolean){
    fun myData(){
        println(fullName)
        println(Age)
        println(isMarried)
    }
}

fun main(){

    var user = User(fullName = "harfool gurjar" , Age = 24 , isMarried = true)
//    println("user name is ${user.fullName}")
//    println("i am ${user.Age} years old")
//    println("i am married ${user.isMarried}")

    user.myData()
}
