package part_8
// a class with primary constructor


//if you want to access these variable in objects you should pud val or var before variable name


class Person (var name : String,var family: String) {

    init {
        print("this is a message from Person constructor: ")
        println("person name is $name and person family is $family")
    }

}