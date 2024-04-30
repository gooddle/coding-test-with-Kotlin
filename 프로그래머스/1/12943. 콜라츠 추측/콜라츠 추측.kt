class Solution {
    fun solution(num: Int): Int {
        var answer = 0
        var n =num
        while(n!=1){
           if(n%2==0){
               n/=2
           }else if(n%2==1){
               n = (n*3)+1
           }  else if(answer >=500){
            answer = -1
            break
        }      
        answer++
          
        }
        return answer
    }
}