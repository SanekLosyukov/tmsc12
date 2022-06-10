package by.teachmeskills.eshop.utils;

public enum CommandsEnum {
    REGISTER_COMMAND("register"),
    SIGN_IN_COMMAND("sign-in"),
    HOME_PAGE_COMMAND("home-page"),
    CATEGORY_PAGE_COMMAND("category-redirect"),
    REDIRECT_PRODUCT_COMMAND("product-redirect"),
    REDIRECT_SHOPPING_CART_COMMAND("redirect-to-shopping-cart"),
    REDIRECT_CABINET_COMMAND("redirect-to-cabinet"),
    ADD_PRODUCT_TO_CART("add-product-to-cart"),
    REMOVE_PRODUCT_FROM_CART("remove-product-from-cart"),
    ADD_PRODUCT_TO_ORDER("add-product-to-order");

    private final String command;

    CommandsEnum(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }
}

