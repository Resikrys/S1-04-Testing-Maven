package s1_04_testing_lvl1_ex2;

public class CalculateDni {
    int num;
    String lettersList = "";
    char dniLetter;

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
        numToMatch = num;
        if(numToMatch >= 25 && numToMatch <= 0) {
            this.dniLetter = this.getLettersList().charAt(num);
        }
        return  dniLetter;
    }

    public String toString() {
        return "The dni letter of number " + this.getNum() + " is " + this.dniLetter;
    }

}
