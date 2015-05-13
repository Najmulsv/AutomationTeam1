package com.ebayHome;

import baseApi.Base;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Criminal on 5/7/15.
 */
public class ebayList extends Base {
    public static List<String> manu = new ArrayList <String>();
    public static String [] list = {
            "All Categories" ,
            "Antiques" ,
            "Art" ,
            "Baby" ,
            "Books" ,
            "Business & Industrial"
    };
    public void setItems (String [] list){
        for (String st:list){
            manu.add(st);
        }
    }
    public List<String >getItems(){
        return manu;
    }

    public List<String> searchDropDownMenu(String locator){
        List<String> menuList = getListOfTextByCss(locator);

        return menuList;

    }

    public void search(String locator, String value){
        typeByCss(locator, value);
    }
}
