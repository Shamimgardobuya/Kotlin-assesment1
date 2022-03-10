fun main(){
   school()
    divide(12,5)
    var modulus = 12%5
    println(modulus)

    greeting("Maggie",25)
    var name = "Maggie"
    var age = 25
    var result = "Hi my name is $name and i am $age years old"
    println(result)

    girl()
    var namex = "Judy"
    println(namex.length)
}
fun school(){
    var place = "codeHive"
    println(place[4])
    println(place[5])
    println(place[6])
    println(place[7])
}
fun divide(a:Int,b:Int):Int{
    var modulus = a % b
    return modulus

}
fun greeting(name:String,age:Int):String{
    var result = "Hi my name is $name and i am $age years old"
    return result
}
fun girl():Int{
    var namex = "Judy"
    var length = namex.length
    return length
}