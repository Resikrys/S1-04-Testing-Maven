package s1_04_testing_lvl1_ex1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    private Library library;
    private Book book1, book2, book3;

    @BeforeEach
    void setUp() {
        library = new Library();
        book1 = new Book("Los desposeídos", "ursula K. Le Guin");
        book2 = new Book("1984", "George Orwell");
        book3 = new Book("El robot completo", "Isaac Asimov");
    }

    @Test
    void testBookListNotNullAfterCreation() {
        assertNotNull(library.getBooks(), "Book list cannot be null");
    }

    @Test
    void testBookListSizeAfterAddingBooks() {
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.getBooks().size(), "Book list should have 2 books");
    }

    @Test
    void testBookAtCorrectPosition() throws Exception {
        library.addBook(book1);
        library.addBook(book2);
        assertEquals("1984", library.getBookTitleAtIndex(1));
    }

    @Test
    void testNoDuplicateTitles() {
        library.addBook(book1);
        library.addBook(new Book("El robot completo", "Another autor"));
        long count = library.getBooks().stream()
                .map(Book::getTitle)
                .filter(title -> title.equals("El robot completo"))
                .count();
        assertEquals(1, count, "Duplicators not allowed");
    }

    @Test
    void testGetBookTitleByIndex() throws Exception {
        library.addBook(book1);
        assertEquals("El robot completo", library.getBookTitleAtIndex(0));
    }

    @Test
    void testAddBookModifiesList() {
        assertEquals(0, library.getBooks().size());
        library.addBook(book1);
        assertEquals(1, library.getBooks().size());
        assertEquals("El robot completo", library.getBooks().get(0).getTitle());
    }

    @Test
    void testDeleteBookDecreasesSize() throws Exception {
        library.addBook(book1);
        library.addBook(book2);
        library.deleteBookByTitle("El Quijote");
        assertEquals(1, library.getBooks().size());
        assertEquals("1984", library.getBooks().get(0).getTitle());
    }

    @Test
    void testBookListAlphabeticalOrder() {
        library.addBook(book2); // 1984
        library.addBook(book3); // Cien años de soledad
        library.addBook(book1); // El Quijote

        List<Book> books = library.getBooks();
        for (int i = 0; i < books.size() - 1; i++) {
            String current = books.get(i).getTitle();
            String next = books.get(i + 1).getTitle();
            assertTrue(current.compareToIgnoreCase(next) <= 0, "Unordered list");
        }
    }
}

