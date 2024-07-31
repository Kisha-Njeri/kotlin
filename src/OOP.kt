class Fruits{
    var name=""
    var color=""
    var shape=""
    var price=0
}
fun main(args:Array<String>){
    val myobj=Fruits()
    myobj.name="Oranges"
    myobj.color="green"
    myobj.shape="circle"
    myobj.price=20
    println("My favorite is ${myobj.name} and it costs ${myobj.price} kenyan shillings")
    
}