public class Book {
    private String bookName;
    private Author author;
    private int publisherYear;


    public Book(String bookName, Author author, int publisherYear) {
        this.bookName = bookName;
        this.publisherYear = publisherYear;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public int getPublisherYear() {
        return publisherYear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setPublisherYear(int publisherYear) {
        this.publisherYear = publisherYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author=" + author +
                ", publisherYear=" + publisherYear +
                '}';
    }
}
