package kofferslot.project.model;

public class Kofferslot {
    private static final char DEFAULT_EERSTE_CHAR = 'A';
    private static final char DEFAULT_TWEEDE_CHAR = 'A';
    private static final char DEFAULT_CIJFER = 0;

    private char eersteChar;
    private char tweedeChar;
    private int cijfer;

    public Kofferslot() {
    }

    public Kofferslot(char eersteChar, char tweedeChar, int cijfer) {
    }

    /**
     * Instellen slotcombinatie van Kofferslot
     *
     * @param eersteChar
     * @param tweedeChar
     * @param cijfer
     */

    public void setCombinatie(char eersteChar, char tweedeChar, int cijfer) {
    }

    public char volgendeLetter(char letter) {
        return 'A';
    }

    public int volgendeCijfer(int cijfer) {
        return 0;
    }

    /**
     * Volgende slotcombinatie draait eerste cijfer verder.
     * Indien cijfer weer 0 wordt, ook tweede letter uit letterlijst verder draaien.
     * Indien tweede letter weer A wordt, ook eerste letter uit letterlijst verder draaien.
     */

    public void volgende() {
    }

    public char getEersteChar() {
        return eersteChar;
    }

    public void setEersteChar(char eersteChar) {
        this.eersteChar = eersteChar;
    }

    public char getTweedeChar() {
        return tweedeChar;
    }

    public void setTweedeChar(char tweedeChar) {
        this.tweedeChar = tweedeChar;
    }

    public int getCijfer() {
        return cijfer;
    }

    public void setCijfer(int cijfer) {
        this.cijfer = cijfer;
    }
}
