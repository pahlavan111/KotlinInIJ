package part_6

fun main(args: Array<String>) {

    var a = arrayOf<Int>(3, 6, 6, 8)

    println("first parameter of array is: " + a[0])

    var b = arrayOf(2, 3, "Hello", 6.98, "Behrooz Khan")

    for (x in b) {
        println(x)
    }


    drawLine()

    var mArray = Array(5) { 1 }
    for (v in mArray) {
        println(v)
    }

    drawLine()

    val arr = arrayOf(
            arrayOf(1, 4, 6),
            arrayOf(1, 4, 6),
            arrayOf(1, 4, 6)
    )

    for (i in arr) {
        for (j in i) {
            print(j)
        }
        println()
    }

    drawLine()

}


fun drawLine() {

    println()

    for (a in 1..15) {
        print("=")
    }

    println()
}