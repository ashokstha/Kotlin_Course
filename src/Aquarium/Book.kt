package Aquarium

/*open class Book(val title:String, val author: String){
    private var currentPage:Int = 1

    open fun readPage(){
        currentPage++
    }

}

class ebook(title: String, author: String, var format: String = "text"):Book(title, author){

    private var wordsRead = 0

    override fun readPage(){
        wordsRead = wordsRead + 250
    }
}*/

class Book(val title: String, val author: String, val year: Int) {

    fun getTitleAuthor(): Pair<String, String> {
        return (title to author)
    }

    fun getTitleAuthorYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
}

fun main(args: Array<String>) {

    val book = Book("Romeon and Juliet", "William Shakespeare", 1597)
    val bookTitleAuthor = book.getTitleAuthor()
    val bookTitleAuthorYear = book.getTitleAuthorYear()

    println("Here is your book ${bookTitleAuthor.first} by ${bookTitleAuthor.second}")

    println("Here is your book ${bookTitleAuthorYear.first} " +
            "by ${bookTitleAuthorYear.second} written in ${bookTitleAuthorYear.third}")

}