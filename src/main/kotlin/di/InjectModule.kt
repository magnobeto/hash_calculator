package di

import calculator.HashCalculator
import calculator.algorithm.HashAlgorithm
import ui.UserInterface

fun injectUserInterface() = UserInterface(injectHashCalculator())

fun injectHashCalculator() = HashCalculator(injectHashAlgorithm())

fun injectHashAlgorithm() = HashAlgorithm()