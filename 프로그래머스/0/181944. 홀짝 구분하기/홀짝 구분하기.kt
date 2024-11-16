fun main(args: Array<String>) {
    val input = readLine()  
    val a = input?.toIntOrNull() ?: 0 
    if (a % 2 == 0) println("$a is even")
    if(a % 2 ==1 ) println("$a is odd")
}