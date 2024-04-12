class Solution {
    fun solution(n: Int): Int {
        val List = mutableListOf<Int>()
        for(a in 2..n){
            if(n%a==1)
             List.add(a)
        }
        return List.minOrNull() ?: 0
    }
}