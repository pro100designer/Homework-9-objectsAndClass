public class Book {
    private String title;
    private Author author;
    public int publicationBook;

    public Book(String title, Author author, int publicationBook) {
        this.title = title;
        this.author = author;
        this.publicationBook = publicationBook;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublicationBook(int publicationBook) {
        return this.publicationBook;
    }

    public void setPublicationBook(int publicationBook) {
        this.publicationBook = publicationBook;
    }

    public String toString() {
        return "Книга: " + title + "." + " Автор: " + author + "." + " Год публикации: " + publicationBook;
    }


}
