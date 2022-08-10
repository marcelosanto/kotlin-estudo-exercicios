package src.main.kotlin.fundamentos

fun main() {
    Repository.startFetch()
    getResul(Repository.getCurrentState())
    Repository.finishedFetch()
    getResul(Repository.getCurrentState())
    Repository.error()
    getResul(Repository.getCurrentState())
}

fun getResul(result: Result) {
    return when (result) {
        Result.SUCCESS -> println("Success!")
        Result.ERROR -> println("Error!")
        Result.IDLE -> println("Idle!")
        Result.LOADING -> println("Loading!")
    }
}

object Repository {
    private var loadState: Result = Result.IDLE
    private var dataFetched: String? = null

    fun startFetch() {
        loadState = Result.LOADING
        dataFetched = "data"
    }

    fun finishedFetch() {
        loadState = Result.SUCCESS
        dataFetched = null
    }

    fun error() {
        loadState = Result.ERROR
    }

    fun getCurrentState(): Result {
        return loadState
    }
}

enum class Result {
    SUCCESS,
    ERROR,
    IDLE,
    LOADING
}