class Board(
    var name: String,
    var comingTasks: MutableList<Task> = mutableListOf<Task>(),
    var proccesTasks: MutableList<Task> = mutableListOf<Task>(),
    var doneTasks: MutableList<Task> = mutableListOf<Task>()
) {

    fun addTask(task: Task, list : MutableList<Task>) {
        list.add(task)
    }

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
        for (i in 0 until comingTasks.size) {
            println("${i+1}) ${comingTasks[i].text}")
        }
        println("Задачи в процессе:")
        for (i in 0 until proccesTasks.size) {
            println("${i+1}) ${proccesTasks[i].text}")
        }
        println("Выполненные:")
        for (i in 0 until doneTasks.size) {
            println("${i+1}) ${doneTasks[i].text}")
        }
    }

}