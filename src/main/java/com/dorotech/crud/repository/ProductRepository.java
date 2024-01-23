package com.dorotech.crud.repository;

import com.dorotech.crud.domain.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
