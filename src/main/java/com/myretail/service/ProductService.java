package com.myretail.service;
import java.util.ArrayList;
import java.util.List;

import com.myretail.model.CurrentPrice;
import com.myretail.model.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.myretail.model.Product;
import com.myretail.repository.ProductRepository;
//defining the business logic

@Service
public class ProductService
{
    @Autowired
    ProductRepository productRepository;

    //getting all products record by using the method findaAll() of CrudRepository
    /*public List<Product> getAllProducts()
    {
        List<Product> products = new ArrayList<Product>();
        productRepository.findAll().forEach(products1 -> products.add(products1));
        return products;
    }*/

    //getting a specific record by using the method findById() of CrudRepository
    public ProductDAO getProductsById(int id)
    {
        Product product = productRepository.findById(id).get();
        return productToProductDAO(product);
    }

    //saving a specific record by using the method save() of CrudRepository
    public ProductDAO saveOrUpdate(ProductDAO productDAO)
    {
        Product product = productDToProduct(productDAO);
        productRepository.save(product);
        return productDAO;
    }

    //deleting a specific record by using the method deleteById() of CrudRepository
    public void delete(int id)
    {
        productRepository.deleteById(id);
    }

    //updating a record
    /*public void update(Product product, int productid)
    {
    productRepository.save(product);
    }
*/
    public Product productDToProduct(ProductDAO productD) {
        Product product = new Product();
        product.setProductId(productD.getProductId());
        product.setValue(productD.getCurrentPrice().getValue());
        product.setCurrencyCode(productD.getCurrentPrice().getCurrency_code());
        return product;
    }

    public ProductDAO productToProductDAO(Product product) {
        ProductDAO productDAO = new ProductDAO();
        CurrentPrice currentPrice = new CurrentPrice();
        currentPrice.setValue(product.getValue());
        currentPrice.setCurrency_code(product.getCurrencyCode());
        productDAO.setProductId(product.getProductId());
        productDAO.setCurrentPrice(currentPrice);
        return productDAO;
    }
}