package ui

import calculator.HashCalculator
import di.injectHashCalculator
import utils.MD5
import utils.SHA_1
import utils.SHA_256

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
            userInput.contains(MD5, true) -> calculator.algorithmMd5(userInput)
            userInput.contains(SHA_1, true) -> calculator.algorithmSha1(userInput)
            userInput.contains(SHA_256, true) -> calculator.algorithmSha256(userInput)
        }
    }
}