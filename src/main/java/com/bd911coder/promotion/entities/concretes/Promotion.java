package com.bd911coder.promotion.entities.concretes;

import com.bd911coder.promotion.entities.abstracts.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cache;

import javax.persistence.*;

@javax.persistence.Entity @Data @AllArgsConstructor @NoArgsConstructor
@Table(name = "promotions")
public class Promotion implements Entity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int promotionId;

    @Column(name = "promotion_name")
    private String promotionName;

    @Column(name = "discount_ratio")
    private int discountRatio;


}
