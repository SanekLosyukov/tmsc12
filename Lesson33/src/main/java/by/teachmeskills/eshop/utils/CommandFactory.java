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
        COMMAND_LIST.put(CommandsEnum.CATEGORY_PAGE_COMMAND.getCommand(), new CategoryRedirectCommandImpl());
        COMMAND_LIST.put(CommandsEnum.ADD_PRODUCT_TO_CART.getCommand(), new AddProductToCartCommand());
        COMMAND_LIST.put(CommandsEnum.ADD_PRODUCT_TO_ORDER.getCommand(), new AddProductToOrderCommand());
        COMMAND_LIST.put(CommandsEnum.REDIRECT_SHOPPING_CART_COMMAND.getCommand(), new CartRedirectCommandImpl());
        COMMAND_LIST.put(CommandsEnum.REDIRECT_CABINET_COMMAND.getCommand(), new CabinetCommandImpl());
        COMMAND_LIST.put(CommandsEnum.REDIRECT_PRODUCT_COMMAND.getCommand(), new ProductRedirectCommandImpl());
    }

    public static BaseCommand defineCommand(HttpServletRequest request) {
        String commandKey = request.getParameter(RequestParamsEnum.COMMAND.getValue());
        if (commandKey == null || commandKey.isEmpty()) { // если выполняется это условие - значит пришел запрос на открытие сайта
            commandKey = CommandsEnum.SIGN_IN_COMMAND.getCommand();
        }
        return COMMAND_LIST.get(commandKey);
    }

}

