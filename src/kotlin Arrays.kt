import java.util.*

fun main(){
    name("Babra","Mary","John","Mercy")
    countries()
    digits()
    println(people("Jane","mercy","Babra"))
}
fun name(a:String,b:String,c:String,d:String){
    var list= arrayOf(a,b,c,d)
    println(Arrays.toString(list))

}
fun countries(){
    var cities= arrayOf("harare","mumbai","dodoma","jakarta")
    for(element in cities)
        println(element.capitalize())
}
fun digits(){
    var numbers= arrayOf(32,17,4,231,78,43,90,31,3,73,11,158,62)
    var sum = numbers[1].plus (numbers[4])
    println(sum)
    println(numbers.indexOf(158))
    println(Arrays.toString(numbers.sortedArray()))
}
fun people(a:String,b:String,c:String):String{
    var people = arrayOf(a,b,c)
    return(Arrays.toString(people))

}
