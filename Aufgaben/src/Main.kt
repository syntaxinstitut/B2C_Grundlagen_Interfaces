fun main() {
    // Erstelle Instanzen von Auto und Fahrrad
    val meinAuto = Auto("Volkswagen")
    val meinFahrrad = Fahrrad("Trek")

    // Rufe die Methoden auf
    meinAuto.fahren()
    meinAuto.tanke()
    meinAuto.hupe()

    meinFahrrad.fahren()
    meinFahrrad.klingel()
    meinFahrrad.hupe()

    // Demonstration des Interface-Konflikts
    val meinLastwagen = Lastwagen("BMW")
   meinLastwagen.hupe()
}