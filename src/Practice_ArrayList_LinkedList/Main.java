package Practice_ArrayList_LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner sc = new Scanner(System.in);
        int choice =-1;
        do{
            System.out.println("Nhập lựa chọn của bạn : ");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị thông tin sản phẩm");
            System.out.println("3. Sửa thông tin sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm bằng id");
            System.out.println("6. Sắp xếp sản phẩm theo giá");
            System.out.println("0. Thoát");
            choice = sc.nextInt();
            switch (choice){
                case 1 : {
                    Product product = new Product();
                    product.inputProductInfo();
                    productManager.addProduct(product);
                    break;
                }
                case 2 : {
                    productManager.showInfoProduct();
                    break;
                }
                case 3 : {
                    System.out.print("Nhập id cần sửa : ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    productManager.editInfoById(id);
                    break;
                }
                case 4 : {
                    System.out.print("Nhập id cần xóa : ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    productManager.removeProduct(id);
                    break;
                }
                case 5 : {
                    System.out.print("Nhập id cần xem thông tin : ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    productManager.findProductById(id);
                    break;
                }
                case 6 : {
                    productManager.sortByPrice();
                    productManager.showInfoProduct();
                    break;
                }
            }
        }while(choice != 0);
    }
}
