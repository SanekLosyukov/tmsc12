package by.teachmeskills.eshop.utils;

import by.teachmeskills.eshop.commands.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class CommandFactory {
    private static final Map<String, BaseCommand> COMMAND_LIST = new HashMap<>();

    static {
        COMMAND_LIST.put(CommandsEnum.REGISTER_COMMAND.getCommand(), new RegisterCommandImpl());
        COMMAND_LIST.put(CommandsEnum.HOME_PAGE_COMMAND.getCommand(), new HomePageCommandImpl());
        COMMAND_LIST.put(CommandsEnum.SIGN_IN_COMMAND.getCommand(), new SignInCommandImpl());
        COMMAND_LIST.put(CommandsEnum.REDIRECT_SUBCATEGORY_COMMAND.getCommand(), new RedirectToSubcategoryCommandImpl());
        COMMAND_LIST.put(CommandsEnum.ADD_PRODUCT_TO_CART.getCommand(), new AddProductToCartCommand());
        COMMAND_LIST.put(CommandsEnum.REMOVE_PRODUCT_FROM_CART.getCommand(), new RemoveProductFromCartCommand());
        COMMAND_LIST.put(CommandsEnum.ADD_PRODUCT_TO_ORDER.getCommand(), new AddProductToOrderCommand());
        COMMAND_LIST.put(CommandsEnum.REDIRECT_SHOPPING_CART_COMMAND.getCommand(), new CartRedirectCommandImpl());
        COMMAND_LIST.put(CommandsEnum.REDIRECT_CABINET_COMMAND.getCommand(), new CabinetCommandImpl());
        COMMAND_LIST.put(CommandsEnum.REDIRECT_PRODUCT_COMMAND.getCommand(), new ProductRedirectCommandImpl());
        COMMAND_LIST.put(CommandsEnum.REDIRECT_TO_SELECTED_PRODUCT.getCommand(), new SelectedProductPageCommand());
        COMMAND_LIST.put(CommandsEnum.REDIRECT_TO_SEARCH.getCommand(), new SearchCommandImpl());
        COMMAND_LIST.put(CommandsEnum.REDIRECT_TO_SIGNIN.getCommand(), new RedirectToSigninCommandImpl());
    }

    public static BaseCommand defineCommand(HttpServletRequest request) {
        String commandKey = request.getParameter(RequestParamsEnum.COMMAND.getValue());
        if (commandKey == null || commandKey.isEmpty()) { // если выполняется это условие - значит пришел запрос на открытие сайта
            commandKey = CommandsEnum.REDIRECT_TO_SIGNIN.getCommand();

        }
        return COMMAND_LIST.get(commandKey);
    }

}

