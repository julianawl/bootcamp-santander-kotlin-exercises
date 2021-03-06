//A corrida de tartarugas é um esporte que cresceu muito nos últimos anos, fazendo com que vários 
//competidores se dediquem a capturar tartarugas rápidas, e treina-las para faturar milhões em 
//corridas pelo mundo. Porém a tarefa de capturar tartarugas não é uma tarefa muito fácil, pois 
//quase todos esses répteis são bem lentos. Cada tartaruga é classificada em um nível dependendo 
//de sua velocidade:
//Nível 1: Se a velocidade é menor que 10 cm/h .
//Nível 2: Se a velocidade é maior ou igual a 10 cm/h e menor que 20 cm/h .
//Nível 3: Se a velocidade é maior ou igual a 20 cm/h .
//Sua tarefa é identificar qual o nível de velocidade da tartaruga mais veloz de um grupo.

import java.io.EOFException

fun main(args: Array<String>) {
    while (true) {
        try {
            readLine()!!.toInt()
            val v = readLine()!!.split(" ").run { map { it.toInt() } }
            val sorted = v.toTypedArray()

            sorted.sort()

            when (sorted.last()) {
                in 0 .. 9 -> {
                    println(1)
                }
                in 10 .. 19 -> {
                    println(2)
                }
                else -> {
                    println(3)
                }
            }
        } catch (f: Exception) {
            break
        } catch (n: Exception) {
            break
        } catch (e: Exception) {
            break
        }
    }
}