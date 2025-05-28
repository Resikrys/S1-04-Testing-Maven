package s1_04_testing_lvl1_ex2;

public class CalculateDni {
    private int num;
    private char dniLetter;

    private static final char[] LETTERS_LIST = {
            'T', 'R', 'W', 'A', 'G', 'M', 'Y',
            'F', 'P', 'D', 'X', 'B', 'N', 'J',
            'Z', 'S', 'Q', 'V', 'H', 'L', 'C',
            'K', 'E'
    };

    public CalculateDni(int num) {
        this.num = num;
        this.dniLetter = letterCalculator();
    }

    public char letterCalculator() {
        return LETTERS_LIST[num % 23];
    }

    public char getDniLetter() {
        return dniLetter;
    }

    public String toString() {
        return "The DNI letter of number " + this.num + " is " + this.dniLetter;
    }

}
