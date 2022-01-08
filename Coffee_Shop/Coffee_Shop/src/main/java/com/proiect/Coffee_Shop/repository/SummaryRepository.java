package com.proiect.Coffee_Shop.repository;

import com.proiect.Coffee_Shop.module.Summary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SummaryRepository extends JpaRepository<Summary, Integer> {
}
