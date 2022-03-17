fun main() {
    val a = 7
    val b = 8
    val c = a + b
    val s = "When we add $a and $b, we get $c"
    println(s)
    println("When we add $a and $b, we get ${a + b}")
    val price = """
    ${'$'}9.99
    """
    println(price)

    //Diperlukan tanda kurung kurawal untuk melakukan pemrosesan pada saat menggabungkan
    //variabel kedalam template String. Karakter dolar („${'$'}‟) tidak bisa dicetak menggunakan escape
    //character oleh karena itu gunakan template String untuk mencetaknya
}
