fun main(args: Array<String>) {

    Board("MyBoard").also {

        it.addTask(Task("Сделать дело1"), it.getComingTasks())
        it.addTask(Task("Сделать дело2"), it.getComingTasks())
        it.addTask(Task("Сделать дело3"), it.getComingTasks())
        it.addTask(Task("Сделать дело4"), it.getProcessTasks())
        it.addTask(Task("Сделать дело5"), it.getProcessTasks())
        it.addTask(Task("Сделать дело6"), it.getProcessTasks())
        it.addTask(Task("Сделать дело7"), it.getDoneTasks())
        it.addTask(Task("Сделать дело8"), it.getDoneTasks())
        it.addTask(Task("Сделать дело9"), it.getDoneTasks())

        it.info()

        it.removeTask(1, it.getComingTasks())
        it.transferTask(1, it.getProcessTasks(), it.getDoneTasks())

        it.info()
    }
}
