class Lastwagen(override val marke: String) : Fahrzeug, Alarm {
    override fun hupe() {
        super<Fahrzeug>.hupe() // Aufruf der Fahrzeug-Hupe
        super<Alarm>.hupe()   // Aufruf der Alarm-Hupe
        println("Der Laster hat eine eigene Hupe.") // Eigene Implementierung
    }
}