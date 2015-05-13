package com.sales;

import baseApi.Base;
import org.testng.annotations.Test;

/**
 * Created by Criminal on 5/13/15.
 */
public class ebayNavigation extends Base  {
    @Test
    public  void ebyNav() throws InterruptedException {
//        List<WebElement> bookNavBar = getWebElements("#gh-catr");

        for(int i=4; i<11; i++){

            mouseHoverByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td["+i+"]/a");
            sleepFor(3);
        }



    }


}
