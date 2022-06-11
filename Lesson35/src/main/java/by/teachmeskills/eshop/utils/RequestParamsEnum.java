package by.teachmeskills.eshop.utils;

public enum RequestParamsEnum {
    ID("id"),
    NAME("name"),
    SURNAME("surname"),
    EMAIL("email"),
    PASSWORD("password"),
    DATE("date"),
    USER("user"),
    COMMAND("command"),
    CATEGORIES("categories"),
    PRODUCT("product"),
    PRODUCTS("products"),
    PRODUCTLIST("productList"),
    TOTALPRICE("totalPrice"),
    CART("cart"),
    CART_PRODUCTS("cartProducts"),
    ORDER("order"),
    ORDER_PRODUCTS("orderProducts"),
    ORDER_TOTAL_PRICE("orderTotalPrice"),
    PRODUCT_ID("product_id");

    private final String value;

    RequestParamsEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

