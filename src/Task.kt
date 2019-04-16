class Task(_text : String){
    private var text: String = ""

    fun getText():String = text

    init {
        text = _text
    }
}
