package part_8


// using primary and secondary constructor at the same time

class Student (email : String) {

    init {
        println("hey this is student init block")
    }
    constructor( name: String, email: String , family:String):this(email){

        println(name)
        println(email)
        println(family)
    }
}