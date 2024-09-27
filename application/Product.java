package application; // Khai báo package đứng đầu tệp

import java.io.Serializable; // Khai báo các thư viện bên ngoài

// Định nghĩa lớp Product
public class Product implements Serializable {
    private String name;
    private double price;

    // Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter và Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Hiển thị thông tin sản phẩm
    public void displayInfo() {
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);
    }
}
