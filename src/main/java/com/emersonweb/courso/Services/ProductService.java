package com.emersonweb.courso.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emersonweb.courso.entites.Product;
import com.emersonweb.courso.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	public List<Product> FindAll() {
		return repository.findAll();
	}

	public Product FindById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
