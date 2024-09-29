class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer = 0
        
        for (i in 1..number) {
            var divisorCount = 0
            val sqrt = kotlin.math.sqrt(i.toDouble()).toInt()
            
            for (j in 1..sqrt) {
                if (i % j == 0) {
                    divisorCount++  
                    if (j != i / j) {  
                        divisorCount++ 
                    }
                }
            }
            
            if (divisorCount > limit) {
                answer += power
            } else {
                answer += divisorCount
            }
        }
        
        return answer
    }
}