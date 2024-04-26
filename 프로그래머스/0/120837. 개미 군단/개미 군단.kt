class Solution {
    fun solution(hp: Int): Int {
        var answer: Int = 0
        var a = 5
        var b = 3
        var c = 1
        for(i in 0..hp){
            if(i%a==0){
                answer = i/a
            }else if(i%a!==0 && (i%a)%b==0){
                answer = (i/a)+(i%a)/b
            }else if(i%a!==0&&(i%a)%b!==0&&((i%a)%b)%c==0){
                answer =(i/a)+(i%a)/b+((i%a)%b)/c
            }
        }
   
        
        return answer
    }
}