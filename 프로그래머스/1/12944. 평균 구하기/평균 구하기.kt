class Solution {
    fun solution(arr: IntArray): Double {
        var answer = 0
        for (a in arr) {
            answer += a
        }
        return answer.toDouble() / arr.size 
    }
}
