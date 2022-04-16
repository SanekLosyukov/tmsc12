package by.teachmeskills;

import by.teachmeskills.model.Product;
import by.teachmeskills.utils.CRUDUtils1;

public class Application1 {
    public static void main(String[] args) {
        Product product = new Product("Huawei", "MobilePhone", 300, 120, true);
        System.out.println("Saved products:");
        System.out.println(CRUDUtils1.saveProduct(product));
        System.out.println("---------------------------------------------------");

        System.out.println("All products:");
        System.out.println(CRUDUtils1.getAllProducts());
        System.out.println("---------------------------------------------------");

        System.out.println("Updated products:");
        System.out.println(CRUDUtils1.updateProduct(1, 555));
        System.out.println("----------------------------------------------------");

        System.out.println("Deleted products:");
        System.out.println(CRUDUtils1.deleteProduct(4));
    }
}
