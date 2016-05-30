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
        System.out.println(calc.getDivision(2d,5d));
        Assert.assertEquals(2.5,calc.getDivision(2d,5d),"delenie 5/2 neverno");
    }

    //@Test(description = "First test of page constructor",enabled =true )
    @Test(expectedExceptions = ArithmeticException.class,enabled =true)
    //@Test(description = "First test of page constructor",enabled =true )
       public void divisionWithException() {
      //calc.getDivision(0,5);
       System.out.println(calc.getDivision(0,5));
        Assert.assertEquals(calc.getDivision(0,5),null);
    }
    @Test(description = "First test of page constructor",enabled =true )
    public void testCalcMultt(){
        int res= calc.getMult(5,5);
        Assert.assertEquals(25, res, "umnogenie 5*5 ne verno");
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
