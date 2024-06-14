package com.emersonweb.courso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emersonweb.courso.entites.OrderItem;
import com.emersonweb.courso.entites.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
