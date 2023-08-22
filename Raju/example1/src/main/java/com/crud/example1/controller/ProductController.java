package com.crud.example1.controller;

import com.crud.example1.entity.Product;
import com.crud.example1.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
@Autowired
    private ProductService service;


@PostMapping("/addProduct")
public Product addProduct(@RequestBody Product product){
    return service.saveProduct(product);
}
//    @PostMapping("/addProduct")
//public List<Product> addProducts(@RequestBody List<Product> products){
//    return service.saveProducts(products);
//}
@GetMapping("/products")
public List<Product> findAllProduct(){
    return service.getProducts();
}
    @GetMapping("/productsById/{id}")
public Product findProductsById(@PathVariable int id){
    return service.getProductsById(id);
}
    @GetMapping("/productsByName/{name}")
public Product findProductsByName(@PathVariable String name){
    return service.getProductsByname(name);
}
    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product){
        return service.updateProduct(product);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id){
    return service.deleteProduct(id);
    }
}
