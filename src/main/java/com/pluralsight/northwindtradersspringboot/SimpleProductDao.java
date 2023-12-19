package com.pluralsight.northwindtradersspringboot;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SimpleProductDao implements ProductDao {
    private List<Product> products = new ArrayList<>();

    @Override
    public void add(Product product) {

        products.add(product);

    }

    @Override
    public List<Product> getAll() {
        return products;

    }
}
