class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer: Long = 0L
        var sum = 0L
        for(i in 1..count){
           sum += i*price
            if(money- sum>=0){
                answer = 0L
            }else if(money - sum<0){
                answer = sum- money
            }
        }
        return answer
    }
}