class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0
        var str1 = a.toString()
        var str2 = b.toString()
        var result1 = str1+str2
        var result2 = str2+str1
        if(result1.toInt() > result2.toInt()){
            answer = result1.toInt()
        }
        else if(result2.toInt()> result1.toInt()){
            answer = result2.toInt()
        }
        else if(result2.toInt() == result1.toInt()){
            answer = result1.toInt()
        }
        return answer.toInt()
    }
}