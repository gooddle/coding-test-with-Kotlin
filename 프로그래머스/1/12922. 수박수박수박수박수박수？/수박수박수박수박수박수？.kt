class Solution {
    fun solution(n: Int): String {
        var answer = ""
        var a ="수박"
        var b = "수"
        for(i in 1..n){
            if(n%2==0){
                answer=a.repeat(n/2)
            }else if(n%2==1){
                answer = a.repeat(n/2)+b
            }else if(n==1){
                answer = b
            }
        }
        return answer
    }
}