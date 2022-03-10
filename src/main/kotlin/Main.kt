fun main() {
    var sentence = person("Yasmin", 12)
    println(sentence)
    var characters = wordLength("I learn in Lovelace class")
    println(characters)
    stringWord()
    Number(11,12)

}
fun stringWord(){
    val word = "codeHive"
    val letters = word[4].toString() + word[5] + word[7]
    println(letters)

fun Number(x:Int, y:Int){
    var modulus = x%y
    println(modulus)

}

fun person(name:String, age:Int):String{
    var sentence = "Hi, my name is $name and I am $age years old."
    return sentence
}

fun wordLength(wrd:String): Int{
    val characters = wrd.length
    return characters
}