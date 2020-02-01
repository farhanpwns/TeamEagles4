package home;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class HomePageItems extends CommonAPI {

    @FindBy(name = "SearchText")
    public static WebElement searchBox;
    @FindBy(partialLinkText = "Sign In")
    public static WebElement signInButton;
    @FindBy(partialLinkText = "Get the App")
    public static WebElement getTheAppLink;
    @FindBy(partialLinkText = "One Request")
    public static WebElement oneRequestButton;
    @FindBy(partialLinkText = "Favorites")
    public static WebElement favoriteLink;
    @FindBy(xpath = "//div[@id=\"J_SC_header\"]/header/div[2]/div[1]/div/div/h3")
    public static WebElement categories;
    @FindBy(partialLinkText = "Machinery")
    public static WebElement greetingsToAccountHolder;
    @FindBy(partialLinkText = "My Alibaba")
    public static WebElement myAlibaba;
    @FindBy(css = ".J-search-text")
    public static WebElement emailBoxToSubscribeForTradeAlert;
    @FindBy(css = ".J-btn-search")
    public static WebElement tradeAlertSubscriptionButton;
    @FindBy(xpath = "//*[@id=\"ui-footer\"]//div[1]/dl/dd[1]/a")
    public static WebElement helpCenterLink;
    @FindBy(xpath = "//*[@id=\"J_SC_header\"]/header/div[2]/div[1]/div[1]/a")
    public static WebElement verificationPointHelpCenter;
    @FindBy(xpath = "//dd/a[contains (text(), 'About Alibaba.com')]")
    public static WebElement aboutAlibabaLink;
    @FindBy(xpath = "//h2[contains (text(), 'About Alibaba.com')]")
    public static WebElement verificationPointAboutAlibaba;
    @FindBy(xpath = "//dd/a[contains (text(),'Wholesaler Market')]")
    public static WebElement wholesalerMarket;
    @FindBy(linkText = "Wholesaler Market")
    public static WebElement vaerificationPointAWholesaleMarket;
    @FindBy(xpath = "/html/body/div[5]/div/div/i")
    public static WebElement moveToTopButton;
    @FindBy(xpath = "//input[@name='rfqName']")
    public static WebElement productNameForQuotes;
    @FindBy(xpath = "//input[@name='quantity']")
    public static WebElement quantity;
    @FindBy(xpath = "//form/div[3]/div")
    public static WebElement clickUnit;

    public String searchProduct() {
        String url = driver.getCurrentUrl();
        System.out.println("Home Page title: " + driver.getTitle());
        searchBox.sendKeys("I phone", Keys.ENTER);
        String title = driver.getTitle();
        System.out.println("Get Product Search Page Title: " + title);
        return title;
    }

    public void clickSignIn() throws InterruptedException {
        sleepFor(4);
        signInButton.click();
    }

    public String hoverOverMyAccount() {
        driver.navigate();
        Actions act = new Actions(driver);
        act.moveToElement(myAlibaba).build().perform();
        String actuaMessage = greetingsToAccountHolder.getText();
        return actuaMessage;
    }

    public boolean homePageButtonStatus() {
        System.out.println("Get The App link status: " + getTheAppLink.isEnabled());
        System.out.println("'One Request' link status: " + oneRequestButton.isEnabled());
        boolean bl = favoriteLink.isEnabled();
        return bl;
    }

    public boolean clickLogo() {
        boolean enabled = logo.isEnabled();
        return enabled;
    }

    public boolean orderProtectionButtonStatus() {
        boolean enabled = orderProtectionButton.isEnabled();
        return enabled;

    }

    public String tradeAlertSubscription() throws InterruptedException {
        emailBoxToSubscribeForTradeAlert.sendKeys("testdata.islam@gmail.com");
        tradeAlertSubscriptionButton.click();
        sleepFor(5);
        String currentUrl = driver.getCurrentUrl();
        return currentUrl;
    }
}