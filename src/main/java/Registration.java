import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sudhakar on 26/06/2016.
 */
public class Registration extends Basemain {
    public String randomEmail(int length) {
        String allowedChars = "abcdefghijklmnopqrstuvwxyz1234567890";
        String emaill = "";
        String temp = RandomStringUtils.random(length, allowedChars);
        emaill = temp.substring(0, temp.length() - 9) + "@gmail.com";
        return emaill;

    }

    public submit Enterfields() {


        System.out.println("this is entering fields.......");
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

        new Select(driver.findElement(By.xpath("//*[@id='prefix']"))).selectByValue("Mr");
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("rameshygjhk");
        driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("tree");
        driver.findElement(By.xpath("//*[@id='email_address']")).sendKeys(randomEmail(15));
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("kayyala1987");
        driver.findElement(By.xpath("//*[@id='confirmation']")).sendKeys("kayyala1987");
        return new submit();

    }


}

