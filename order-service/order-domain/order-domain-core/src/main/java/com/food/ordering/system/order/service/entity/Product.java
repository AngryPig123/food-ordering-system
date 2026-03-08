package com.food.ordering.system.order.service.entity;

import com.food.ordering.system.entity.BaseEntity;
import com.food.ordering.system.valuobject.Money;
import com.food.ordering.system.valuobject.ProductId;

public class Product extends BaseEntity<ProductId> {

    private String name;
    private Money price;

    public void updateWithConfirmedNameAndPrice(String name, Money price) {
        this.name = name;
        this.price = price;
    }

    public Product(ProductId productId, String name, Money price) {
        super.setId(productId);
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Money getPrice() {
        return price;
    }

}
