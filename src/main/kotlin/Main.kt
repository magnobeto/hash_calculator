import di.injectUserInterface

fun main() {
    val userInterface by lazy { injectUserInterface() }

    userInterface.initInterface()
}