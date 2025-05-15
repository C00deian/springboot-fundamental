package com.notification.demo.services;

import com.notification.demo.entities.Category;
import com.notification.demo.entities.Product;
import com.notification.demo.repositories.CategoryRepository;
import com.notification.demo.repositories.ProductRepository;
import com.notification.demo.repositories.UserRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@AllArgsConstructor
@Service
public class UserService {

   private final ProductRepository productRepository;
   private final CategoryRepository categoryRepository;
    private final UserRepository userRepository;

    @Transactional
    public void manageProducts(){
//        create a product with an existing Category
//        var category1 = categoryRepository.findById((short)1).orElseThrow();
//        create a product with a new Category
//        var category = new Category("Category 1");
//        var products = Product.builder()
//                .name("product2")
//                .price(BigDecimal.valueOf(10.94))
//                .category(category1)
//                .build();

//        productRepository.save(products);


//        Add Procuts to User's WishList
//       var user = userRepository.findById(1L).orElseThrow();
//       var products = productRepository.findAll();
//
//       products.forEach(user::addFavouriteProduct);
//       userRepository.save(user);

//       delete product from wishlist
        productRepository.deleteById(2L);




    }

    @Transactional
   public void  updateProductByCategory(){
        productRepository.updatePriceByCategory(10 ,(short)1);
    }

}
