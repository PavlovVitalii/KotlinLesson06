fun main() {
    println(isAnagram("asdf", "afds"))
    println(isAnagram("AAB", "ABA"))
    println(isAnagram("AAB", "ABAA"))
    println(isAnagram("AAB", "BAB"))


}


fun isAnagram(first: String, second: String) =
    first.toList().sorted() == second.toList().sorted()



