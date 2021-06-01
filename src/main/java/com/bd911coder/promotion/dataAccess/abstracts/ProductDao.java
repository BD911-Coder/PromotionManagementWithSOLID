package com.bd911coder.promotion.dataAccess.abstracts;

import com.bd911coder.promotion.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Integer> {
}
