package di

import calculator.HashCalculator
import calculator.algorithm.HashAlgorithm

fun injectHashCalculator() = HashCalculator(injectHashAlgorithm())

fun injectHashAlgorithm() = HashAlgorithm()