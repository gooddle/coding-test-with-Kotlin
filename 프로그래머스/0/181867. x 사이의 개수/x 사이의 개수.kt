class Solution {
    fun solution(myString: String): ArrayList<Int> {
          
        val answer = myString.split("x")
                             .map { it.length }  
                             .toCollection(ArrayList()) 

        return answer
    }
}