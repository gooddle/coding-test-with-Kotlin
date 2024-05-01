class Solution {
    fun solution(s: String): Boolean {
        var answer = true
        if(s.all { it.isDigit() }&& s.length==4){
            answer = true
        }else if(s.all { it.isDigit() }&& s.length==6){
            answer= true
        }else{
            answer =false
        }
        return answer
    }
}