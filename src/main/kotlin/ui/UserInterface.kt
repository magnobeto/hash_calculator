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

        val choosedAlgorithm = readlnOrNull() ?: ""
        println("Você escolheu: $choosedAlgorithm")
        println("Digite o texto que deseja calcular o hash:")
        val inputText = readlnOrNull() ?: ""
        println("Você digitou o texto: $inputText")
        selectAlgorithm(choosedAlgorithm, inputText)
    }

    private fun selectAlgorithm(choosedAlgorithm: String, inputText: String) {
        when {
            regexMD5.matches(choosedAlgorithm)-> {
                println("$ALGORITHM_SELECTED $MD5")
                calculator.algorithmMd5(inputText)
            }
            regexSHA1.matches(choosedAlgorithm) -> {
                println("$ALGORITHM_SELECTED $SHA_1")
                calculator.algorithmSha1(inputText)
            }
            regexSHA256.matches(choosedAlgorithm) -> {
                println("$ALGORITHM_SELECTED $SHA_256")
                calculator.algorithmSha256(inputText)
            }
        }
    }
}