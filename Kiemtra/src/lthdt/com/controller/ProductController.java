package lthdt.com.controller;

import lthdt.com.model.Product;
import lthdt.com.service.ProductServiceImpl;

import java.util.List;

public class ProductController {
    ProductServiceImpl productService = new ProductServiceImpl();

    public List<Product> getProduct() {
        return productService.findAllHaveBusiness();
    }

    public void addProduct(Product product) {
        productService.addHaveBusiness(product);
    }

    public void deleteProduct() {
        productService.deleteHaveBusiness();
    }

    public void setProduct() {
        productService.setProFileProductHaveBusiness();
    }

    public Product searchProduct(String name) {
        return productService.searchByNameHaveBusiness(name);
    }
    public void sortProductIncrease(){
        productService.sortPriceIncreaseHaveBusiness();
    }
    public void sortProductReduction(){
        productService.sortPriceReductionHaveBusiness();
    }
}

