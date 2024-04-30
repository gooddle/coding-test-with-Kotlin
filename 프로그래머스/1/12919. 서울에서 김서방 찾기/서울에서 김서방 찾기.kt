class Solution {
    fun solution(seoul: Array<String>): String {
        var answer = ""
        var num =0
        for(i in seoul.indices){
            if(seoul[i]==("Kim")){
                 num = i
             
            }
        }
        answer = "김서방은 ${num}에 있다"
        return answer
    }
}