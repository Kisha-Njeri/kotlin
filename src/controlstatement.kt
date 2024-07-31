fun main(args:Array<String>) {
    val age=21

    if (age >= 18){
        println("You are eligible to vote")
    }else{
        println("Sorry you can't vote")
    }
    val num=4
    if (num%2==0){
        println("$num is even number")
    }else{
        println("$num is odd number ")
    }
    val marks=50
    if (marks>=80 && marks<=100) {
        println("You scored an A")
    }else if(marks>=60 && marks<=79 ){
        println("You scored a B")
    }else if (marks>=40 && marks<=59 ){
        println("You scored a C")
    }else if (marks>=0 && marks<=39){
        println("You have failed")
    }else {
        println("Wrong input")
    }

}