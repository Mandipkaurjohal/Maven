package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString

public class Product implements Comparable<Product> {

    int productId;
    String productName;
    String productDescription;

    @Override
    public int compareTo(Product o) {
        return this.productName.compareTo(o.productName);
    }

    //    @Override
//    public int compareTo(Product product) {
//        return this.productId-product.productId;
//
//    }




}


