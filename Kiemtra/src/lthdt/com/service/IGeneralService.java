package lthdt.com.service;

import lthdt.com.model.Product;

import java.util.List;

public interface IGeneralService<E> {
    List<E> findAllHaveBusiness();

    void addHaveBusiness(E e);

    void deleteHaveBusiness();

    void setProFileProductHaveBusiness();

    Product searchByNameHaveBusiness(String name);

    void sortPriceIncreaseHaveBusiness();

    void sortPriceReductionHaveBusiness();
}
