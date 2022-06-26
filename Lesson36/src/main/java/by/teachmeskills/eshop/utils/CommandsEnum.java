package by.teachmeskills.eshop.utils;

public enum CommandsEnum {
    REGISTER_COMMAND("register"),
    SIGN_IN_COMMAND("sign-in"),
    HOME_PAGE_COMMAND("home-page"),
    REDIRECT_SUBCATEGORY_COMMAND("subcategory-redirect"),
    REDIRECT_PRODUCT_COMMAND("product-redirect"),
    REDIRECT_SHOPPING_CART_COMMAND("redirect-to-shopping-cart"),
    REDIRECT_CABINET_COMMAND("redirect-to-cabinet"),
    ADD_PRODUCT_TO_CART("add-product-to-cart"),
    REMOVE_PRODUCT_FROM_CART("remove-product-from-cart"),
    ADD_PRODUCT_TO_ORDER("add-product-to-order"),
    REDIRECT_TO_SELECTED_PRODUCT("redirect-to-selected-product"),
    REDIRECT_TO_SEARCH("redirect-to-search"),
    REDIRECT_TO_SIGNIN("redirect-to-signin");

    private final String command;

    CommandsEnum(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }
}

