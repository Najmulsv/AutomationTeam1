package BestBuyTest;

import com.bestbuyHome.BestBuyList;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by nojrul2006 on 5/9/2015.
 */
public class BestBuySearch extends BestBuyList {
    @Test
    public void SearchItems() throws InterruptedException {
        setItems(BestBuyList.list);
        getItems();
        List<String> listMenu = searchDropDownMenu(".nav-item.js-navitem.productsMenu");
        displayText(listMenu);
        for (String item : listMenu) {
            typeAndEnterByCss("#gh-search-input", item);
            sleepFor(2);
            driver.findElement(By.cssSelector("#gh-search-input")).clear();
        }
    }
}