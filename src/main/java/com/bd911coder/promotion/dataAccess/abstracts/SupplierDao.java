package com.bd911coder.promotion.dataAccess.abstracts;

import com.bd911coder.promotion.entities.concretes.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierDao extends JpaRepository<Supplier, Integer> {
}
