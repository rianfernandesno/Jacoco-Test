package com.example.dscommerce.Factory;

import com.example.dscommerce.entities.Category;
import com.example.dscommerce.entities.Product;

public class ProductFactory {

    public static Product createProduct(){
        Category category = CategoryFactory.createCategory();
        Product product = new Product(1L, "Console PlayStation 5", "lorem asosaisad a dmsaidasid jasdj", 3999.0, "https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/1-big.jpg");

        product.getCategories().add(category);

        return product;
    }

    public static Product createProduct(String name){
        Product product = createProduct();
        product.setName(name);

        return  product;
    }
}
