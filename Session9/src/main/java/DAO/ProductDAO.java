package DAO;

import Interface.Session9;
import Models.Product;

import java.util.ArrayList;

public class ProductDAO implements Session9 {
    ArrayList<Product> products = new ArrayList<>();

    @Override
    public boolean save(Object obj) {
        Product product = (Product) obj;
        products.add(product);
        return true;
    }

    @Override
    public void findByName(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                System.out.println(product);
            }
        }
    }

    
}
