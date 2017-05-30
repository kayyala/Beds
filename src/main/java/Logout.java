import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sudhakar on 03/07/2016.
 */
public class Logout extends Basemain{
    public void  logoutsuccessfull(){
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
        System.out.println("myac logouttttttttt");
        driver.findElement(By.xpath("//*[@id='customer-account-links-dropdown']")).click();
        driver.findElement(By.xpath("html/body/div[2]/div[1]/header/div[2]/div[2]/div/div[2]/div/ul/li[4]/a")).click();

//        driver.findElement(By.xpath("html/body/div[3]/div[2]/header/div[1]/div[6]/div[2]/span")).click();
//        driver.findElement(By.xpath("html/body/div[3]/div[2]/header/div[1]/div[6]/div[2]/div/ul/li[4]/a")).click();
        System.out.println("my account logout successfully");
        driver.close();
    }
}
