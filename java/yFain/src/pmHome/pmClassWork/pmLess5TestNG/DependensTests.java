package pmHome.pmClassWork.pmLess5TestNG;


import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by serega on 09/12/15.
 */
public class DependensTests {

    @Test
    public void method1(){
        System.out.println("this is method 1");
        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods = {"method1"})
    public void method2(){
        System.out.println("This is method 2");
    }
}
