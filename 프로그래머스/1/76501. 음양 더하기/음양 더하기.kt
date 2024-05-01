class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer: Int = 0
        for(i in signs.indices){
            if(signs[i]==true){
                answer += absolutes[i]
            }else if(signs[i]==false){
                answer -= absolutes[i]
            }
        }
        return answer
        }
        
    }
