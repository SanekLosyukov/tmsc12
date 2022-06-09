package by.teachmeskills.eshop.utils;

public enum PagesPathEnum {
    REGISTER_PAGE("register.jsp"),
    SIGN_IN_PAGE("signin.jsp"),
    HOME_PAGE("home.jsp"),
    CATEGORY_PAGE("category.jsp"),
    PRODUCT_PAGE("product.jsp"),
    CART_PAGE("cart.jsp"),
    CABINET_PAGE("cabinet.jsp");

    private final String path;

    PagesPathEnum(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}

