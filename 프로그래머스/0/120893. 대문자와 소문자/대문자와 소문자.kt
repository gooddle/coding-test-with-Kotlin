class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""
        for (char in my_string) {
            answer += if (char.isUpperCase()) {
                char.toLowerCase()
            } else if (char.isLowerCase()) {
                char.toUpperCase()
            } else {
                char
            }
        }
        return answer
    }
}
