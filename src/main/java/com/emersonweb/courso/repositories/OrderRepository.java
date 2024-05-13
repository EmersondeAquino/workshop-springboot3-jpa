package com.emersonweb.courso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emersonweb.courso.entites.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
