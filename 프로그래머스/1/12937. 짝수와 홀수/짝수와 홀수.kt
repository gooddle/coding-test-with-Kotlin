class Solution {
    fun solution(num: Int): String {
        var answer : String
        answer="Even"
        answer="Odd"
        if(num%2==0){
            answer="Even"
        }
        else if(num==1||num%2==1){
            answer="Odd"
        }
        return answer
    }
}