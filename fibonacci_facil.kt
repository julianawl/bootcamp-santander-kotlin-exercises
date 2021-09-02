//A seguinte sequência de números 0 1 1 2 3 5 8 13 21... é conhecida como série de Fibonacci. Nessa 
//sequência, cada número, depois dos 2 primeiros, é igual à soma dos 2 anteriores. Escreva um 
//algoritmo que leia um inteiro N (N < 46) e mostre os N primeiros números dessa série.

fun main(args: Array<String>) {
    
    val n = readLine()!!.toInt()
    var f = 1
    var ant = 0
    var sum: Int
    val sequence = mutableListOf("0")
    sequence.add(" ")
    
    for (i in 0 until n-1) {
      sequence.add(f.toString())
      sequence.add(" ")
      sum = f
      f += ant
      ant = sum
    }
    
    sequence.forEach{ n -> print(n)}
}