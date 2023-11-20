package calculator.algorithm

import java.math.BigInteger
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException


class HashMd5Algorithm {

    companion object {
        private const val MD5 = "MD5"
    }

    fun getMd5(input: String): String {
        return try {

            // Static getInstance method is called with hashing MD5
            val md = MessageDigest.getInstance(MD5)

            // digest() method is called to calculate message digest
            // of an input digest() return array of byte
            val messageDigest = md.digest(input.toByteArray())

            // Convert byte array into signum representation
            val no = BigInteger(1, messageDigest)

            // Convert message digest into hex value
            var hashtext = no.toString(16)
            while (hashtext.length < 32) {
                hashtext = "0$hashtext"
            }
            hashtext
        } // For specifying wrong message digest algorithms
        catch (e: NoSuchAlgorithmException) {
            throw RuntimeException(e)
        }
    }
}