package calculator

import calculator.algorithm.HashAlgorithm
import di.injectHashAlgorithm
import utils.MD5
import utils.RESULT_STRING
import utils.SHA_1
import utils.SHA_256

class HashCalculator(private val hashAlgorithm: HashAlgorithm = injectHashAlgorithm()) {

    fun getResult(input: String) = println("$RESULT_STRING ${algorithmMd5(input)}")

    private fun algorithmMd5(input: String) = hashAlgorithm.parseAlgorithm(input, MD5)
    private fun algorithmSha1(input: String) = hashAlgorithm.parseAlgorithm(input, SHA_1)
    private fun algorithmSha256(input: String) = hashAlgorithm.parseAlgorithm(input, SHA_256)
}