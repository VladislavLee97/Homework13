import java.util.Objects;

public class Book {
    private String title;
    private int publishingYear;
    private Author author;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, publishingYear, author);
    }

    public Book(String title, Author author, int publishingYear) {
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublishingYear() {
        if (publishingYear > 2050 || publishingYear < 1500) {
            throw new RuntimeException("Invalid publishing year: " + publishingYear);
        }
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        if (publishingYear > 2050 || publishingYear < 1500) {
            throw new RuntimeException("Invalid publishing year: " + publishingYear);
        }
        this.publishingYear = publishingYear;
    }

    public String toString() {
        return "Название: " + this.title + ", дата публикации: " + this.publishingYear + ", автор: " + this.author;
    }
}

