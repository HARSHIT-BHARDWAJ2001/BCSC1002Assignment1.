/*  Created by IntelliJ IDEA.
 *  User: Harshit Bhardwaj (hbh2001)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

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
}
