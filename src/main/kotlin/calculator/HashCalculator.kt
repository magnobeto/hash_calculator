package calculator

import calculator.algorithm.HashMd5Algorithm
import di.injectHashMd5Algorithm

class HashCalculator(private val md5Calculator: HashMd5Algorithm = injectHashMd5Algorithm()) {

    companion object {
        private const val RESULT_STRING = "The result was"
    }

    fun printResult(input: String) = println("$RESULT_STRING ${getResult(input)}")

    private fun getResult(input: String) = md5Calculator.getMd5(input)
}