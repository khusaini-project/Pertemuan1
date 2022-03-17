fun main() {

    var c: Char // character
    var i: Int // ordinal (ASCII) value of the character

    c = 'a'
    i = c.toInt()
    println("The character $c was converted to its ASCII value of $i")

    i = 98
    c = i.toChar()
    println("The ASCII value of $i was converted to its textual value of $c")

    //OK
}