class Solution {
    fun solution(flo: Double): Int {
        val floString = flo.toString()

   
        val lastDotIndex = floString.lastIndexOf(".")
        
   
        val answer = if (lastDotIndex != -1) floString.substring(0, lastDotIndex).toInt() else floString.toInt()
        
        return answer
    }
}