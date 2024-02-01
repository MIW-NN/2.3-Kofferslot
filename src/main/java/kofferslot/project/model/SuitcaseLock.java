package kofferslot.project.model;

public class SuitcaseLock {
    private static final char DEFAULT_FIRST_CHAR = 'A';
    private static final char DEFAULT_SECOND_CHAR = 'A';
    private static final char DEFAULT_NUMBER = 0;

    private char firstChar;
    private char secondChar;
    private int number;

    public SuitcaseLock() {
    }

    public SuitcaseLock(char firstChar, char secondChar, int number) {
    }

    /**
     * Instellen slotcombinatie van Kofferslot
     *
     * @param firstChar
     * @param secondChar
     * @param number
     */

    public void setCombination(char firstChar, char secondChar, int number) {
    }

    public char nextChar(char letter) {
        return 'A';
    }

    public int nextNumber(int cijfer) {
        return 0;
    }

    /**
     * Volgende slotcombinatie draait eerste cijfer verder.
     * Indien cijfer weer 0 wordt, ook tweede letter uit letterlijst verder draaien.
     * Indien tweede letter weer A wordt, ook eerste letter uit letterlijst verder draaien.
     */

    public void next() {
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
