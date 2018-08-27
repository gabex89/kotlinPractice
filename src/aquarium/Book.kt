package aquarium

/**
 * Created by SmoothSpark in 2018. 08. 27.
 *
 */

open class Book(val title: String = "", val author: String = "") {

    private val currentPage = 0

    open fun readPage() {
        currentPage.inc()
    }
}

class EBook(title: String, author: String, val format: String = "text") : Book(title, author) {

    private val wordCount: Int = 0

    override fun readPage() {
        wordCount.plus(250)
    }
}