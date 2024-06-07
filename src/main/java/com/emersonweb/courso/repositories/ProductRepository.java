package com.emersonweb.courso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emersonweb.courso.entites.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
