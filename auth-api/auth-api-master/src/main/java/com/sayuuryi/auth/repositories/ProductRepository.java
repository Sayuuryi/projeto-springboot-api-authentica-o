package com.sayuuryi.auth.repositories;

import com.sayuuryi.auth.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
