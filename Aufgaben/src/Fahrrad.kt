class Fahrrad(override val marke: String) : Fahrzeug {
    fun klingel() {
        println("Das Fahrrad klingelt.")
    }
}