package lthdt.com.view;

import lthdt.com.controller.ProductController;
import lthdt.com.model.Product;
import lthdt.com.repository.ProductRepositoryImpl;

import java.util.List;
import java.util.Scanner;

public class ProductView {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ProductController productController = new ProductController();
        menu();
        int choice;
        do {

            choice = input.nextInt();
            switch (choice) {
                case 1:
                    List<Product> productList = productController.getProduct();
                    for (int i = 1; i <= productList.size() ; i++) {
                        System.out.println(i+".  ID:"+productList.get(i-1).getId()+"       NAME: "+productList.get(i-1).getName() +"    ,PRICE: "+productList.get(i-1).getPrice());
                    }
                    break;
                case 2:
                    Product product = productFrom();
                    productController.addProduct(product);
                    break;
                case 3:
                    productController.setProduct();
                    break;
                case 4:
                    productController.deleteProduct();
                    break;
                case 5:
                    System.out.println("Nhập tên sản phẩm cần tìm: ");
                    String name = new Scanner(System.in).nextLine();
                    Product product1 = productController.searchProduct(name);
                    if(product1!=null) {
                        System.out.println("ID: " + product1.getId() + "  ,NAME: " + product1.getName()+"  ,PRICE: "+product1.getPrice());
                    }
                    else {
                        System.out.println("Không tìm thấy sản phẩm!");
                    }
                    break;
                case 6:
                    System.out.println("Bạn muốn sắp xếp theo: ");
                    System.out.println("1. Tăng dần");
                    System.out.println("2. Giảm dần");
                    int stt = new Scanner(System.in).nextInt();
                    switch (stt){
                        case 1:
                            productController.sortProductIncrease();
                            break;
                        case 2:
                            productController.sortProductReduction();
                            break;
                    }
                    break;
            }
        }while (choice!=0);

    }

    public static void menu() {
        System.out.println("-------####-------");
        System.out.println("Quản lí sản phẩm ");
        System.out.println("1. Hiển thị danh sản phẩm");
        System.out.println("2. Thêm mới sản phẩm");
        System.out.println("3. Sửa thông sản phẩm");
        System.out.println("4. Xóa sản phẩm");
        System.out.println("5. Tìm sản phẩm theo tên");
        System.out.println("6. Sắp xếp sản phẩm theo giá");
        System.out.println("Nhập vào lựa chọn: ");
    }

    public static Product productFrom(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        Double price = scanner.nextDouble();
        Product product = new Product(id,name,price);
        return product;
    }
}
