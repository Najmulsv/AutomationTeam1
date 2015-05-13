
import org.testng.annotations.Test;

import java.io.IOException;

import java.util.List;
import baseAbc.Base;



/**
 * Created by Shibu on 5/6/2015.
 */

public class AbcHome extends Base {

    @Test
    public void a_show() throws InterruptedException, IOException {
        captureElementScreenShot(".//*[@id='wrapper']/nav/header/ul/li[1]/a/h1/img", "abc");
        clickByCss(".shows");
        sleepFor(2);
        capturePageShot("abcShow");
        List<String> listMenu = searchDropDownMenu(".listing li");
        displayText(listMenu);
    }

/*
    @Test
    public void b_search() throws InterruptedException, IOException {
        searchKeys(".search", "#searchInput", ".searchButton");

    }



    @Test
    public void c_menu() throws InterruptedException {

        clickByCss(".dropdownTrigger");
        sleepFor(4);
        clickByXpath(".//*[@id='wrapper']/nav/div/div/div[1]/ul/li[4]/div/ul/li[1]/a");
        sleepFor(4);
        navigateBack();

        clickByCss(".dropdownTrigger");
        sleepFor(4);
        clickByXpath(".//*[@id='wrapper']/nav/div/div/div[1]/ul/li[4]/div/ul/li[2]/a");
        sleepFor(4);
        navigateBack();

        clickByCss(".dropdownTrigger");
        sleepFor(4);
        clickByXpath(".//*[@id='wrapper']/nav/div/div/div[1]/ul/li[4]/div/ul/li[3]/a");
        sleepFor(4);
        navigateBack();

        clickByCss(".dropdownTrigger");
        sleepFor(4);
        clickByXpath(".//*[@id='wrapper']/nav/div/div/div[1]/ul/li[4]/div/ul/li[4]/a");
        sleepFor(4);
        navigateBack();

        clickByCss(".dropdownTrigger");
        sleepFor(4);
        clickByXpath(".//*[@id='wrapper']/nav/div/div/div[1]/ul/li[4]/div/ul/li[5]/a");
        sleepFor(4);
        navigateBack();

        clickByCss(".dropdownTrigger");
        sleepFor(4);
        clickByXpath(".//*[@id='wrapper']/nav/div/div/div[1]/ul/li[4]/div/ul/li[6]/a");
        sleepFor(4);
        navigateBack();

        clickByCss(".dropdownTrigger");
        sleepFor(4);
        clickByXpath(".//*[@id='wrapper']/nav/div/div/div[1]/ul/li[4]/div/ul/li[7]/a");
        sleepFor(4);

    }

    @Test
    public void d_schedule()throws InterruptedException {

        clickByCss(".dropdownTrigger");
        clickByXpath(".//*[@id='wrapper']/nav/div/div/div[1]/ul/li[4]/div/ul/li[2]/a");

        List<String> listMenu = searchDropDownMenu(".schedWrap li");
        displayText(listMenu);
    }

    @Test
    public void e_databaseTest() throws Exception {

        clickByCss(".dropdownTrigger");
        sleepFor(2);
        clickByXpath(".//*[@id='wrapper']/nav/div/div/div[1]/ul/li[4]/div/ul/li[6]/a");
        sleepFor(2);

        clickByXpath(".//*[@id='homeResults']/ul/li[1]/a[2]");
        captureElementScreenShot(".//*[@id='mainimg']", "shoppingItem");
        sleepFor(2);
        typeByXpath(".//*[@id='addToCartSection']/table/tbody/tr/td[1]/input","1");
        sleepFor(3);
        clickByCss("#AddToCartButtonId");
        sleepFor(3);
        clickByCss("#ViewCartContentControl_btnCheckout2");
        sleepFor(3);
        clickByCss("#checkoutSignIn");
        sleepFor(3);
        typeByName("txtLoginEmail", "txtLoginPassword");



    }*/



}

