package ebayTestCases;

import base.CommonAPI;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

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
}
