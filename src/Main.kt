fun main(args: Array<String>) {

    Board("MyBoard").also {

        it.addTask(Task("Сделать дело1"), it.comingTasks)
        it.addTask(Task("Сделать дело2"), it.comingTasks)
        it.addTask(Task("Сделать дело3"), it.comingTasks)
        it.addTask(Task("Сделать дело4"), it.proccesTasks)
        it.addTask(Task("Сделать дело5"), it.proccesTasks)
        it.addTask(Task("Сделать дело6"), it.proccesTasks)
        it.addTask(Task("Сделать дело7"), it.doneTasks)
        it.addTask(Task("Сделать дело8"), it.doneTasks)
        it.addTask(Task("Сделать дело9"), it.doneTasks)

        it.info()

        it.removeTask(1, it.comingTasks)
        it.transferTask(1, it.proccesTasks, it.doneTasks)

        it.info()
    }
}
