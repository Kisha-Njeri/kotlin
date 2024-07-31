fun mayclass(){
    var name="eMobilis"
    println("I learn coding at $name")
}
fun main(args:Array<String>) {
    mayclass()
    addtwonumbers()
    students("Mary","Otieno",13)
    students("Peter","Odhiambo",15)
    students("Debra","Wanjiku",17)
    students("James","Serut",16)
}
fun addtwonumbers(){
    var num1=5
    var num2=14
    println("The sum of $num1 and $num2 is ${num1+num2}")
}
fun students(fname:String,lname:String,age:Int){
    println("Sudent's name is $fname $lname and his/her age is $age")
}

