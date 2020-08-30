/*  Created by IntelliJ IDEA.
 *  User: Harshit Bhardwaj (hbh2001)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String nameOfTheBook;
    private String nameOfTheAuthorOfTheBook;
    private String ISBNNumberOfTheBook;

    public Book(String nameOfTheBook, String nameOfTheAuthorOfTheBook, String ISBNNumberOfTheBook) {
        this.nameOfTheBook = nameOfTheBook;
        this.nameOfTheAuthorOfTheBook = nameOfTheAuthorOfTheBook;
        this.ISBNNumberOfTheBook = ISBNNumberOfTheBook;
    }

    public String getNameOfTheBook() {
        return nameOfTheBook;
    }

    public void setNameOfTheBook(String nameOfTheBook) {
        this.nameOfTheBook = nameOfTheBook;
    }

    public String getNameOfTheAuthorOfTheBook() {
        return nameOfTheAuthorOfTheBook;
    }

    public void setNameOfTheAuthorOfTheBook(String nameOfTheAuthorOfTheBook) {
        this.nameOfTheAuthorOfTheBook = nameOfTheAuthorOfTheBook;
    }

    public String getISBNNumberOfTheBook() {
        return ISBNNumberOfTheBook;
    }

    public void setISBNNumberOfTheBook(String ISBNNumberOfTheBook) {
        this.ISBNNumberOfTheBook = ISBNNumberOfTheBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameOfTheBook='" + nameOfTheBook + '\'' +
                ", nameOfTheAuthorOfTheBook='" + nameOfTheAuthorOfTheBook + '\'' +
                ", ISBNNumberOfTheBook='" + ISBNNumberOfTheBook + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(nameOfTheBook, book.nameOfTheBook) &&
                Objects.equals(nameOfTheAuthorOfTheBook, book.nameOfTheAuthorOfTheBook) &&
                Objects.equals(ISBNNumberOfTheBook, book.ISBNNumberOfTheBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfTheBook, nameOfTheAuthorOfTheBook, ISBNNumberOfTheBook);
    }
}
