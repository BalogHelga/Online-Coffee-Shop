package com.proiect.Coffee_Shop.repository;

import com.proiect.Coffee_Shop.module.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
