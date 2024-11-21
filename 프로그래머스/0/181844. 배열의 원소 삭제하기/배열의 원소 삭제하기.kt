class Solution {
    fun solution(arr: IntArray, delete_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        for(i in arr.indices){
            if( arr[i] !in delete_list){
                answer += arr[i]
            }
        }
        
        return answer
    }
}