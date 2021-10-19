fun main (){
println("Hello World")
    val classmates = arrayOf("Nick", "Farah", "Megan", "Pim", "Sophie")
    for (classmate in classmates) {
        greet(classmate)
    }

}

fun greet(name: String){
    println("Hello $name")

}