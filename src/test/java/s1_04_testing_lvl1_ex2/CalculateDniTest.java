package s1_04_testing_lvl1_ex2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculateDniTest {
    private CalculateDni newMatchLetter;


    @BeforeEach
    void setUp() {
        CalculateDni newMatchLetter = new CalculateDni(2);
    }

    @Test
    void testLetterMatchWithGivenNumber() {
        num = newMatchLetter.getNum();
        dniLetter = newMatchLetter.getDniLetter() = newMatchLetter.getLettersList().charAt(num);
        assertTrue(dniLetter == newMatchLetter.getLettersList().charAt(num), "Correct letter obtained: ");
    }


}
