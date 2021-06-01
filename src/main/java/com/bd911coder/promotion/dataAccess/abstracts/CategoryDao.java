package com.bd911coder.promotion.dataAccess.abstracts;

import com.bd911coder.promotion.entities.concretes.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category,Integer> {
}
