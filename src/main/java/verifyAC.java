import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sudhakar on 03/07/2016.
 */
public class verifyAC  extends Basemain{
    public Logout checkpoint(){
//        System.out.println();
//        System.out.println("message");
//        String expected = "message";
//        String actual = driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div/ul/li/ul/li/span")).getText();
//
//        Assert.
//        System.out.println("account as been successfull....".getClass());

       // Assert.assertTrue("Checking the welcome message shown ",driver.findElement(By.tagName("body")).getText().contains("apples"));

       // Assert.assertTrue("User register in successfully? ", driver.getTitle().trim().equals("https://www.dreams.co.uk/customer/account/index/"));
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
//        Assert.assertTrue("Chacking Thank you for registering with Dreams "
//                ,driver.findElement(By.tagName("body")).getText().contains("Thank you for registering with Dreams"));
        String actual_value=driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div/div[1]/h2")).getText();
        //String expected_value="My Account";
        //Assert.assertEquals(actual_value,expected_value);
//        Assert.assertTrue(actual_value.contains("kello,")); //NOT BEEN VERIFY ACOUNT

        Assert.assertTrue(actual_value.contains("Hello,"));// ITS AS BEEN VERIFY ACOUNT

        System.out.println("acount as been succesfull");




        System.out.println("this AC verify succes..@@@@@@@@".getClass());
        return new Logout();
    }
}
