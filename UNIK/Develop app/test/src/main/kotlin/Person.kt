data class Person(var firstName: String, var secondName: String) {
    fun getFullName(): String {
        return "$firstName $secondName"
        }
}