package com.sales;

import baseApi.Base;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by Criminal on 5/3/15.
 */
public class EbayMainPage extends Base {
    @Test
    public void homePageOfAmazon()throws InterruptedException {
        System.out.println(driver.getCurrentUrl());
        typeAndEnterByCss("#gh-ac", "book");

        sleepFor(4);
        List<String> list = searchDropDownMenu("#gh-cat option");


        displayText(list);
        sleepFor(4);

////         List<WebElement> bookNavBar = getWebElements("#gh-catr");
//        for(int i=1; i<list.size(); i++){
//            clickByText(list.get(i));
//        }
//        sleepFor(2);
//
    }

}
