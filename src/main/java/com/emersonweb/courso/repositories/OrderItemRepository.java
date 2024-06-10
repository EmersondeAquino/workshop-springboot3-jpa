package com.emersonweb.courso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emersonweb.courso.entites.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
