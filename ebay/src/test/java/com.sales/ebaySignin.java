package com.sales;


import baseApi.Base;
import org.testng.annotations.Test;

/**
 * Created by Criminal on 4/30/15.
 */
public class ebaySignin extends Base{
    @Test
    public void signIn()throws InterruptedException{
        sleepFor(2);
        clickByCss("#gh-ug>a");
        sleepFor(2);
        typeByCss("#userid", "abscc@gmail.com");
        typeAndEnterByCss("#pass","12345");
//        clickByCss(".nav-action-inner");
        sleepFor(4);

    }
}



        //