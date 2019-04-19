class Board(
    private var name: String
) {
    private var tasks: MutableList<Task> = mutableListOf<Task>()

    fun getName() = name

    fun getTasks() = tasks

    fun getTask(index: Int): Task = tasks[index]

    fun addTask(task: Task) {
        tasks.add(task)
    }
    fun removeTask(index: Int) {
        tasks.removeAt(index)
    }
    fun getBoardInfo() {
        println(getName())
        for (i in 0 until getTasks().size) {
            print("${i + 1})")
            getTask(i).getTaskInfo()
        }
    }
}