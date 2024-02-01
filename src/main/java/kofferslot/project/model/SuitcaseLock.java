package kofferslot.project.model;

public class SuitcaseLock {
    private static final char DEFAULT_FIRST_CHAR = 'A';
    private static final char DEFAULT_SECOND_CHAR = 'A';
    private static final char DEFAULT_NUMBER = 0;

    private char firstChar;
    private char secondChar;
    private int number;

    public SuitcaseLock() {
        this(DEFAULT_FIRST_CHAR, DEFAULT_SECOND_CHAR, DEFAULT_NUMBER);
    }

    public SuitcaseLock(char firstChar, char secondChar, int number) {
        setCombination(firstChar, secondChar, number);
    }

    /**
     * Instellen slotcombinatie van Kofferslot
     *
     * @param firstChar
     * @param secondChar
     * @param number
     */

    public void setCombination(char firstChar, char secondChar, int number) {
        this.setFirstChar(firstChar);
        this.setSecondChar(secondChar);
        this.setNumber(number);
    }

    public char nextChar(char letter) {
        if (letter == 'Z') {
            return 'A';
        } else {
            return ++letter;
        }
    }

    public int nextNumber(int cijfer) {
        if (cijfer == 9) {
            return 0;
        } else {
            return ++cijfer;
        }
    }

    /**
     * Volgende slotcombinatie draait eerste cijfer verder.
     * Indien cijfer weer 0 wordt, ook tweede letter uit letterlijst verder draaien.
     * Indien tweede letter weer A wordt, ook eerste letter uit letterlijst verder draaien.
     */

    public void next() {
        number = nextNumber(number);
        if (number == 0) {
            secondChar = nextChar(secondChar);
            if (secondChar == 'A') {
                firstChar = nextChar(firstChar);
            }
        }
    }

    public char getFirstChar() {
        return firstChar;
    }

    public void setFirstChar(char firstChar) {
        this.firstChar = firstChar;
    }

    public char getSecondChar() {
        return secondChar;
    }

    public void setSecondChar(char secondChar) {
        this.secondChar = secondChar;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
