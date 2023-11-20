package ui

import calculator.HashCalculator
import di.injectHashCalculator

class UserInterface(private val calculator: HashCalculator = injectHashCalculator()) {

    private lateinit var userInput: String

    fun presentation() {
        // Solicita ao usuário que digite um valor
        println("-----Calculadora Hash------")
        println("Digite o algoritmo que deseja utilizar:")
        println("1 - MD5")
        println("2 - SHA1")
        println("3 - SHA256")

        // Lê o valor digitado pelo usuário
        userInput = readlnOrNull() ?: ""

        // Exibe o valor digitado
        println("Você digitou: $userInput")
    }
}