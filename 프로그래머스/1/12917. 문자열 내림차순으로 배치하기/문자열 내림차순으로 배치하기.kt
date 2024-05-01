class Solution {
    fun solution(s: String): String {
        var answer = ""
        for(i in s){
            answer= s.toList().sortedDescending().joinToString("")
        }
        return answer
    }
}