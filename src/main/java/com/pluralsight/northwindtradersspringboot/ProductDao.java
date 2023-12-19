package com.pluralsight.northwindtradersspringboot;

import com.pluralsight.northwindtradersspringboot.Product;

import java.util.List;

public interface ProductDao {
    void add(Product product);

    public List<Product> getAll();

}
