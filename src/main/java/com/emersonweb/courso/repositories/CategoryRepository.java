package com.emersonweb.courso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emersonweb.courso.entites.Category;
import com.emersonweb.courso.entites.User;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
