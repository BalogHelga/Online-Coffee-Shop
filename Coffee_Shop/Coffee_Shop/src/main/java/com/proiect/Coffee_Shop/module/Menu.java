package com.proiect.Coffee_Shop.module;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Product> listOfProducts = new ArrayList<>();

    public Menu(){
    }

    public void add(Product product) {
        this.listOfProducts.add(product);
    }

    public void delete(Product product) {
        this.listOfProducts.remove(product);
    }

    public void update(Product productInit, Product productFinal){
        int index = this.listOfProducts.indexOf(productInit);
        this.listOfProducts.set(index, productFinal);
    }

    public List<Product> getListOfProducts() {
        return this.listOfProducts;
    }

    public void setListOfProducts(List<Product> products) {
        this.listOfProducts = products;
    }


}
