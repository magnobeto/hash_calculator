# hash_calculator
Projeto de implementação de calculadora hash e interface de usuário pelo terminal

To calculate cryptographic hashing value in Java, MessageDigest Class is used, under the package java.security. 

MessageDigest Class provides following cryptographic hash function to find hash value of a text, they are: 

-MD5\
-SHA-1  
-SHA-256  

This Algorithms are initialize in static method called getInstance(). After selecting the algorithm it calculate the digest value and return the results in byte array. 

BigInteger class is used, which converts the resultant byte array into its sign-magnitude representation. 

reference:
https://www.geeksforgeeks.org/md5-hash-in-java/
