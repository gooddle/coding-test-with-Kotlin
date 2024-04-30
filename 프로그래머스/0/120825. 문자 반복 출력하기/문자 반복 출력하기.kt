class Solution {
    fun solution(my_string: String, n: Int): String {
        var answer: String = ""
        for(i in my_string){
            answer += i.toString().repeat(n)
        }
        return answer
    }
}