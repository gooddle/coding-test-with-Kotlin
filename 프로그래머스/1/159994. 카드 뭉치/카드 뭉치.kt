class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var answer = "Yes" // 기본적으로 목표를 이룬다고 가정
        var cards1Index = 0
        var cards2Index = 0
        
        for (g in goal) {
           
            if (cards1Index < cards1.size && cards1[cards1Index] == g) {
                cards1Index++
            } else if (cards2Index < cards2.size && cards2[cards2Index] == g) {
                cards2Index++
            } else {
                
                answer = "No"
                break
            }
        }

        return answer
    }
}