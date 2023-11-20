package ui

import calculator.HashCalculator
import di.injectHashCalculator
import utils.MD5
import utils.SHA_1
import utils.SHA_256

class UserInterface(private val calculator: HashCalculator = injectHashCalculator()) {

    private lateinit var userInput: String

    fun presentation() {
        println("-----Calculadora Hash------")
        println("Digite o algoritmo que deseja utilizar:")
        println("1 - MD5")
        println("2 - SHA1")
        println("3 - SHA256")

        userInput = readlnOrNull() ?: ""

        println("Você digitou: $userInput")
        selectAlgorithm()
    }

    private fun selectAlgorithm() {
        when {
            userInput.contains(MD5, true) -> calculator.getResult(userInput)
            userInput.contains(SHA_1, true) -> calculator.getResult(userInput)
            userInput.contains(SHA_256, true) -> calculator.getResult(userInput)
        }
    }
}