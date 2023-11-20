package di

import calculator.HashCalculator
import calculator.algorithm.HashMd5Algorithm

fun injectHashCalculator() = HashCalculator(injectHashMd5Algorithm())

fun injectHashMd5Algorithm() = HashMd5Algorithm()