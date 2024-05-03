class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 1
        var result =1 
        for(i in num_list.indices)
        {
            if(num_list.size >= 11){
                result += num_list[i]
                answer = result-1
            }
            else if( 10 >= num_list.size){
                answer *=num_list[i]
            }
            
            
        }
        return answer
    }
}