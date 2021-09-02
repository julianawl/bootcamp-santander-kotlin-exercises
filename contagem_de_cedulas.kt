//Faça a leitura de um valor inteiro. Em seguida, calcule o menor número de notas possíveis (cédulas) 
//onde o valor pode ser decomposto. As notas que você deve considerar são de 100, 50, 20, 10, 5, 2 e
// 1. Na sequência mostre o valor lido e a relação de notas necessárias.

import java.util.Scanner

fun main(    ) {
    
    var valor: Int = readLine()!!.toInt()
    
    println(valor)
    
    println("${(valor.div(100)).toInt()} nota(s) de R$ 100,00")
    valor = valor % 100
    println("${(valor.div(50)).toInt()} nota(s) de R$ 50,00")
    valor = valor % 50
    println("${(valor.div(20)).toInt()} nota(s) de R$ 20,00")
    valor = valor % 20
    println("${(valor.div(10)).toInt()} nota(s) de R$ 10,00")
    valor = valor % 10
    println("${(valor.div(5)).toInt()} nota(s) de R$ 5,00")
    valor = valor % 5
    println("${(valor.div(2)).toInt()} nota(s) de R$ 2,00")
    valor = valor % 2
    println("${(valor).toInt()} nota(s) de R$ 1,00")
}