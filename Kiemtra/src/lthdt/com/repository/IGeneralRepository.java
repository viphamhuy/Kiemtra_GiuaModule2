package lthdt.com.repository;

import lthdt.com.model.Product;

import java.util.List;

public interface IGeneralRepository<E> {
    List<E> findAll();
    void add( E e);
    void delete();
    void setProFileProduct();
    Product searchByName(String name);
    void sortPriceIncrease();
    void sortPriceReduction();

}
