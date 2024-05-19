import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private int publicationBook;

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

    public int getPublicationBook() {
        return this.publicationBook;
    }

    public void setPublicationBook(int publicationBook) {
        this.publicationBook = publicationBook;
    }

    @Override
    public String toString() {
        return "Книга: " + title + "." + " Автор: " + author + "." + " Год публикации: " + publicationBook;
    }

    @Override
    public boolean equals(Object a) {
        if (this == a) {
            return true;
        }

        if (a == null || getClass() != a.getClass()) {
            return false;
        }
        Book book = (Book) a;
        return publicationBook == book.publicationBook && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publicationBook);
    }


}
