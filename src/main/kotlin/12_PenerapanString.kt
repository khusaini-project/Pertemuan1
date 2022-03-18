fun main() {
    // Character occurrence in a sentence analysis
    // the string that we want to analyze
    var s = "A programmer gets stuck in the shower because the instructions on the shampoo were: Lather,Wash, and Repeat."
    println(s)
    s = s.toLowerCase()
    // inisial
    var vowelCount = 0
    var consonantCount = 0
    // defini character group
    val vowels = "aeiouy"
    val consonants = "bcdfghjklmnpqrstvwxz"
    // main loop
    for (c in s) {
        if (vowels.contains(c)) {
            vowelCount++
        } else if (consonants.contains(c)) {
            consonantCount++
        }
    }
    println("Vowels: $vowelCount")
    println("Consonants: $consonantCount")
    println("Other characters: ${s.length - (vowelCount + consonantCount)}")
}