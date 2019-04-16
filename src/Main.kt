class Main {
    fun main() {

        val board = Board("MyBoard")

        board.addTask(Task("Сделать дело1"), board.comingTasks)
        board.addTask(Task("Сделать дело2"), board.comingTasks)
        board.addTask(Task("Сделать дело3"), board.comingTasks)
        board.addTask(Task("Сделать дело4"), board.proccesTasks)
        board.addTask(Task("Сделать дело5"), board.proccesTasks)
        board.addTask(Task("Сделать дело6"), board.proccesTasks)
        board.addTask(Task("Сделать дело7"), board.doneTasks)
        board.addTask(Task("Сделать дело8"), board.doneTasks)
        board.addTask(Task("Сделать дело9"), board.doneTasks)

        board.info()

        board.removeTask(1, board.comingTasks)
        board.transferTask(1, board.proccesTasks, board.doneTasks)

        board.info()


    }
}