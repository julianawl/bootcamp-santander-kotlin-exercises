//Você tem em mãos dois cabos circulares de energia. O primeiro cabo tem raio R1 e o segundo raio 
//R2. Você precisa comprar um conduite circular de maneira a passar os dois cabos por dentro dele
//Qual o menor raio do conduite que você deve comprar? Em outras palavras, dado dois círculos, qual 
//o raio do menor círculo que possa englobar ambos os dois?

import java.util.Scanner

fun main() {

  val input = Scanner(System.`in`)
  val n = input.nextInt()
  
  for(i in 0..n-1){
    val r1: Int = input.nextInt()
    val r2: Int = input.nextInt()
    
    println(r1+r2)
  }
}