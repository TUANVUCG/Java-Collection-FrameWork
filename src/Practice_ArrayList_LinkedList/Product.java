package Practice_ArrayList_LinkedList;

import java.util.Scanner;

public class Product {
    private int id;
    private double price;
    private String color;


    public Product() {
    }

    public Product(int id, double price, String color) {
        this.id = id;
        this.price = price;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void inputProductInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập id : ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập giá : ");
        price = sc.nextDouble();
        sc.nextLine();
        System.out.print("Nhập màu : ");
        color = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
