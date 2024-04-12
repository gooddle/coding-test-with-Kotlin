class Solution {
    fun solution(x: Int, n: Int): LongArray {
        val result = LongArray(n) { i -> (i + 1L) * x }
        return result
    }
}
