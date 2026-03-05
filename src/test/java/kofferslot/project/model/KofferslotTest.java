package kofferslot.project.model;


import org.junit.Assert;
import org.junit.Test;

public class KofferslotTest {

    @Test
    public void gegevenCombinatieIsGoedIngesteldEnTeZienViaGetters() {
        var kofferslot = new Kofferslot('A', 'C',5);

        Assert.assertEquals('A', kofferslot.getEersteLetter());
        Assert.assertEquals('C', kofferslot.getTweedeLetter());
        Assert.assertEquals(5, kofferslot.getCijfer());
    }

    @Test
    public void instellenVanEenNieuweCombinatie(){
        var kofferslot = new Kofferslot('A', 'C',5);

        kofferslot.setCombinatie('B','B', 7);

        Assert.assertEquals('B', kofferslot.getEersteLetter());
        Assert.assertEquals('B', kofferslot.getTweedeLetter());
        Assert.assertEquals(7, kofferslot.getCijfer());
    }

    @Test
    public void volgendeLetter(){
        var kofferslot = new Kofferslot('A', 'C',5);

        Assert.assertEquals('Y', kofferslot.volgendeLetter('X'));
        Assert.assertEquals('A', kofferslot.volgendeLetter('Z'));
    }

    @Test
    public void volgendeCijfer(){
        var kofferslot = new Kofferslot('A', 'C',5);

        Assert.assertEquals(5, kofferslot.volgendeCijfer(4));
        Assert.assertEquals(0, kofferslot.volgendeCijfer(9));
    }

    @Test
    public void volgendeMetAlleenEenNieuwCijfer(){
        var kofferslot = new Kofferslot('A', 'C',5);
        kofferslot.volgende();

        Assert.assertEquals('A', kofferslot.getEersteLetter());
        Assert.assertEquals('C', kofferslot.getTweedeLetter());
        Assert.assertEquals(6, kofferslot.getCijfer());
    }

    @Test
    public void volgendeMetNieuweLetterEnCijfer() {
        var kofferslot = new Kofferslot('A', 'C',9);
        kofferslot.volgende();

        Assert.assertEquals('A', kofferslot.getEersteLetter());
        Assert.assertEquals('D', kofferslot.getTweedeLetter());
        Assert.assertEquals(0, kofferslot.getCijfer());
    }

    @Test
    public void volgendeMetTweeNieuweLettersEnCijfer() {
        var kofferslot = new Kofferslot('A', 'Z',9);
        kofferslot.volgende();

        Assert.assertEquals('B', kofferslot.getEersteLetter());
        Assert.assertEquals('A', kofferslot.getTweedeLetter());
        Assert.assertEquals(0, kofferslot.getCijfer());
    }
}