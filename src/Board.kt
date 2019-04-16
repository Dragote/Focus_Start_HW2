class Board(
    private var name: String,
    private var comingTasks: MutableList<Task> = mutableListOf<Task>(),
    private var processTasks: MutableList<Task> = mutableListOf<Task>(),
    private var doneTasks: MutableList<Task> = mutableListOf<Task>()
) {

    fun addTask(task: Task, list : MutableList<Task>) {
        list.add(task)
    }

    fun getName() = name
    fun getComingTasks() = comingTasks
    fun getProcessTasks() = processTasks
    fun getDoneTasks() = doneTasks


    fun removeTask(index: Int, list: MutableList<Task>) {
        list.removeAt(index)
    }

    fun transferTask(index: Int, ofList: MutableList<Task>, toList: MutableList<Task>){
        toList.add(ofList[index])
        ofList.removeAt(index)

    }
    fun info() {
        println("_____ $name ____")
        println("Предстоящие задачи:")
        for (i in 0 until getComingTasks().size) {
            println("${i+1}) ${getComingTasks()[i].getText()}")
        }
        println("Задачи в процессе:")
        for (i in 0 until processTasks.size) {
            println("${i+1}) ${processTasks[i].getText()}")
        }
        println("Выполненные:")
        for (i in 0 until doneTasks.size) {
            println("${i+1}) ${doneTasks[i].getText()}")
        }
    }

}