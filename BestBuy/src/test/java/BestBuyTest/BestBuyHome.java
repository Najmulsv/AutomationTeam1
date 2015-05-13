package BestBuyTest;

import baseApi.Base;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by nojrul2006 on 5/9/2015.
 */
public class BestBuyHome extends Base {
    @Test
    public void homePageOfAmazon() throws InterruptedException {
        System.out.println(driver.getCurrentUrl());
        List<String> list = searchDropDownMenu(".sub-nav-group");
        sleepFor(4);

        displayText(list);
        typeAndEnterByCss("#gh-search-input", "iphone");
        sleepFor(4);
    }


}

