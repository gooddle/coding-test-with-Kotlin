class Solution {
    fun solution(numbers: IntArray): Double {
        var answer= 0L
        for(i in numbers.indices){
            answer += numbers[i]
            
        }
        return answer.toDouble()/numbers.size
    }
}