package com.bd911coder.promotion.entities.concretes;

import com.bd911coder.promotion.entities.abstracts.Entity;

public class Product implements Entity {

    private int productId;
    private String productName;
    private int supplierId;
    private int categoryId;
    private int quantityPerUnit;
    private double unitPrice;
    private int unitsInStock;
    private int unitsOnOrder;
    private int reOrderLevel;
    private int discontinued;


}
