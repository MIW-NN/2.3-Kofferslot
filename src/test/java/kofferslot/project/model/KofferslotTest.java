package kofferslot.project.model;


import org.junit.Assert;
import org.junit.Test;

public class KofferslotTest {

    @Test
    public void givenLockerWithCombination_combinationIsSet() {
        var suitcaseLocker = new Kofferslot('A', 'C',5);

        Assert.assertEquals('A', suitcaseLocker.getEersteLetter());
        Assert.assertEquals('C', suitcaseLocker.getTweedeLetter());
        Assert.assertEquals(5, suitcaseLocker.getCijfer());
    }

    @Test
    public void whenSettingCombination_newCombinationIsSet(){
        var suitcaseLocker = new Kofferslot('A', 'C',5);

        suitcaseLocker.setCombinatie('B','B', 7);

        Assert.assertEquals('B', suitcaseLocker.getEersteLetter());
        Assert.assertEquals('B', suitcaseLocker.getTweedeLetter());
        Assert.assertEquals(7, suitcaseLocker.getCijfer());
    }

    @Test
    public void whenAskingForNextChar_getNextChar(){
        var suitcaseLocker = new Kofferslot('A', 'C',5);

        Assert.assertEquals('Y', suitcaseLocker.volgendeLetter('X'));
        Assert.assertEquals('A', suitcaseLocker.volgendeLetter('Z'));
    }

    @Test
    public void whenAskingForNextNumber_getNextNumber(){
        var suitcaseLocker = new Kofferslot('A', 'C',5);

        Assert.assertEquals(5, suitcaseLocker.volgendeCijfer(4));
        Assert.assertEquals(0, suitcaseLocker.volgendeCijfer(9));
    }

    @Test
    public void whenSettingNext_withNumberBelow9_expectToUpNumberOnly(){
        var suitcaseLocker = new Kofferslot('A', 'C',5);
        suitcaseLocker.volgende();

        Assert.assertEquals('A', suitcaseLocker.getEersteLetter());
        Assert.assertEquals('C', suitcaseLocker.getTweedeLetter());
        Assert.assertEquals(6, suitcaseLocker.getCijfer());
    }

    @Test
    public void whenSettingNext_withNumberAt9AndSecondCharNotAtZ_expectToUpNumberAndSecondChar() {
        var suitcaseLocker = new Kofferslot('A', 'C',9);
        suitcaseLocker.volgende();

        Assert.assertEquals('A', suitcaseLocker.getEersteLetter());
        Assert.assertEquals('D', suitcaseLocker.getTweedeLetter());
        Assert.assertEquals(0, suitcaseLocker.getCijfer());
    }

    @Test
    public void whenSettingNext_withNumberAt9AndSecondCharAtZ_expectToUpAll() {
        var suitcaseLocker = new Kofferslot('A', 'Z',9);
        suitcaseLocker.volgende();

        Assert.assertEquals('B', suitcaseLocker.getEersteLetter());
        Assert.assertEquals('A', suitcaseLocker.getTweedeLetter());
        Assert.assertEquals(0, suitcaseLocker.getCijfer());
    }
}
