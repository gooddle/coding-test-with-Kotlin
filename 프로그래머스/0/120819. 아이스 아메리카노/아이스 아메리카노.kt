class Solution {
    fun solution(money: Int): IntArray {
        var answer: MutableList<Int> = mutableListOf()
        var coffee : Int=5500
            if(money>=coffee){
                answer.add(money/coffee)
                answer.add(money%coffee)
            }else if(money<coffee){
                answer.add(0)
                answer.add(money)
            }
            
        
        return answer.toIntArray()
    }
}