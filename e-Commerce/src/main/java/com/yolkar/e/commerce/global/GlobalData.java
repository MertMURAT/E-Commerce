package com.yolkar.e.commerce.global;

import com.yolkar.e.commerce.model.Product;

import java.util.ArrayList;
import java.util.List;

public class GlobalData {

    public static List<Product> cart;

    static {
        cart = new ArrayList<Product>();
    }
}
