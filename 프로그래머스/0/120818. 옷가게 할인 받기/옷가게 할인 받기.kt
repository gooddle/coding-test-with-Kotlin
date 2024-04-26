class Solution {
    fun solution(price: Int): Int {
        var answer = 0
        
         if (price>=100000&&price<300000 ){
            answer = (price*0.95).toInt()
            
        }else if(price >= 300000&&price<500000){
            answer =(price*0.9).toInt()
            
        }else if(price>=500000){
            answer = (price*0.8).toInt()
            
        }
        else if(price>=10&&price<100000){
            answer = price.toInt()
        }
        return  answer - (answer % 1)
    }
}