package EbayTest;

import ebayTestCases.MainTestCases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AllCategoriesTest extends MainTestCases {
    MainTestCases mainTestCases;

    @BeforeMethod
    public void  initialElements(){
        mainTestCases = PageFactory.initElements(driver,MainTestCases.class);
    }

    @Test
    public void TestAllCategories(){
        selectFromMenu("Art");
    }
    @Test
    public void TestAntiquesCat(){
        selectMenuAntiques();
    }
    @Test
    public void TestArtCat(){
        selectMenuArt();
    }
    @Test
    public void TestBabyCat(){
        selectMenuBaby();
    }
    @Test
    public void TestBooksCat(){
        selectMenuBooks();
    }
    @Test
    public void TestBusIndCat(){
        selectMenuBusInd();
    }
    @Test
    public void testMenuCamPho(){
        selectMenuCamPho();
    }
    @Test
    public void testMenuCellPhones(){
        selectMenuCellPhones();
    }
    @Test
    public void testMenuClothing(){
        selectMenuClothing();
    }
    @Test
    public void testMenuCoins(){
        selectMenuCoins();
    }
    @Test
    public void testMenuCollectibles(){
        selectMenuCollectibles();
    }
    @Test
    public void testMenuCompu(){
        selectMenuCompu();
    }
    @Test
    public void testMenuConsumer(){
        selectMenuConsumer();
    }
    @Test
    public void testMenuCrafts(){
        selectMenuCrafts();
    }
    @Test
    public void testMenuDolls(){
        selectMenuDolls();
    }
    @Test
    public void testMenuDdvd(){
        selectMenuDdvd();
    }
    @Test
    public void testMenuDEntert(){
        selectMenuDEntert();
    }
    @Test
    public void testMenuDGiftC(){
        selectMenuDGiftC();
    }
    @Test
    public void testMenuHealth(){
        selectMenuHealth();
    }
    @Test
    public void testMenuHomeGarden(){
        selectMenuHomeGarden();
    }


}