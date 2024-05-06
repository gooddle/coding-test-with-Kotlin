class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        for(i in 0..n){
            answer=n.toString().map { it.toString().toInt() }.sum()
        }
        return answer
    }
}