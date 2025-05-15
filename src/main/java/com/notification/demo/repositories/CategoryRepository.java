package com.notification.demo.repositories;

import com.notification.demo.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Short> {
}