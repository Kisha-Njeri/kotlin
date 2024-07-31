//for loop
fun main(args:Array<String>) {
    var myarray = arrayOf("toyota", "mazda", 'd', 20, "mercedez")

    for (i in myarray) {
        println("print $i")
    }


//  range
    for (x in 5..15) {
        println("Range is " + x)
    }

    for (ch in 'D' .. 'K' ){
        println(ch)

    }
}