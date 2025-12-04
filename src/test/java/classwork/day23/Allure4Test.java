package classwork.day23;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyTestngListener.class)
public class Allure4Test {

    @Test(description = "158076")
    public void test1() {
        Assert.assertTrue(true);
    }

    @Test(description = "158077")
    public void test2() {
        Assert.assertTrue(true);
    }


    @Test(description = "158078")
    public void test3() {
        Assert.assertTrue(true);
    }


    @Test(description = "158081")
    public void test4() {
        Assert.assertTrue(false);
    }


}
