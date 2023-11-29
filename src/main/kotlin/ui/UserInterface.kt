package ui

import calculator.HashCalculator
import di.injectHashCalculator
import utils.*

class UserInterface(private val calculator: HashCalculator = injectHashCalculator()) {

    fun initInterface() {
        println("-----Calculadora Hash------")
        presentation()
    }

    private fun presentation() {
        println()
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
            regexMD5.matches(choosedAlgorithm) -> {
                println("$ALGORITHM_SELECTED $MD5")
                calculator.algorithmMd5(inputText)
                decideContinueOrEndProgram()
            }

            regexSHA1.matches(choosedAlgorithm) -> {
                println("$ALGORITHM_SELECTED $SHA_1")
                calculator.algorithmSha1(inputText)
                decideContinueOrEndProgram()
            }

            regexSHA256.matches(choosedAlgorithm) -> {
                println("$ALGORITHM_SELECTED $SHA_256")
                calculator.algorithmSha256(inputText)
                decideContinueOrEndProgram()
            }

            else -> {
                println("Não escolheu um algoritmo válido, tente novamente.")
                presentation()
            }
        }
    }

    private fun decideContinueOrEndProgram() {
        println()
        println("Digite encerrar?")
        println("1 - Sim")
        println("2 - Não")
        val inputText = readlnOrNull() ?: ""
        when {
            regexContinueProgram.matches(inputText) -> {
                presentation()
            }

            regexEndProgram.matches(inputText) -> {}
        }
    }
}