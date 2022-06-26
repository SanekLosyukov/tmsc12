package by.teachmeskills.eshop.commands;

import by.teachmeskills.eshop.exceptions.CommandException;

import javax.servlet.http.HttpServletRequest;

import static by.teachmeskills.eshop.utils.PagesPathEnum.SIGN_IN_PAGE;

public class RedirectToSigninCommandImpl implements BaseCommand {
        @Override
        public String execute(HttpServletRequest request) throws CommandException {
            return SIGN_IN_PAGE.getPath();
        }
    }
