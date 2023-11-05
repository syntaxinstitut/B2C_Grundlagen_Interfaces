interface Fahrzeug {
    val marke: String
    fun fahren() {
        println("Das Fahrzeug fährt.")
    }
    fun hupe() {
        println("Das Fahrzeug hupt.")
    }
}