package lthdt.com.service;

import lthdt.com.model.Product;
import lthdt.com.repository.ProductRepositoryImpl;

import java.util.List;

public class ProductServiceImpl implements IProductService {
    ProductRepositoryImpl productRepository = new ProductRepositoryImpl();

    @Override
    public List<Product> findAllHaveBusiness() {
        return productRepository.findAll();
    }

    @Override
    public void addHaveBusiness(Product product) {
        productRepository.add(product);
    }

    @Override
    public void deleteHaveBusiness() {
        productRepository.delete();
    }

    @Override
    public void setProFileProductHaveBusiness() {
        productRepository.setProFileProduct();
    }

    @Override
    public Product searchByNameHaveBusiness(String name) {
       return productRepository.searchByName(name);
    }

    @Override
    public void sortPriceIncreaseHaveBusiness() {
        productRepository.sortPriceIncrease();
    }

    @Override
    public void sortPriceReductionHaveBusiness() {
        productRepository.sortPriceReduction();
    }
}
