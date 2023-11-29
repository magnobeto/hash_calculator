package utils

val regexMD5 = Regex("(MD5|1)", RegexOption.IGNORE_CASE)
val regexSHA1 = Regex("(SHA-1|SHA1|2)", RegexOption.IGNORE_CASE)
val regexSHA256 = Regex("(SHA-256|SHA256|3)", RegexOption.IGNORE_CASE)