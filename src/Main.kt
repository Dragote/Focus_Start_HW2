fun main(args: Array<String>) {

    val deck = Deck("Мои задачи")
    val board1 = Board("Предстоящие задачи")
    val board2 = Board("Задачи в процессе")
    val board3 = Board("Выполненные задачи")
    deck.addBoard(board1)
    deck.addBoard(board2)
    deck.addBoard(board3)
    val task1 = Task("Сделать дело1")
    val task2 = Task("Сделать дело2")
    val task3 = Task("Сделать дело3")
    val task4 = Task("Сделать дело4")
    val task5 = Task("Сделать дело5")
    val task6 = Task("Сделать дело6")
    val task7 = Task("Сделать дело7")
    val task8 = Task("Сделать дело8")
    val task9 = Task("Сделать дело9")
    task1.addComment(Comment("Это комментарий"))
    task1.addComment(Comment("А это еще комментарий"))
    task1.addExecutor(Executor("Исполнитель1"))
    task3.addExecutor(Executor("Исполниель1042"))
    board1.addTask(task1)
    board1.addTask(task2)
    board1.addTask(task3)
    board2.addTask(task4)
    board2.addTask(task5)
    board2.addTask(task6)
    board3.addTask(task7)
    board3.addTask(task8)
    board3.addTask(task9)

    deck.info()

    deck.transferTask(0,board1,board3)

    deck.info()

}
