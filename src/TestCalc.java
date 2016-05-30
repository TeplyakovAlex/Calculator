/**
 * Created by Alex on 28.05.2016.
 */
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCalc  {

    private Main calc;

    @BeforeTest
    public void setUp(){
        calc = new Main();
    }

    @Test(description = "First test of page constructor",enabled =true )
    public void testCalcDivision(){

        Assert.assertEquals(2.5,calc.getDivision(5,2),"delenie 5/2 neverno");
    }
    @Test(expectedExceptions = ArithmeticException.class)
    public void divisionWithException() {
        calc.getDivision(5,0);
    }
    @Test(description = "First test of page constructor",enabled =true )
    public void testCalcMultt(){
        int res= calc.getMult(5,5);
        Assert.assertEquals(25, res, "умножение проводится не правильно");
    }
    @Test(description = "First test of page constructor",enabled =true )
    public void testCalcSubt() {

        int res = calc.getSub(5, 5);
        Assert.assertEquals(0,res,"вычитание проводится не правильно");
    }

    @Test(description = "First test of page constructor",enabled =true )
    public void testCalcSumm() {

        int res= calc.getSumm(5,5);
        Assert.assertEquals(10,res,"сложение проводится не правильно");

    }
}
