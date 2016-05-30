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

    @Test(description = "2test", enabled = true)
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

    @Test(description = "5test", enabled = true)
    public void testCalcMultt() {
        double res = calc.getMult(5, 5);
        Assert.assertEquals(25, res, 0.3, "umnogenie 5*5 ne verno");
    }

    @Test(description = "6t", enabled = true)
    public void testCalcSubt() {

        double res = calc.getSub(5, 5);
        Assert.assertEquals(0, res, 0.3, "5-5 проводится не правильно");
    }

    @Test(description = "7t", enabled = true)
    public void testCalcSumm() {

        double res = calc.getSumm(5, 5);
        Assert.assertEquals(10, res, 0.3, "5+5 проводится не правильно");

    }
    @Test(description = "delenie int na 0", expectedExceptions = ArithmeticException.class, enabled = true)
    public void divisionWithExceptionInt() {

        calc.getDivision(0,"");
    }





}
