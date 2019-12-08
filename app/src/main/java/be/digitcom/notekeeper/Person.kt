package be.digitcom.notekeeper

class Person(val name: String, weightLbs: Double) {
    var weightLbs: Double = 0.0
    var weightKilos: Double
        get() = weightLbs / 2.2
        set(value) {
            weightLbs = value * 2.2
        }
}