import org.openqa.selenium.By;

/**
 * Created by Sudhakar on 03/07/2016.
 */
public class submit extends Basemain  {
    public verifyAC sub(){

        driver.findElement(By.xpath("//*[@id='form-validate']/div/button[2]")).click();
        System.out.println("this page click on submit kkkkkkkkkkkkkkkkkkk");
return new verifyAC();
}
}