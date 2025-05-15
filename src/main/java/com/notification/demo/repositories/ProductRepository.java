package com.notification.demo.repositories;

import com.notification.demo.entities.Product;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

    @Query("SELECT p FROM Product p WHERE p.price BETWEEN :minPrice AND :maxPrice ORDER BY p.name")
    List<Product> findByPriceBetweenAndSort(@Param("minPrice") double minPrice, @Param("maxPrice") double maxPrice);

    @Modifying
    @Query("UPDATE Product p SET p.price = :newPrice WHERE p.category.id = :categoryId")
    void updatePriceByCategory(double newPrice, short categoryId);


}