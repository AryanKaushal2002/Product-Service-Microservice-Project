package com.aryan.rapidretail.repository;

import com.aryan.rapidretail.Model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String>{
}
