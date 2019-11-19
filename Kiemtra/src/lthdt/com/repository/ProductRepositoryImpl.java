package lthdt.com.repository;

import lthdt.com.model.Product;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductRepositoryImpl implements IProductRepository {

    ArrayList<Product> listProduct = new ArrayList<>();
    {
        listProduct.add(new Product(1,"Dragon Ball",15.0));
        listProduct.add(new Product(2,"Conan",14.5));
        listProduct.add(new Product(3,"Doremon",13.7));
        listProduct.add(new Product(4,"Dororo",16.3));
        listProduct.add(new Product(5,"OnePice",11));
    }

    @Override
    public List<Product> findAll() {
        return listProduct;
    }

    @Override
    public void add(Product product) {
        listProduct.add(product);
    }

    @Override
    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vị trí cần xóa: ");
        int id = scanner.nextInt();
        for (int i = 1; i <=listProduct.size() ; i++) {
            if(id == i){
                listProduct.remove(id-1);
            }
        }
    }

    @Override
    public void setProFileProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vị trí cần sửa: ");
        int vitri = scanner.nextInt();
        String inputName;
        double repairPrice;
        int id;
        for (int i = 0; i <=listProduct.size() ; i++) {
            if(vitri == i){
                System.out.println("Nhập id sửa: ");
                id = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Nhập tên sửa: ");
                inputName = scanner.nextLine();
                System.out.println("Nhập giá sửa: ");
                repairPrice = scanner.nextDouble();
                listProduct.get(vitri-1).setId(id);
                listProduct.get(vitri-1).setName(inputName);
                listProduct.get(vitri-1).setPrice(repairPrice);
            }
        }
    }

    @Override
    public Product searchByName(String name) {
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getName().contains(name)) {
               return listProduct.get(i);
            }
        }
        return null;
    }

    @Override
    public void sortPriceIncrease() {
        Collections.sort(listProduct, new ProductComparatorIncrease());
        for (Product p: listProduct) {
            System.out.println("ID: "+p.getId()+"  NAME: "+p.getName()+"  ,PRICE:   "+p.getPrice());
        }
    }

    @Override
    public void sortPriceReduction() {
        Collections.sort(listProduct, new ProductCompatorReduction());
        for (Product p: listProduct) {
            System.out.println("ID: "+p.getId()+"  NAME: "+p.getName()+"  ,PRICE:   "+p.getPrice());
        }
    }
}
