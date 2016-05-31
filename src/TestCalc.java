/**
 * Created by Alex on 28.05.2016.
 */

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCalc {

    private Main calc;

    @BeforeTest
    public void setUp() {
        calc = new Main();
    }

    @Test(description = "1 test", enabled = true)
    public void testCalcDivision() {

        Assert.assertEquals(2.5, calc.getDivision(2d, 5d), "delenie 5/2 neverno");
    }

    @Test(description = "2test", enabled = true)
    public void testCalcDivisionOtricatelnih() {
        Assert.assertEquals(2.5, calc.getDivision(-2d, -5d), "delenie -5/-2 neverno");
    }

    @Test(description = "3test", enabled = true)
    public void testCalcDivisionOtricatelnogo() {
        Assert.assertEquals(-2.5, calc.getDivision(-2d, 5d), 0.5, "delenie 5/-2 neverno");
    }

    @Test(description = "4test", enabled = true)
    public void testCalcDivisionOtricatelnogo2() {
        Assert.assertEquals(-2.5, calc.getDivision(2d, -5d), "delenie -5/2 neverno");
    }

    @Test(description = "5test", enabled = true)
    public void testCalcDivisionNulya() {
        Assert.assertEquals(0, calc.getDivision(-5d, 0), 0.5, "delenie 0/-5 neverno");
    }

    @Test(description = "delenie double na 0", expectedExceptions = ArithmeticException.class, enabled = true)
    public void divisionWithException() {

        calc.getDivision(0, 5.5);
    }

    @Test(description = "delenie int na 0", expectedExceptions = ArithmeticException.class, enabled = true)
    public void divisionWithExceptionInt() {

        calc.getDivision(0, 5);
    }

    @Test(description = "8test", enabled = true)
    public void testCalcMultt() {
        double res = calc.getMult(5, 5);
        Assert.assertEquals(25, res, 0.3, "umnogenie 5*5 ne verno");
    }

    @Test(description = "9t", enabled = true)
    public void testCalcSubt() {

        double res = calc.getSub(5, 5);
        Assert.assertEquals(0, res, 0.3, "5-5 ne verno");
    }

    @Test(description = "10t", enabled = true)
    public void testCalcSumm() {

        double res = calc.getSumm(5, 5);
        Assert.assertEquals(10, res, 0.3, "5+5 ne verno");

    }

    @Test(description = "11test", enabled = true)
    public void testCalcMultt11() {
        double res = calc.getMult(0, 5);
        Assert.assertEquals(0, res, 0.3, "umnogenie 5*0 ne verno");
    }

    @Test(description = "12test", enabled = true)
    public void testCalcMultt12() {
        double res = calc.getMult(5, 0);
        Assert.assertEquals(0, res, 0.3, "umnogenie 0*5 ne verno");
    }

    @Test(description = "13test", enabled = true)
    public void testCalcMultt13() {
        double res = calc.getMult(0, 0);
        Assert.assertEquals(0, res, 0.3, "umnogenie 0*0 ne verno");
    }

    @Test(description = "14test", enabled = true)
    public void testCalcMultt14() {
        double res = calc.getMult(-5, 5);
        Assert.assertEquals(-25, res, 0.3, "umnogenie 5*(-5) ne verno");
    }

    @Test(description = "15test", enabled = true)
    public void testCalcMultt15() {
        double res = calc.getMult(5, -5);
        Assert.assertEquals(-25, res, 0.3, "umnogenie -5*5 ne verno");
    }

    @Test(description = "16test", enabled = true)
    public void testCalcMultt16() {
        double res = calc.getMult(0.5, 5);
        Assert.assertEquals(2.5, res, 0.3, "umnogenie 0.5*5 ne verno");
    }

    @Test(description = "17test", enabled = true)
    public void testCalcMultt17() {
        double res = calc.getMult(5, 0.5);
        Assert.assertEquals(2.5, res, 0.3, "umnogenie 5*0.5 ne verno");
    }

    @Test(description = "18test", enabled = true)
    public void testCalcMultt18() {
        double res = calc.getMult(0.5, 0.5);
        Assert.assertEquals(0.25, res, 0.01, "umnogenie 0.5*0.5 ne verno");
    }

    @Test(description = "19test", enabled = true)
    public void testCalcMultt19() {
        double res = calc.getMult(1.7e+308, 1);
        Assert.assertEquals(1.7e+308, res, 0.3, "umnogenie 1.7e+308*1 ne verno");
    }

    @Test(description = "20test", enabled = true)
    public void testCalcMultt20() {
        double res = calc.getMult(1.7e+308, 2);
    }

    @Test(description = "21t", enabled = true)
    public void testCalcSumm21() {

        double res = calc.getSumm(5, 0);
        Assert.assertEquals(5, res, 0.3, "5+0 ne verno");

    }

    @Test(description = "22t", enabled = true)
    public void testCalcSumm22() {

        double res = calc.getSumm(0, 5);
        Assert.assertEquals(5, res, 0.3, "0+5 ne verno");

    }

    @Test(description = "23t", enabled = true)
    public void testCalcSumm23() {

        double res = calc.getSumm(1.7e+308, 5);

    }
    @Test(description = "24t", enabled = true)
    public void testCalcSumm24() {

        double res = calc.getSumm(-6, 5);
        Assert.assertEquals(-1, res, 0.3, "-6+5 ne verno");

    }
    @Test(description = "25t", enabled = true)
    public void testCalcSub25() {

        double res = calc.getSub(5, 6);
        Assert.assertEquals(-1, res, 0.3, "5-6 ne verno");
    }
    @Test(description = "26t", enabled = true)
    public void testCalcSub26() {

        double res = calc.getSub(-5, 6);
        Assert.assertEquals(-11, res, 0.3, "-5-6 ne verno");
    }
    @Test(description = "27t", enabled = true)
    public void testCalcSub27() {

        double res = calc.getSub(-5, -6);
        Assert.assertEquals(1, res, 0.3, "-5-(-6) ne verno");
    }
    @Test(description = "28t", enabled = true)
    public void testCalcSub28() {

        double res = calc.getSub(-4.9e-324, 6);
        //"(-4.9e-324)-6"
    }
    @Test(description = "29t", enabled = true)
    public void testCalcSub29() {

        double res = calc.getSub(1,0.1);
        Assert.assertEquals(0.9, res, 0.001, "1-0.1 ne verno");
    }
    @Test(description = "30t", enabled = true)
    public void testCalcSub30() {

        double res = calc.getSub(0.1, 1);
        Assert.assertEquals(-0.9, res, 0.3, "0.1-1) ne verno");
    }

    @Test(description = "31t", enabled = true)
    public void testCalcSub31() {

        double res = calc.getSub(5, 0);
        Assert.assertEquals(5, res, 0.3, "5-0 ne verno");
    }

    @Test(description = "32t", enabled = true)
    public void testCalcSub32() {

        double res = calc.getSub(0, 5);
        Assert.assertEquals(-5, res, 0.3, "0-5 ne verno");
    }

    @Test(description = "33t", enabled = true)
    public void testCalcSub33() {

        double res = calc.getSub(0, 0);
        Assert.assertEquals(0, res, 0.3, "0-0 ne verno");
    }
    @Test(description = "34t", enabled = true)
    public void testCalcSub34() {

        double res = calc.getSub(6, 5);
        Assert.assertEquals(1, res, 0.3, "6-5 ne verno");
    }
    @Test(description = "35t", enabled = true)
    public void testCalcSub35() {

        double res = calc.getSub(1,-(1.7e+308));
        //1-(-1.7e+308)
    }
    @Test(description = "36t", enabled = true)
    public void testCalcSumm36() {

        double res = calc.getSumm(0,0);
        Assert.assertEquals(0, res, 0.3, "0+0 ne verno");

    }

    @Test(description = "37t", enabled = true)
    public void testCalcSumm37() {

        double res = calc.getSumm(0,0.2);
        Assert.assertEquals(0.2, res, 0.003, "0.2+0 ne verno");

    }

    @Test(description = "38t", enabled = true)
    public void testCalcSumm38() {

        double res = calc.getSumm(-5,-5);
        Assert.assertEquals(-10, res, 0.003, "-5+(-5) ne verno");

    }
    @Test(description = "39t", enabled = true)
    public void testCalcSumm39() {

        double res = calc.getSumm(0,-1);
        Assert.assertEquals(-1, res, 0.003, "0+(-1) ne verno");

    }

    @Test(description = "40t", enabled = true)
    public void testCalcSumm40() {

        double res = calc.getSumm(0.5,0.5);
        Assert.assertEquals(1, res, 0.003, "0.5+0.5 ne verno");

    }
    @Test(description = "41t", enabled = true)
    public void testCalcSumm41() {

        double res = calc.getSumm(-4.9e-324,-0.5);
        //-4.9e-324-0.5

    }
    @Test(description = "delenie double 0 na 0", expectedExceptions = ArithmeticException.class, enabled = true)
    public void divisionWithException42() {

        calc.getDivision(0, 0);
    }
    @Test(description = "43test", enabled = true)
    public void testCalcDivision43() {
        double res = calc.getDivision(0.5,1);
        Assert.assertEquals(2,res , 0.5, "delenie 1/0.5 neverno");
    }
    @Test(description = "44test", enabled = true)
    public void testCalcDivision44() {
        double res = calc.getDivision(0.5,1.7e+308);
        //"delenie max/0.5 neverno"
    }
    @Test(description = "45test", enabled = true)
    public void testCalcDivision45() {
        double res = calc.getDivision(-4.9e-324,1);
        //"delenie 1/min neverno"
    }
    @Test(description = "46test", enabled = true)
    public void testCalcDivision46() {
        double res = calc.getDivision(0.5,0.5);
        Assert.assertEquals(1,res , 0.001, "delenie 0.5/0.5 neverno");
    }
    @Test(description = "47test", enabled = true)
    public void testCalcDivision47() {
        double res = calc.getDivision(5,5);
        Assert.assertEquals(1,res , 0.001, "delenie 5/5 neverno");
    }
    @Test(description = "48test", enabled = true)
    public void testCalcMultt48() {
        double res = calc.getMult(-5, -5);
        Assert.assertEquals(25, res, 0.3, "umnogenie -5*(-5_ ne verno");
    }
    @Test(description = "49test", enabled = true)
    public void testCalcMultt49() {
        double res = calc.getMult(-0.5, -0.5);
        Assert.assertEquals(0.25, res, 0.3, "umnogenie -0.5*(-0.5) ne verno");
    }
    @Test(description = "50test", enabled = true)
    public void testCalcMultt50() {
        double res = calc.getMult(1.7e+308, 1.7e+308);
       //max*max
    }
}
