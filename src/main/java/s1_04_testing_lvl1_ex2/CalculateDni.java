package s1_04_testing_lvl1_ex2;

public class CalculateDni {
    private int num;
    private String lettersList = "";
    private char dniLetter;

    public CalculateDni(int num) {
        this.num = num;
        this.lettersList = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    }

    public int getNum() {
        return this.num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getLettersList() {
        return this.lettersList;
    }

    public char matchNumWithDniLetter(int num) {
        for (int i = 0; i <= lettersList.length(); i++) {
            dniLetter = lettersList.charAt(num);
        }
        return  dniLetter;
    }

    public char getDniLetter() {
        return dniLetter;
    }

    public String toString() {
        return "The dni letter of number " + this.getNum() + " is " + this.dniLetter;
    }

}
