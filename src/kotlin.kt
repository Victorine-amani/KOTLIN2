fun main(){
    var Amani= Human("Victorine Amani",19,72.8)
    println(Amani.eat(2))
    println(Amani.speak("I am human"))
    println(Amani.birthday())
    var Joel=User("Joel","Favour","joelfavour@gmail.com","0791846426","victroine21")
    println(Joel.email)
    println(Joel.phoneNumber)
}
class Human(var name:String,var age:Int,var weight:Double) {
    fun eat(foodWeight: Int) {
        println("I am eating $foodWeight Kgs of food")
        var weight = foodWeight + weight
        println(weight)
    }
    fun speak(speech:String) {
        println(speech)
    }
    fun birthday(){
        var newAge=age+1
        println(newAge)
    }
}
class User(var firstName:String,var lastName:String,var email:String,var phoneNumber:String,var password:String){

}