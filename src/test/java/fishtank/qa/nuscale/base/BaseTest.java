package fishtank.qa.nuscale.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import fishtank.qa.nuscale.factory.DriverFactory;
import fishtank.qa.nuscale.pages.LandingPage;

public class BaseTest {

public WebDriver driver;
public Properties prop;

public DriverFactory df;
public LandingPage landingpage;

@BeforeTest
public void setup() {
df = new DriverFactory();
prop = df.initProp();
driver = df.initDriver(prop);
landingpage = new LandingPage (driver);

}

@AfterTest
public void tearDown() {
driver.quit();
}

}
