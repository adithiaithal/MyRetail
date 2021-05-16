package com.myretail.repository;
import org.springframework.data.repository.CrudRepository;
//repository that extends CrudRepository
import com.myretail.model.Product;
import org.springframework.stereotype.Repository;

public interface ProductRepository extends CrudRepository<Product, Integer> {}