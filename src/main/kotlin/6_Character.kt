fun main() {
    // penggunaan fungsi anggota dari Character seperti isLowerCase(),isDigit(),toUpperCase().

    var charA : Char = 'A'
    //println(charA == 65)
    println(charA.isUpperCase())
    println(charA.isLowerCase())
    println(charA.isDigit())
    println(charA.toLowerCase())
    val strA: String = charA.toString()
    println("Kini charA sudah menjadi String = "+strA)
}
