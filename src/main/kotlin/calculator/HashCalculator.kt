package calculator

import calculator.algorithm.HashAlgorithm
import di.injectHashAlgorithm
import utils.MD5
import utils.RESULT_STRING
import utils.SHA_1
import utils.SHA_256

class HashCalculator(private val hashAlgorithm: HashAlgorithm = injectHashAlgorithm()) {

    fun algorithmMd5(input: String) = println("$RESULT_STRING ${hashAlgorithm.parseAlgorithm(input, MD5)}")
    fun algorithmSha1(input: String) = println("$RESULT_STRING ${hashAlgorithm.parseAlgorithm(input, SHA_1)}")
    fun algorithmSha256(input: String) = println("$RESULT_STRING ${hashAlgorithm.parseAlgorithm(input, SHA_256)}")
}