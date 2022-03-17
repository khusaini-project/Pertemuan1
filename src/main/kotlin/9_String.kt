fun main(args: Array<String>) {
    // menggabungkan String dengan tipe data lain dengan menggunakan operator +
    val s = "abc" + 1
    println(s + "def")

    // menyimpan data String yang memuat keywords Kotlin bisa dengan menggunakan
    //raw String yang dipisahkan dengan triple quotes (""")
    var text = """
        for (c in "foo")
            print(c)
    """
    println(text)

    //Kita juga dapat menghapus spasi yang tidak diperlukan dalam raw String
    var nilai = """
            |Tell me and I forget.
            |Teach me and I remember.
            |Involve me and I learn.
            |(Benjamin Franklin)
            """.trimMargin()
    println(nilai)
}