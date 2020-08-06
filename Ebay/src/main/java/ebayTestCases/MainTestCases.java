package ebayTestCases;

import base.CommonAPI;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.logging.XMLFormatter;

public class MainTestCases extends CommonAPI {

    @FindBy(xpath = "//input[@class='gh-tb ui-autocomplete-input']" )
    public static WebElement searchBox;
    @FindBy(xpath = "(//a[contains(text(),'Daily Deals')])[1]")
    public static WebElement dailyDeals;
    @FindBy(xpath = "//h1")
    public static WebElement header;
    @FindBy(xpath = "//a[contains(text(),'Brand Outlet')]")
    public static WebElement BrandOutlet;
    @FindBy(xpath = "//div[@class='b-visualnav__title']")
    public static WebElement techCases;
    @FindBy(xpath = "//span[@class='b-breadcrumb__text b-link--tertiary truncate']")
    public static WebElement caseMate;
    @FindBy(xpath = "//div[@id='gh-cat-box']")
    public static WebElement Allcategories;
    @FindBy(xpath = "//input[@class='btn btn-prim gh-spr']")
    public static WebElement searchBotton;
    @FindBy(xpath = "//span[@class ='b-pageheader__text']")
    public static WebElement secHeader;
    @FindBy(xpath = "(//li[@class ='gh-t gh-divider-l'])[3]")
    public static WebElement helpContact;
    @FindBy(xpath = "//li[@id ='gh-p-2']")
    public static WebElement sell;
    @FindBy(xpath = "//span[@class ='l-hero__title']")
    public static WebElement sellheader;
    @FindBy(xpath = "//div[@class = 'gh-menu']")
    public static WebElement myEbay;
    @FindBy(xpath = "(//li[@class = 'hl-cat-nav__js-tab'])[1]")
    public static WebElement motorsBotton;
    @FindBy(xpath = "(//li[@class ='hl-cat-nav__js-tab'])[2]")
    public static WebElement fashionBotton;
    @FindBy (xpath = "(//li[@class ='hl-cat-nav__js-tab'])[3]")
    public static WebElement electronicBotton;
    @FindBy (xpath = "(//li[@class ='hl-cat-nav__js-tab'])[4]")
    public static WebElement collectiblesBotton;
    @FindBy (xpath = "(//li[@class ='hl-cat-nav__js-tab'])[5]")
    public static WebElement homeGardenBotton;
    @FindBy (xpath = "(//li[@class ='hl-cat-nav__js-tab'])[6]")
    public static WebElement sportingBotton;
    @FindBy (xpath = "(//li[@class ='hl-cat-nav__js-tab'])[7]")
    public static WebElement toysBotton;
    @FindBy (xpath = "(//li[@class ='hl-cat-nav__js-tab'])[8]")
    public static WebElement bussinesBotton;
    @FindBy (xpath = "(//li[@class ='hl-cat-nav__js-tab'])[9]")
    public static WebElement musicBotton;
    @FindBy (xpath = "(//li[@class ='hl-cat-nav__js-tab'])[10]")
    public static WebElement dealsBotton;
    @FindBy (xpath = "(//div[@class ='gh-menu'])[3]")
    public static WebElement shoppingCart;
    @FindBy (xpath = "//a[@class='start-shop btn btn--faux']")
    public static WebElement startShopBotton;
    @FindBy (xpath = "//h2[@class= 'ebayui-ellipsis-2']")
    public static WebElement startHeader;
    @FindBy (xpath = " //a[@class= 'sign-in btn btn--faux btn--primary']")
    public static WebElement signInBotton;
    @FindBy (xpath = "(//h3[@class='s-item__title s-item__title--has-tags'])[3]")
    public static WebElement daybedElem;
    @FindBy (xpath = "(//li[@class='srp-refine__category__item'])[2]")
    public static WebElement candleElem;
    @FindBy (xpath = "(//li[@class='srp-refine__category__item'])[3]")
    public static WebElement fraganceElem;
    @FindBy (xpath = "(//h3[@class='x-refine__item'])[1]")
    public static WebElement candleFragElem;


    public void searchOptions(){
        searchBox.sendKeys("candles", Keys.ENTER);
        candleElem.click();
        fraganceElem.click();
        Assert.assertTrue(candleFragElem.getText().contains("Category"));

    }

    public void searchCandles(){
        searchBox.sendKeys("candles", Keys.ENTER);
        Assert.assertTrue(header.getText().contains("candles"));
    }
    public void searchEmbroidered(){
        searchBox.sendKeys("embroidered", Keys.ENTER);
        Assert.assertTrue(header.getText().contains("embroidered"));
    }

    public void searchDayBed(){
        searchBox.sendKeys("daybed", Keys.ENTER);
        daybedElem.click();

    }
    public void startShoppingSec(){
        shoppingCart.click();
        signInBotton.click();
        Assert.assertTrue(header.getText().contains("Please verify yourself to continue"));
    }
    public void startShopping(){
        shoppingCart.click();
        startShopBotton.click();
        Assert.assertTrue(startHeader.getText().contains("Shopping is better with coupons"));
    }
    public void searchShoppingBotton(){
        shoppingCart.click();
        Assert.assertTrue(header.getText().contains("Shopping cart"));
    }
    public void searchMusicBotton(){
        musicBotton.click();
        Assert.assertTrue(header.getText().contains("Music"));
    }
    public void searchDealsBotton(){
        dealsBotton.click();
        Assert.assertTrue(header.getText().contains("Deals"));
    }
    public void searchBussinesBotton(){
        bussinesBotton.click();
        Assert.assertTrue(header.getText().contains("Business & Industrial"));
    }
    public void searchSportingBotton(){
        sportingBotton.click();
        Assert.assertTrue(header.getText().contains("Sporting Goods & Equipment"));
    }
    public void searchtoysBotton(){
        toysBotton.click();
        Assert.assertTrue(header.getText().contains("Toys & Hobbies"));
    }
    public void searchHomeGardenBotton(){
        homeGardenBotton.click();
        Assert.assertTrue(header.getText().contains("Home & Garden"));
    }
    public void searchCollectiblesBotton(){
        collectiblesBotton.click();
        Assert.assertTrue(header.getText().contains("Collectibles & Art"));
    }
    public void searchElectronicBotton(){
        electronicBotton.click();
        Assert.assertTrue(header.getText().contains("Electronics"));
    }
    public void searchFashionBotton(){
        fashionBotton.click();
        Assert.assertTrue(header.getText().contains("Fashion"));

    }
    public void searchMotors(){
        motorsBotton.click();
        Assert.assertTrue(secHeader.getText().contains("eBay Motors"));
    }

    public void searchMyEbay(){
        myEbay.click();
        Assert.assertTrue(header.getText().contains("Please verify yourself to continue"));

    }

    public void searchSell(){
        sell.click();
        Assert.assertTrue(sellheader.getText().contains("Over 182 million shoppers"));
    }

    public void searchHealpContact() {
        helpContact.click();
        Assert.assertTrue(header.getText().contains("How can we help you today?"));
    }

    public void searchProducts(){
        searchBox.sendKeys("Baby", Keys.ENTER);
        Assert.assertTrue(header.getText().contains("Baby"));
    }
    public void searchDailyDeals(){
        dailyDeals.click();
        Assert.assertTrue(header.getText().contains("Deals"));
    }
    public void searchBrandOutlet(){
        BrandOutlet.click();
        Assert.assertTrue(header.getText().contains("The Brand Outlet"));
    }

    public void searchTechCase(){
        BrandOutlet.click();
        techCases.click();
        Assert.assertTrue(caseMate.getText().contains("Case-Mate"));
    }

    public void searchAllCateg(){
        Allcategories.click();

    }
    public void selectFromMenu(String category){
        Select dropMenu = new Select(driver.findElement(By.xpath("//select")));
        dropMenu.selectByVisibleText(category);
    }
    public void selectMenuAntiques(){
        selectFromMenu("Antiques");
        searchBox.sendKeys(Keys.ENTER);
        Assert.assertTrue(header.getText().contains("Antiques"));
    }
    public void selectMenuArt(){
        selectFromMenu("Art");
        searchBox.sendKeys(Keys.ENTER);
        Assert.assertTrue(header.getText().contains("Art"));
    }
    public void selectMenuBaby(){
        selectFromMenu("Baby");
        searchBox.sendKeys(Keys.ENTER);
        Assert.assertTrue(header.getText().contains("Baby"));
    }
    public void selectMenuBooks(){
        selectFromMenu("Books");
        searchBox.sendKeys(Keys.ENTER);
        Assert.assertTrue(header.getText().contains("Books"));
    }
    public void selectMenuBusInd(){
        selectFromMenu("Business & Industrial");
        searchBox.sendKeys(Keys.ENTER);
        Assert.assertTrue(secHeader.getText().contains("Business & Industrial"));
    }
    public void selectMenuCamPho() {
        selectFromMenu("Cameras & Photo");
        searchBox.sendKeys(Keys.ENTER);
        Assert.assertTrue(secHeader.getText().contains("Cameras & Photo"));
    }
    public void selectMenuCellPhones() {
        selectFromMenu("Cell Phones & Accessories");
        searchBox.sendKeys(Keys.ENTER);
        Assert.assertTrue(header.getText().contains("Cell Phones, Smart Watches & Accessories"));
    }
    public void selectMenuClothing() {
        selectFromMenu("Clothing, Shoes & Accessories");
        searchBox.sendKeys(Keys.ENTER);
        Assert.assertTrue(secHeader.getText().contains("Clothing, Shoes & Accessories"));
    }
    public void selectMenuCoins() {
        selectFromMenu("Coins & Paper Money");
        searchBox.sendKeys(Keys.ENTER);
        Assert.assertTrue(header.getText().contains("Coins & Paper Money"));
    }
    public void selectMenuCollectibles() {
        selectFromMenu("Collectibles");
        searchBox.sendKeys(Keys.ENTER);
        Assert.assertTrue(header.getText().contains("Collectibles"));
    }
    public void selectMenuCompu() {
        selectFromMenu("Computers/Tablets & Networking");
        searchBox.sendKeys(Keys.ENTER);
        Assert.assertTrue(secHeader.getText().contains("Computers, Tablets & Network Hardware"));
    }
    public void selectMenuConsumer() {
        selectFromMenu("Consumer Electronics");
        searchBox.sendKeys(Keys.ENTER);
        Assert.assertTrue(secHeader.getText().contains("Consumer Electronics"));
    }
    public void selectMenuCrafts() {
        selectFromMenu("Crafts");
        searchBox.sendKeys(Keys.ENTER);
        Assert.assertTrue(header.getText().contains("Make it Fun With Arts and Crafts"));
    }
    public void selectMenuDolls() {
        selectFromMenu("Dolls & Bears");
        searchBox.sendKeys(Keys.ENTER);
        Assert.assertTrue(header.getText().contains("Dolls & Teddy Bears"));
    }
    public void selectMenuDdvd() {
        selectFromMenu("DVDs & Movies");
        searchBox.sendKeys(Keys.ENTER);
        Assert.assertTrue(header.getText().contains("DVDs & Movies"));
    }
    public void selectMenuDEntert() {
        selectFromMenu("Entertainment Memorabilia");
        searchBox.sendKeys(Keys.ENTER);
        Assert.assertTrue(header.getText().contains("Entertainment Memorabilia"));
    }
    public void selectMenuDGiftC() {
        selectFromMenu("Gift Cards & Coupons");
        searchBox.sendKeys(Keys.ENTER);
        Assert.assertTrue(header.getText().contains("Gift Cards & Coupons"));
    }
    public void selectMenuHealth() {
        selectFromMenu("Health & Beauty");
        searchBox.sendKeys(Keys.ENTER);
        Assert.assertTrue(header.getText().contains("Health & Beauty"));
    }
    public void selectMenuHomeGarden() {
        selectFromMenu("Home & Garden");
        searchBox.sendKeys(Keys.ENTER);
        Assert.assertTrue(header.getText().contains("Home & Garden"));
    }


}
