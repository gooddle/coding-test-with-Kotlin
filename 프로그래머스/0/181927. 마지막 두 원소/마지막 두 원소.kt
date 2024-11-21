class Solution {
    fun solution(num_list: IntArray):  MutableList<Int> {
        var answer = mutableListOf<Int>()
        for(i in num_list.indices){
           answer.add(num_list[i])
        }
       if (num_list.size > 1) { 
            val last = num_list.last() 
            val secondLast = num_list[num_list.lastIndex - 1] 

            if (last > secondLast) {
                answer.add(last - secondLast) 
            }
         else if( last < secondLast){
             answer.add(last*2)
         }
         else if( last == secondLast){
             answer.add(last*2)
         }
        }
        return answer
    }
}