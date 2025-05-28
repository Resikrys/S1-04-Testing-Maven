package s1_04_testing_lvl1_ex2;

public class CalculateDni {
    private int num;
    private static final String LETTERS_LIST = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private char dniLetter;

    public CalculateDni(int num) {
        this.num = num;
        this.dniLetter = ' ';
//        this.lettersList = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    }

    public int getNum() {
        return this.num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getLettersList() {
        return LETTERS_LIST;
    }

    public char matchNumWithDniLetter(int num) {
        for (int i = 0; i <= LETTERS_LIST.length(); i++) {
            this.dniLetter = LETTERS_LIST.charAt(num);
        }
        return  dniLetter;
    }

    public char getDniLetter() {
        return this.dniLetter;
    }

    public String toString() {
        return "The dni letter of number " + this.getNum() + " is " + this.dniLetter;
    }

}
