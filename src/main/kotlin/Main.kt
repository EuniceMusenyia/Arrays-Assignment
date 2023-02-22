fun main() {
    sistersArray("Suzzie","Tina","Liz","Senyia")
    citiesArray()
    numberArray()
    println(namesArray("Ada","Hopper","AnitaB"))

}
fun sistersArray(sister1: String, sister2:String, sister3:String, sister4: String){
    val sisters = arrayOf(sister1, sister2,sister3,sister4)
    println(sisters.contentToString())

}
fun citiesArray(){
    var cities = arrayOf("harare", "mumbai", "dodoma","jakarta")
    println("${cities[0].replaceFirstChar { "H" }}, ${cities[1].replaceFirstChar { "M" }}, ${cities[2].replaceFirstChar { "D" }} , ${cities[3].replaceFirstChar { "J" }}")
}
fun numberArray(){
    val numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    println(numbers[1]+numbers[4])
    println(numbers.indexOf(158))
    numbers.sort()
    println(numbers. contentToString())
}
fun namesArray(name1:String, name2:String, name3:String):String {
    val classes = arrayOf(name1, name2, name3)
    return classes.contentToString()


}
