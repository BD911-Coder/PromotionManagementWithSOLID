package com.bd911coder.promotion.entities.concretes;

import com.bd911coder.promotion.entities.abstracts.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@javax.persistence.Entity
@Data @NoArgsConstructor @AllArgsConstructor
@Table(name = "products")
public class Product implements Entity {

    @Id
    @Column(name = "product_id")
    private int productId;

    @Column(name = "product_name")
    private String productName;

    @ManyToOne(targetEntity = Supplier.class,fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "product_id",referencedColumnName = "supplier_id",nullable = false,insertable = false,updatable = false)
    private Supplier supplier;

    @ManyToOne(targetEntity = Category.class,fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "category_id",referencedColumnName = "category_id",nullable = false,insertable = false,updatable = false)
    private Category category;

    @Column(name = "quantity_per_unit")
    private int quantityPerUnit;

    @Column(name = "unit_price")
    private double unitPrice;

    @Column(name = "units_in_stock")
    private int unitsInStock;

    @Column(name = "units_on_order")
    private int unitsOnOrder;

    @Column(name = "reorder_level")
    private int reOrderLevel;

    @Column(name = "discontinued")
    private int discontinued;


}
