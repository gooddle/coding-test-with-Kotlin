class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var count =0
        var count1 =0
        for(i in num_list){
            if(i%2==0){
                count++
            }
            else if(i%2==1){
                count1++
            }
            answer = intArrayOf(count,count1)
        }
        return answer
    }
}