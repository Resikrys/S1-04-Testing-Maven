package s1_04_testing_lvl1_ex1;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> bookList;

    public Library() {
        this.bookList = new ArrayList<>();
    }

    public ArrayList<Book> getBooks() {
        return (ArrayList<Book>) this.bookList;
    }

    public void addBook(Book book) {
        this.bookList.add(book);
    }

    //get book title at specific [i]
    public void getBookTitleAtIndex(int target) throws Exception {
        if (target >= 0 && target < bookList.size()) {
            System.out.println("Book searched:" + bookList.get(target).getTitle());
        } else {
            throw new Exception("The book was not found in the list.");
        }
    }

    //add book at specific [i]
    public void addBookAtIndex(int target, Book book) throws Exception {
        if (target >= 0 && target < bookList.size()) {
            bookList.add(target, book);
        } else {
            throw new Exception("The book was not added.");
        }
    }

    public void deleteBookByTitle(String title) throws Exception {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getTitle().equals(title)){
                bookList.remove(i);
            }
        }
    }

    public String toString() {
        return "Book list: " + this.getBooks();
    }
}
