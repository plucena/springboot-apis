package com.example.demo.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;

import com.example.demo.entities.Product;
import com.example.demo.repos.ProductRepository;

@RestController
@Api(value = "Product Management System", description = "APIs for managing products")

public class ProductRestController {

	@Autowired
	ProductRepository repository;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductRestController.class);

	@RequestMapping(value = "/products/", method = RequestMethod.GET)
	public List<Product> getProducts() {
		return repository.findAll();
	}

	@ApiOperation(value = "Get a product by ID", notes = "Returns a product for the given ID", response = Product.class)
	@RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
	public Product getProduct(@PathVariable("id") int id) {
		LOGGER.info("Finding product by ID:"+id);
		return repository.findById(id).get();
	}

	@ApiOperation(value = "Create a new product", notes = "Creates a new product", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@RequestMapping(value = "/products/", method = RequestMethod.POST)
	public Product createProduct(@RequestBody Product product) {
		return repository.save(product);
	}

	@ApiOperation(value = "Updates a product", notes = "Creates a new product", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@RequestMapping(value = "/products/", method = RequestMethod.PUT)
	public Product updateProduct(@RequestBody Product product) {
		return repository.save(product);
	}

	@RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
	public void deleteProduct(@PathVariable("id") int id) {
		repository.deleteById(id);
	}

}

