package by.teachmeskills.eshop;

public enum PagesPathEnum {
    START_PAGE("home"),
    SIGN_IN_PAGE("signin"),
    CATEGORY_PAGE("category"),
    CART_PAGE("cart"),
    PRODUCT_PAGE("product"),
    CABINET_PAGE("cabinet"),
    SEARCH_PAGE("search"),
    ERROR_PAGE("error");

    private final String path;

    PagesPathEnum(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
