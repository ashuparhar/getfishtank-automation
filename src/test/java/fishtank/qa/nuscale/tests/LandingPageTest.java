package fishtank.qa.nuscale.tests;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import fishtank.qa.nuscale.base.BaseTest;
import fishtank.qa.nuscale.constants.AppConstants;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic("Epic: Automation Testing on Story Book components")
@Story("Story #1234: Test Text Banner component")

public class LandingPageTest extends BaseTest {


@Test
@Description("TC_01: Verify Page Title")
@Severity(SeverityLevel.NORMAL)
public void homePageTitleTest() {
	String actTitle = landingpage.getPageTitle();
	Assert.assertEquals(actTitle, AppConstants.LANDING_PAGE_TITLE);
}

@Test
@Description("TC_02: Verify Page URL")
@Severity(SeverityLevel.NORMAL)
public void pageUrlTest() {
	String actUrl = landingpage.getPageUrl();
	Assert.assertEquals(actUrl, AppConstants.LANDING_PAGE_URL);
}

@Test
@Description("TC_03: Verify CSS properties of Text Banner")
@Severity(SeverityLevel.CRITICAL)
public void getCssValueTextBanner() throws InterruptedException
{
	driver.switchTo().frame(driver.findElement(By.id("storybook-preview-iframe")));
	
    Thread.sleep(3000);
	
	System.out.println("***** CSS Properties values for Text Banner *****");
	
	String actBackColor = landingpage.getBackColor(landingpage.bcolor);	
	
	for(int i=0; i<=AppConstants.expBackColorList.length;i++)
	{
		if(!actBackColor.equals(AppConstants.expBackColorList[i]))
		{
			continue;
		}
		else
		{
			System.out.println("Background Color of Component : " + actBackColor );
			break;
		}
	}
	
	if (driver.findElement(By.tagName("img")).isDisplayed())
	{
		System.out.println("Logo displayed");
		String actImgHeight = landingpage.getImgHeight(landingpage.img);
		Assert.assertEquals(actImgHeight, AppConstants.expImgHeight);
		System.out.println("Logo height : " + actImgHeight );
		
		String actImgWidth = landingpage.getImgWidth(landingpage.img);
		Assert.assertEquals(actImgWidth, AppConstants.expImgWidth);
		System.out.println("Logo width : " + actImgWidth );
		
		String actBottomPaddingImg = landingpage.getPaddingBottom(landingpage.img);
		Assert.assertEquals(actBottomPaddingImg, AppConstants.expBottomPaddingImg);
		System.out.println("Bottom Padding on logo : " + actBottomPaddingImg );
	}

	String actFontSizeHeading = landingpage.getFontSize(landingpage.heading);
	Assert.assertEquals(actFontSizeHeading, AppConstants.expFontSizeHeading);
	System.out.println("Font Size of Heading : " + actFontSizeHeading );

	String actFontFamilyHeading = landingpage.getFontfamily(landingpage.heading);
	Assert.assertEquals(actFontFamilyHeading, AppConstants.expFontFamilyHeading);
	System.out.println("Font Family of Heading : " + actFontFamilyHeading );
	
	String actBottomPaddingHeading = landingpage.getPaddingBottom(landingpage.heading);
	Assert.assertEquals(actBottomPaddingHeading, AppConstants.expBottomPaddingHeading);
	System.out.println("Bottom Padding on Heading : " + actBottomPaddingHeading );
	
	String actFontColorHeading = landingpage.getColor(landingpage.heading);
	Assert.assertEquals(actFontColorHeading, AppConstants.expFontColorHeading);
	System.out.println("Font Color of Heading : " + actFontColorHeading );
	
	String actFontColorWhiteBar = landingpage.getColor(landingpage.whiteBar);
	Assert.assertEquals(actFontColorWhiteBar, AppConstants.expFontColorWhiteBar);
	String actFontColorBar = landingpage.getColor(landingpage.bar);
	Assert.assertEquals(actFontColorBar, AppConstants.expFontColorBar);
	
	String actOpacityBar = landingpage.getOpacity(landingpage.bar);
	Assert.assertEquals(actOpacityBar, AppConstants.expOpacityBar);
	
	String actFontSizeDesc = landingpage.getFontSize(landingpage.description);
	Assert.assertEquals(actFontSizeDesc, AppConstants.expFontSizeDesc);
	System.out.println("Font Size of Desc : " + actFontSizeDesc );

	String actFontFamilyDesc = landingpage.getFontfamily(landingpage.description);
	Assert.assertEquals(actFontFamilyDesc, AppConstants.expFontFamilyDesc);
	System.out.println("Font Family of Desc : " + actFontFamilyDesc );
	
	String actFontColorDesc = landingpage.getColor(landingpage.description);
	Assert.assertEquals(actFontColorDesc, AppConstants.expFontColorDesc);
	System.out.println("Font Color of Desc : " + actFontColorDesc );
}
}