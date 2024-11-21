class Solution {
    fun solution(arr: IntArray, k: Int): IntArray {
        val answer = mutableListOf<Int>()
        for(i in arr.indices){
            if(k %2 ==0){
                answer.add(arr[i]+k)
            }
            
            else{
                answer.add(arr[i]*k)
            }
       
        }   
    
        return answer.toIntArray()     
        
}
}