package fishtank.qa.nuscale.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import fishtank.qa.nuscale.constants.AppConstants;
import fishtank.qa.nuscale.utils.ElementUtil;


public class LandingPage {

private WebDriver driver;
private ElementUtil eleUtil;

// 1. By Locator Standard Hero

//private By titleHeroBanner = By.xpath("//h1[@class='heading']");
//private By bodyHeroBanner = By.xpath("//p[contains(text(),'Milliman works with clients')]");

// By Locator Two Column Text

//private By twoColumnTextTitle = By.xpath("(//h3[@class='h2 heading'])[1]");
//private By twoColumnTextDesc =  By.xpath("//div[@class='col-12 col-lg-5 heading-container']");
//private By twoColumnTextImage = By.xpath("(//h3[@class='h2 heading'])[1]");

//1. By Locator

public static final By bcolor = By.xpath("//div[@class='banner bg-cover bg-blend-multiply bg-no-repeat relative text-white w-full min-h-[550px] bg-blue-900 undefined undefined']");

public static final By img = By.xpath("//img[@class='pb-6']");

public static final By heading = By.xpath("//h1[@class='relative font-black text-6xl lg:text-7xl z-10 pb-10 lg:w-1/2 leading-tight']");

public static final By whiteBar = By.xpath("//div[@class='w-[250px] lg:w-[300px] h-[8px] mb-1 bg-white']");

public static final By bar = By.xpath("//div[@class='w-[170px] lg:w-[200px] h-[8px] mb-10 bg-white opacity-75']"); 

public static final By description = By.xpath("//div[@class='text-2xl lg:text-3xl lg:w-[78%] text-white']");

// 2. page constructor

public LandingPage(WebDriver driver) {
this.driver = driver;
eleUtil = new ElementUtil(driver);

}

// 3. page actions

// Get Page Title
public String getPageTitle() {
String title = eleUtil.waitForTitleToBe(AppConstants.LANDING_PAGE_TITLE, AppConstants.SMALL_DEFAULT_TIME_OUT);
System.out.println("Page Title is " + title);
return title;
}

// Get Page URL
public String getPageUrl() {
String url = eleUtil.waitForUrl(AppConstants.SMALL_DEFAULT_TIME_OUT, AppConstants.LANDING_PAGE_URL);
System.out.println("Home Page URL is: " + url);
return url;
}

// Get CSS value

/* This method used to verify background color */
public String getBackColor(By locator ) {
String color = eleUtil.getElemementBackColor(locator);
return color;
}

/* This method used to verify color code */
public String getColor(By locator ) {
String color = eleUtil.getElemementColor(locator);
return color;
}

/* This method used to verify font family */
public String getFontfamily(By locator) {
String fontFamily = eleUtil.getElemementFontfamily(locator);
return fontFamily;
}

/* This method used to verify font size */
public String getFontSize(By locator) {
return  eleUtil.getElemementFontSize(locator);
}

/* This method used to verify img height */
public String getImgHeight(By locator) {
return  eleUtil.getElemementImgHeight(locator);
}

/* This method used to verify img width */
public String getImgWidth(By locator) {
return  eleUtil.getElemementImgWidth(locator);
}

/* This method used to verify padding-bottom */
public String getPaddingBottom(By locator) {
return  eleUtil.getElemementPaddingBottom(locator);
}

/* This method used to verify padding-bottom */
public String getOpacity(By locator) {
return  eleUtil.getElemementOpacity(locator);
}

/* This method used to verify height */
public String getHeight(By locator) {
String height = eleUtil.getElemementheight(locator);
return height;
}

/*public  String  getTextTheWorkMatters() {
String text = eleUtil.getElement(titleHeroBanner).getText();
return text;
}

public String getFractionText() {

String fractionText = eleUtil.getElement(bodyHeroBanner).getText();
return fractionText;

}
This method used to verify font size
public String getFontSizeTitleTCT()
{
String fontSize = eleUtil.getElemementFontSize(twoColumnTextTitle);
return fontSize;
}

public String getFontSizeDescTCT()
{
String fontSize = eleUtil.getElemementFontSize(twoColumnTextDesc);
return fontSize;
}*/

}