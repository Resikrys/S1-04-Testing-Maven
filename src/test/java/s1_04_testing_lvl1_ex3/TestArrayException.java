package s1_04_testing_lvl1_ex3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestArrayException {
    @Test
    void testExceptionArrayIndexOutOfBounds() {
        ArrayException exception = new ArrayException();
        assertThrows(ArrayIndexOutOfBoundsException.class, exception::throwException);
    }
}
