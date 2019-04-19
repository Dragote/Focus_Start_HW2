class Task(private var text: String) {
    private var comments: MutableList<Comment> = mutableListOf<Comment>()
    private var executors: MutableList<Executor> = mutableListOf<Executor>()

    fun getText(): String = text

    fun addComment(comment: Comment) {
        comments.add(comment)
    }
    fun getComment(index: Int): Comment = comments[index]

    fun getComments(): MutableList<Comment> = comments

    fun removeComment(index: Int) {
        comments.removeAt(index)
    }
    fun addExecutor(executor: Executor) {
        executors.add(executor)
    }
    fun getExecutor(index: Int): Executor = executors[index]

    fun getExecutors(): MutableList<Executor> = executors

    fun removeExecutor(index: Int) {
        executors.removeAt(index)
    }
    fun getTaskInfo() {
        println(getText())
        if (getComments().isNotEmpty()) {
            println("Комментарии: ")
            for (i in 0 until getComments().size) {
                println("   ${getComment(i).getText()}")
            }
        }
        if (getExecutors().isNotEmpty()) {
            println("Исполнители: ")
            for (i in 0 until getExecutors().size) {
                println("   ${getExecutor(i).getName()}")
            }
        }
    }
}
