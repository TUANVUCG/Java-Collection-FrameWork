package Practice_ArrayList_LinkedList;

import java.util.*;

public class ProductManager {
    Scanner sc = new Scanner(System.in);

    List<Product> productList = new ArrayList<>();

    // them san pham
    public void addProduct(Product product) {
        productList.add(product);
    }

    // Hien thi thong tin san pham
    public void showInfoProduct() {
        for (Product product : productList) {
            System.out.println(product.toString());
        }
    }

    // Tim san pham theo id
    public void findProductById(int id) {
        boolean k = false;
        for (Product product : productList) {
            if (product.getId() == id) {
                System.out.println(product);
                k = true;
            }
        }if(!k){
            System.out.println("Không tìm thấy id phù hợp !");
        }

    }

    private int inputId() {
        int id = sc.nextInt();
        sc.nextLine();
        return id;
    }


    //Sua thong tin theo id
    public Product editInfoById(int id) {
        boolean k = false;
        for (Product product : productList) {
            if (id == product.getId()) {
                System.out.print("Sửa giá : ");
                product.setPrice(sc.nextDouble());
                sc.nextLine();
                System.out.print("Sửa màu : ");
                product.setColor(sc.nextLine());
                System.out.print("Sửa id : ");
                product.setId(sc.nextInt());
                return product;
            }
        }
        if(!k){
            System.out.println("Không tìm thấy id phù hợp !");
        }
        return null;
    }

    // Xoa mot san pham
    public void removeProduct(int id){
        productList.removeIf(product -> product.getId() == id);
    }

    // Sap xep theo gia
    public void sortByPrice() {
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }

}
