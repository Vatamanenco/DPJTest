package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;

public class Tests {
    @BeforeClass
    public static void SetupClass()
    {
        WebDriverManager.chromedriver().setup();;
    }
}