class Executor (_name: String) {
    private var name: String = ""

    fun getName(): String = name

    init {
        name = _name
    }
}