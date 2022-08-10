package drivers;

public class WebDriverTest {
    public static void main(String[] args) throws NoValidBrowserName {

        // tu można wpisac firefox albo chrome i robi pokolei zadane rzeczy
        WebDriver driver = getDriver("chrome");
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();


        /* FirefoxDriver firefox = new FirefoxDriver();
        firefox.get();
        firefox.findElementBy();
        firefox.findElementBy();
        firefox.findElementBy();
        firefox.findElementBy();
        firefox.findElementBy();
        firefox.findElementBy();*/
    }

    private static WebDriver getDriver(String name) throws NoValidBrowserName {
        if(name.equals("chrome")) {
            return new ChromeDriver();
        } else if (name.equals("firefox")) {
            return new FirefoxDriver();
        }
        throw new NoValidBrowserName("no valid browser name. ");


    }
}
