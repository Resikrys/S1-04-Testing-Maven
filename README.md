# SPRINT 1
## TASK 4: Testing

### LEVEL 1 - EXERCISE 1
Create a Java class that manages a collection of books in a library.
The class should allow adding books, retrieving the list of books,
getting a specific book by its position, adding a book at a specific
position, and removing a book by title.

Implement the following functionalities:

The class should allow adding books to the collection.
- It should be possible to retrieve the complete list of books
- It should be possible to obtain the title of a book given a position.
- It should be possible to add a book at a specific position.
- It should be possible to remove a book by title.
-
Verify its correct operation with JUnit:

- Verify that the list of books is not null after creating a new object.
- Confirm that the list has an expected size after inserting multiple books.
- Ensure that the list contains a specific book at its correct position.
- Verify that there are no duplicate book titles in the list.
- They verify that a book title can be retrieved given a specific position.
- They ensure that adding a book correctly modifies the list.
- They confirm that removing a book decreases the size of the list.
- They verify that the list remains alphabetically sorted after adding
  or removing a book.

### LEVEL 1 - EXERCISE 2
Create a class called CalculoDni that calculates the letter of the 
DNI when receiving the number as a parameter.
Create a jUnit class that verifies its correct operation, 
parameterizing it so that the test receives a wide spectrum of data 
and validates whether the calculation is correct for 10 predefined 
DNI numbers.

### LEVEL 1 - EXERCISE 3
Create a class with a method that throws an 
ArrayIndexOutOfBoundsException.
Verify its correct operation with a jUnit test.

### TECHNOLOGIES
| Package                    | Version | Description                |
|----------------------------|---------|----------------------------|
| `java`                     | ^24.0.1 | Principal project language |
| `Apache maven`             | ^4.0.0  | Project management tool    |
| `java.util`                | ^24.0.1 | Java standard library      |
| `org.junit.jupiter.api`    | ^5.13.0 | Java standard library      |
| `org.junit.jupiter.params` | ^5.13.0 | Java standard library      |

### REQUIREMENTS
Local environment: `IntelliJ or Eclipse`

###  INTELLIJ EXECUTION
To Run code, press `Ctrl F5` or click the `play` icon in the gutter.

### 🛠️ SCRIPTS

```bash
mvn compile          # Compile project
mvn test             # execute JUnit tests
mvn package          # Package in .jar
```