package com.primerejerciciomicroservicio.productmicroservice.repository;

import com.primerejerciciomicroservicio.productmicroservice.entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductEntity,String> {
}
