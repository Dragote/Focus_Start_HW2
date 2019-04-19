class Deck(
    private var name: String
) {
    private var boards: MutableList<Board> = mutableListOf<Board>()

    fun getName() = name

    fun addBoard(board: Board) {
        boards.add(board)
    }
    fun getBoard(index: Int): Board = boards[index]

    fun getBoards() = boards

    fun removeBoard(index: Int) {
        boards.removeAt(index)
    }
    fun transferTask(index: Int, ofBoard: Board, toBoard: Board) {
        toBoard.addTask(ofBoard.getTask(index))
        ofBoard.removeTask(index)

    }
    fun info() {
        println("_____ ${getName()} _____")

        for (i in 0 until getBoards().size) {
            print("Список: ")
            getBoard(i).getBoardInfo()
        }
        println("__________________")
    }
}