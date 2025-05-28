package s1_04_testing_lvl1_ex2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class CalculateDniTest {

    @ParameterizedTest
    @CsvSource({
            "12345678, Z",
            "11111111, H",
            "22222222, J",
            "98765432, M",
            "87654321, X",
            "13579135, G",
            "24680246, G",
            "10000000, Z",
            "20000000, M",
            "30000000, L"
    })
    void testDniLetterCalculator(int num, char assignedLetter) {
        CalculateDni calc = new CalculateDni(num);
        assertEquals(assignedLetter, calc.getDniLetter());
    }
}
