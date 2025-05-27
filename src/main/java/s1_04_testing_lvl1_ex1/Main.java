package s1_04_testing_lvl1_ex1;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Estudi en escarlata", "Arthur Conan Doyle"));
        library.addBook(new Book("El nom del vent", "Patrick Rothfuss"));
        library.addBook(new Book("Pyroquinesis", "Stephen King"));
        library.addBook(new Book("El color de la magia", "Terry Pratchett"));

        System.out.println(library.toString());

        try {
            library.getBookTitleAtIndex(2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            library.deleteBookByTitle("Pyroquinesis");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(library.toString());

        Book myNewBook = new Book("Un mundo feliz", "Aldous Huxley");
        try {
            library.addBookAtIndex(1, myNewBook);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(library.toString());

    }

}
