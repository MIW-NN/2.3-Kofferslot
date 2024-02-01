package kofferslot.project.model;


import org.junit.Assert;
import org.junit.Test;

public class SuitcaseLockTest {

    @Test
    public void givenLockerWithCombination_combinationIsSet() {
        var suitcaseLocker = new SuitcaseLock('A', 'C',5);

        Assert.assertEquals('A', suitcaseLocker.getFirstChar());
        Assert.assertEquals('C', suitcaseLocker.getSecondChar());
        Assert.assertEquals(5, suitcaseLocker.getNumber());
    }

    @Test
    public void whenSettingCombination_newCombinationIsSet(){
        var suitcaseLocker = new SuitcaseLock('A', 'C',5);

        suitcaseLocker.setCombination('B','B', 7);

        Assert.assertEquals('B', suitcaseLocker.getFirstChar());
        Assert.assertEquals('B', suitcaseLocker.getSecondChar());
        Assert.assertEquals(7, suitcaseLocker.getNumber());
    }

    @Test
    public void whenAskingForNextChar_getNextChar(){
        var suitcaseLocker = new SuitcaseLock('A', 'C',5);

        Assert.assertEquals('Y', suitcaseLocker.nextChar('X'));
        Assert.assertEquals('A', suitcaseLocker.nextChar('Z'));
    }

    @Test
    public void whenAskingForNextNumber_getNextNumber(){
        var suitcaseLocker = new SuitcaseLock('A', 'C',5);

        Assert.assertEquals(5, suitcaseLocker.nextNumber(4));
        Assert.assertEquals(0, suitcaseLocker.nextNumber(9));
    }

    @Test
    public void whenSettingNext_withNumberBelow9_expectToUpNumberOnly(){
        var suitcaseLocker = new SuitcaseLock('A', 'C',5);
        suitcaseLocker.next();

        Assert.assertEquals('A', suitcaseLocker.getFirstChar());
        Assert.assertEquals('C', suitcaseLocker.getSecondChar());
        Assert.assertEquals(6, suitcaseLocker.getNumber());
    }

    @Test
    public void whenSettingNext_withNumberAt9AndSecondCharNotAtZ_expectToUpNumberAndSecondChar() {
        var suitcaseLocker = new SuitcaseLock('A', 'C',9);
        suitcaseLocker.next();

        Assert.assertEquals('A', suitcaseLocker.getFirstChar());
        Assert.assertEquals('D', suitcaseLocker.getSecondChar());
        Assert.assertEquals(0, suitcaseLocker.getNumber());
    }

    @Test
    public void whenSettingNext_withNumberAt9AndSecondCharAtZ_expectToUpAll() {
        var suitcaseLocker = new SuitcaseLock('A', 'Z',9);
        suitcaseLocker.next();

        Assert.assertEquals('B', suitcaseLocker.getFirstChar());
        Assert.assertEquals('A', suitcaseLocker.getSecondChar());
        Assert.assertEquals(0, suitcaseLocker.getNumber());
    }
}