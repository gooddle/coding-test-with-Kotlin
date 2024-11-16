class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = mutableListOf<Int>()
        for(i in arr.indices){
            if(arr[i] % 2 == 0&& arr[i] >=50 ){
             answer.add(arr[i]/2)
            }
            else if(arr[i]%2 ==1 &&arr[i]<50){
                answer.add(arr[i]*2)
            }
            else if(arr[i] %2==0 && arr[i]<50){
                answer.add(arr[i])
            }
            else if(arr[i] % 2==1 && arr[i]>50){
                answer.add(arr[i])
            }
        }
        return answer.toIntArray()
    }
}