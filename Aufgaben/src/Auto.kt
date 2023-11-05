class Auto(override val marke: String) : Fahrzeug {
    fun tanke() {
        println("Das Auto tankt.")
    }

    override fun hupe() {
        println("Das Auto hupt.")
    }
}