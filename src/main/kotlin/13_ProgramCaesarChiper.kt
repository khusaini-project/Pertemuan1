fun main() {
    //The Caesar cipher
    // variabel inisial
    val s = "blackholesarewheregoddividedbyzero"
    println("Original message: $s")
    var message = ""
    var shift = 1
    // loop iterating over characters
    for (c in s) {
        var i = c.toInt()
        i += shift
        if (i > 'z'.toInt()) {
            i -= 26
        }
        val char = i.toChar()
        message += char
    }
    // inputan
    println("Encrypted message: $message")
}
