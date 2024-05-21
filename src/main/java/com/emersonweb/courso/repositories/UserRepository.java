package com.emersonweb.courso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emersonweb.courso.entites.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
