package drivers;

public class WebDriverTest {
    public static void main(String[] args) {

        DriverType[] driverTypes = DriverType.values();
        for (int i = 0; i< driverTypes.length; i++) {
            System.out.println(driverTypes[i].name);
            System.out.println(driverTypes[i].path);
        }

        // tu można wpisac firefox albo chrome i robi pokolei zadane rzeczy
        WebDriver driver = getDriver(DriverType.CHROME);
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

    private static WebDriver getDriver(DriverType type)  {
        if(type.name.equals("chrome")) {
            System.out.println(type.path);
            return new ChromeDriver();
        }
        System.out.println(type.path);
            return new FirefoxDriver();
        }
}
