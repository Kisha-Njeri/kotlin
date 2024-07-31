 open class parent{
    var dad="Likes watching Football"
    var mom="Loves going shopping"
}
class daughter :parent(){
    fun da(){
        println("Mom $mom")
    }

}
 class son :parent(){
     fun so(){
         println("Dad $dad")
     }
 }

 fun main(args:Array<String>) {
     val obj=daughter()
     obj.da()
     val obj2=son()
     obj2.so()

 }