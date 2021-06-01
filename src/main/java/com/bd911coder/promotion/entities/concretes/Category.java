package com.bd911coder.promotion.entities.concretes;

import com.bd911coder.promotion.entities.abstracts.Entity;
import jdk.dynalink.linker.LinkerServices;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@javax.persistence.Entity
@Table(name = "categories") @AllArgsConstructor @NoArgsConstructor @Data
public class Category implements Entity {

    @Id
    @Column(name = "category_id")
    private int categoryId;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "description")
    private String categoryDescription;

    @OneToMany(mappedBy = "category")
    private List<Product> products;



}
