class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int =0
        for(i in numbers.indices){
            if(i in 0..9){
                answer = 45 -numbers.sum()
            }
            }
        return answer
        }
       
    }
