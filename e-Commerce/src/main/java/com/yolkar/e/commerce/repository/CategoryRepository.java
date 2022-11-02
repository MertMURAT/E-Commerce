package com.yolkar.e.commerce.repository;

import com.yolkar.e.commerce.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
