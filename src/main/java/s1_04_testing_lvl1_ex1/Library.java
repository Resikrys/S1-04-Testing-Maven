package s1_04_testing_lvl1_ex1;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> bookList;

    public Library() {
        this.bookList = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return this.bookList;
    }

    public void addBook(Book book) {
        for (Book b : bookList) {
            if (b.getTitle().equalsIgnoreCase(book.getTitle())) {
                return; //If exists, scape loop
            }
        }
        bookList.add(book);
        bookList.sort((b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));
    }

    //get book title at specific [i]
    public String getBookTitleAtIndex(int target) throws Exception {
        if (target >= 0 && target < bookList.size()) {
            return bookList.get(target).getTitle();
        } else {
            throw new Exception("The book was not found in the list.");
        }
    }

    //add book at specific [i]
    public void addBookAtIndex(int index, Book book) throws Exception {
        if (index >= 0 && index <= bookList.size()) {
            bookList.add(index, book);
            bookList.sort((b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));
        } else {
            throw new Exception("Invalid index.");
        }
    }

    public void deleteBookByTitle(String title) throws Exception {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getTitle().equals(title)) {
                bookList.remove(i);
                return;
            }
        }
        throw new Exception("Book with title \"" + title + "\" not found.");
    }

    public String toString() {
        return "Book list: " + this.getBooks();
    }
}
