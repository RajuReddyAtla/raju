package com.crud.example1.services;

import com.crud.example1.entity.Product;
import com.crud.example1.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;


    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    public List<Product> saveProduct(List<Product> products) {
        return repository.saveAll(products);
    }
    public List<Product> getProducts(){
        return repository.findAll();
    }
  public Product getProductsById(int id){
        return repository.findById(id).orElse(null);
    }
    public Product getProductsById(String name){
        return repository.findByName(name);
    }
    public String deleteProduct(int id){
        repository.deleteById(id);
        return "product removed !!"+id;
    }
    public Product updateProduct(Product product){
        Product existingProduct=repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return repository.save(existingProduct);
    }

    public List<Product> saveProducts(List<Product> products) {
        return products;
    }

    public Product getProductsByname(String name) {
        return null;
    }

    public Product getProductById(int id) {
        return null;
    }
}