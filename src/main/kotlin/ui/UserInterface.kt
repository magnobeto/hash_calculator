package ui

import calculator.HashCalculator
import di.injectHashCalculator
import utils.*

class UserInterface(private val calculator: HashCalculator = injectHashCalculator()) {

    fun initInterface() = presentation()

    private fun presentation() {
        println("-----Calculadora Hash------")
        println("Digite o algoritmo que deseja utilizar:")
        println("1 - MD5")
        println("2 - SHA1")
        println("3 - SHA256")

        val userInput = readlnOrNull() ?: ""

        println("Você digitou: $userInput")
        selectAlgorithm(userInput)
    }

    private fun selectAlgorithm(userInput: String) {
        when {
            regexMD5.matches(userInput)-> {
                println("$ALGORITHM_SELECTED $MD5")
                calculator.algorithmMd5(userInput)
            }
            regexSHA1.matches(userInput) -> {
                println("$ALGORITHM_SELECTED $SHA_1")
                calculator.algorithmSha1(userInput)
            }
            regexSHA256.matches(userInput) -> {
                println("$ALGORITHM_SELECTED $SHA_256")
                calculator.algorithmSha256(userInput)
            }
        }
    }
}