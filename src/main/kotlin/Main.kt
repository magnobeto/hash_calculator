import di.injectHashCalculator

fun main() {
    val calculator by lazy { injectHashCalculator() }

    // TODO REFACTOR TO MAKE A INTERFACE ON TERMINAL LATER
    calculator.getResult("Flamengo")
}