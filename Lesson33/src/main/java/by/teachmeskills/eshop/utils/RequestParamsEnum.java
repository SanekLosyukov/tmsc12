package by.teachmeskills.eshop.utils;

public enum RequestParamsEnum {
    NAME("name"),
    SURNAME("surname"),
    EMAIL("email"),
    DATE("date"),
    PASSWORD("password"),
    COMMAND("command"),
    CATEGORY("category"),
    PRODUCTS("products"),
    PRODUCTLIST("productList"),
    SHOPPING_CART("cart"),
    CART_PRODUCTS("cartProducts"),
    CABINET("cabinet"),
    SHOPPING_CART_PRODUCTS("cartProductsList"),
    PRODUCT_ID("product_id");

    private final String value;

    RequestParamsEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

