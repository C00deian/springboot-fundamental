ALTER TABLE wishlist
DROP FOREIGN KEY FKtrd6335blsefl2gxpb8lr0gr7;


ALTER TABLE `store`.`wishlist`
ADD CONSTRAINT `FKtrd6335blsefl2gxpb8lr0gr7`
  FOREIGN KEY ( `product_id`)
  REFERENCES products ( `id`)
  ON DELETE CASCADE;
