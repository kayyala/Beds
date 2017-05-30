

import cucumber.api.java.Before;
import org.junit.After;

import java.io.IOException;

/**
 * Created by Sudhakar on 15/06/2016.
 */
public class Hooks {
    Basemain base = new Basemain();
    @Before
    public  void setUp() throws IOException {
        base.openBrowser();
    }
    //@After
    public  void tearDown()
    {
        base.closeBrowser();
    }
}
