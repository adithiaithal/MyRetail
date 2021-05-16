package com.myretail.controller;
import java.util.List;

import com.myretail.model.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.myretail.model.Product;
import com.myretail.service.ProductService;

//mark class as Controller
@RestController
public class ProductController
{
//    autowire the ProductService class
    @Autowired
    ProductService productService;

    //creating a get mapping that retrieves all the product detail from the database
//    @GetMapping("/product")
//    private List<Product> getAllProducts()
//    {
//        return productService.getAllProducts();
//    }

    //creating a get mapping that retrieves the detail of a specific product
    @GetMapping("/product/{productId}")
    private ProductDAO getProducts(@PathVariable("productId") int productId)
    {
        System.out.println("GETTING PRODUCT!!!!!");
        return productService.getProductsById(productId);
    }

    //creating post mapping that post the product detail in the database
    @PostMapping("/product")
    private ProductDAO saveProduct(@RequestBody ProductDAO productDAO)
    {
        return productService.saveOrUpdate(productDAO);
    }

    //creating put mapping that updates the product detail
    @PutMapping("/product/{productId}")
    private ProductDAO update(@PathVariable("productId") int productId, @RequestBody ProductDAO productDAO)
    {
        return productService.saveOrUpdate(productDAO);
    }

    //creating a delete mapping that deletes a specified product
    @DeleteMapping("/product/{productId}")
    private void deletProduct(@PathVariable("productId") int productId)
    {
        productService.delete(productId);
    }
}
