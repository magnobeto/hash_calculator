package calculator

import calculator.algorithm.HashAlgorithm
import calculator.algorithm.HashAlgorithm.Companion.MD5
import calculator.algorithm.HashAlgorithm.Companion.SHA_1
import calculator.algorithm.HashAlgorithm.Companion.SHA_256
import di.injectHashAlgorithm

class HashCalculator(private val hashAlgorithm: HashAlgorithm = injectHashAlgorithm()) {

    companion object {
        private const val RESULT_STRING = "The result was"
    }

    fun getResult(input: String) = println("$RESULT_STRING ${algorithmMd5(input)}")

    private fun algorithmMd5(input: String) = hashAlgorithm.parseAlgorithm(input, MD5)
    private fun algorithmSha1(input: String) = hashAlgorithm.parseAlgorithm(input, SHA_1)
    private fun algorithmSha256(input: String) = hashAlgorithm.parseAlgorithm(input, SHA_256)
}