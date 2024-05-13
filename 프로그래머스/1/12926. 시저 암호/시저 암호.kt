class Solution {
    fun solution(s: String, n: Int): String {
        var answer = ""
        val list = ('a'..'z').toList()
        
        for (char in s) {
            if (char.isLowerCase()) {
                val index = (list.indexOf(char) + n) % 26
                answer += list[index]
            } else if (char.isUpperCase()) {
                val index = (list.indexOf(char.toLowerCase()) + n) % 26
                answer += list[index].toUpperCase()
            } else {
                answer += char
            }
        }
        
        return answer
    }
}
