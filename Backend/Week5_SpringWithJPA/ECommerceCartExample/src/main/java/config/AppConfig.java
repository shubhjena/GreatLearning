package config;

import entities.ShoppingCart;

public class AppConfig {
    public ShoppingCart localShoppingCart(){
        return new ShoppingCart();
    }
 }
