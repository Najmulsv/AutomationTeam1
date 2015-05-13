package com.bestbuyHome;

import baseApi.Base;

import java.util.ArrayList;
import java.util.List;


public class BestBuyList extends Base {
        public static List<String> menu = new ArrayList<String>();
        public static String [] list = {
                "Appliances",
                "TV & Home Theater",
                "Computers & Tablets",
                "Cell Phones",
                "Cameras & Camcorders",
                "Audio",
                "Car Electronics & GPS",
                "Video Games, Movies & Music",
                "Health, Fitness & Beauty",
                "Home & Office",
                "Wearable Technology",
                "Shop by Brand"
        };
        public void setItems (String [] list){
            for (String st:list){
                menu.add(st);
            }
        }
        public List<String >getItems(){
            return menu;
        }

        public List<String> searchDropDownMenu(String locator){
            List<String> menuList = getListOfTextByCss(locator);
            return menuList;

        }

        public void search(String locator, String value){
            typeByCss(locator, value);
        }
    }

