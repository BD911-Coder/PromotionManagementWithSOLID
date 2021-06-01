package com.bd911coder.promotion.dataAccess.abstracts;

import com.bd911coder.promotion.entities.concretes.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PromotionDao extends JpaRepository<Promotion,Integer> {
}
