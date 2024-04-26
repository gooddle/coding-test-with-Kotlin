class Solution {
    fun solution(n: Int): IntArray {
        val answer: MutableList<Int> = mutableListOf()
        for (i in 1..n) {
            if (i % 2 == 1) {
                answer.add(i)
            }
        }
        val sortedArray = answer.toIntArray()
        sortedArray.sort()
        return sortedArray
    }
}
