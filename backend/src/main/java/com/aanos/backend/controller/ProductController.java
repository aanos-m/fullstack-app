package com.aanos.backend.controller;

import com.aanos.backend.entity.Product;
import com.aanos.backend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService productService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/v1/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/v1/products/{id}")
    public Product getAllProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @PostMapping("/v1/products")
    public Product createProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }
    @ResponseStatus(HttpStatus.ACCEPTED)
    @PutMapping("/v1/products/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product productDetails) {
        return ResponseEntity.ok(productService.updateProduct(id, productDetails));
    }

    @DeleteMapping("/v1/products/{id}")
    public ResponseEntity<Product> deleteProductById(@PathVariable Long id) {
        productService.deleteProductById(id);
        return ResponseEntity.notFound().build();
    }
}
