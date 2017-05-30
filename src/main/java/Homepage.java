import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sudhakar on 15/06/2016.
 */
public class Homepage extends Basemain

{

    public String isOnHomePage()


    {

        return driver.getCurrentUrl();
    }

    public Registration Myacount() {
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        driver.findElement(By.xpath("html/body/div[2]/div[1]/header/div[2]/div[2]/div/div[2]/span/a[2]")).click();
        System.out.println(" open registration page..................");

        // driver.findElement(By.xpath("html/body/div[3]/div[2]/header/div[1]/div[6]/div[2]/div/ul/li[4]/a")).click();
        //driver.findElement(By.xpath("html/body/div[3]/div/header/div[1]/div[6]/div[2]/div/ul/li[4]/a")).click();
        return new Registration();
    }
}

