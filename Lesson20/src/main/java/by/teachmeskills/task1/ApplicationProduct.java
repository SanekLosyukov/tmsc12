package by.teachmeskills.task1;

import by.teachmeskills.task1.model.Product;
import by.teachmeskills.task1.utils.CRUDUtilsProduct;

public class ApplicationProduct {
    public static void main(String[] args) {
        Product product = new Product("Huawei", "MobilePhone", 300, 120, true);
        System.out.println("Saved products:");
        System.out.println(CRUDUtilsProduct.saveProduct(product));
        System.out.println("---------------------------------------------------");

        System.out.println("All products:");
        System.out.println(CRUDUtilsProduct.getAllProducts());
        System.out.println("---------------------------------------------------");

        System.out.println("Updated products:");
        System.out.println(CRUDUtilsProduct.updateProduct(1, 555));
        System.out.println("----------------------------------------------------");

        System.out.println("Deleted products:");
        System.out.println(CRUDUtilsProduct.deleteProduct(4));
    }
}
