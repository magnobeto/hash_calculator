package ui

import calculator.HashCalculator
import di.injectHashCalculator
import utils.ALGORITHM_SELECTED
import utils.MD5
import utils.SHA_1
import utils.SHA_256

class UserInterface(private val calculator: HashCalculator = injectHashCalculator()) {

    fun initInterface() = presentation()
    val regexMD5 = Regex("(MD5|1)", RegexOption.IGNORE_CASE)
    val regexSHA1 = Regex("(SHA-1|SHA1|2)", RegexOption.IGNORE_CASE)
    val regexSHA256 = Regex("(SHA-256|SHA256|3)", RegexOption.IGNORE_CASE)

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