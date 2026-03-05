package kofferslot.project.model;

public class Kofferslot {
    private static final char DEFAULT_EERSTE_LETTER = 'A';
    private static final char DEFAULT_TWEEDE_LETTER = 'A';
    private static final char DEFAULT_CIJFER = 0;

    private char eersteLetter;
    private char tweedeLetter;
    private int cijfer;

    public Kofferslot() {
    }

    public Kofferslot(char eersteLetter, char tweedeLetter, int cijfer) {
    }

    /**
     * Instellen slotcombinatie van Kofferslot
     *
     * @param eersteLetter
     * @param tweedeLetter
     * @param cijfer
     */

    public void setCombinatie(char eersteLetter, char tweedeLetter, int cijfer) {
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

    public char getEersteLetter() {
        return eersteLetter;
    }

    public void setEersteLetter(char eersteLetter) {
        this.eersteLetter = eersteLetter;
    }

    public char getTweedeLetter() {
        return tweedeLetter;
    }

    public void setTweedeLetter(char tweedeLetter) {
        this.tweedeLetter = tweedeLetter;
    }

    public int getCijfer() {
        return cijfer;
    }

    public void setCijfer(int cijfer) {
        this.cijfer = cijfer;
    }
}
