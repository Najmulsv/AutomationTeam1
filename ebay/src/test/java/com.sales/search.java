package com.sales;


import com.ebayHome.ebayList;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by Criminal on 5/7/15.
 */
public class search extends ebayList {
    @Test
    public void SearchItems() throws InterruptedException{
        setItems(ebayList.list);
        getItems();
        List<String >listManu = searchDropDownMenu("#gh-cat option");
        displayText(listManu);
        for (String item: listManu){
            typeAndEnterByCss("#gh-ac",item);
            sleepFor(2);
            driver.findElement(By.cssSelector("#gh-ac")).clear();
        }


    }
}
