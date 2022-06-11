package by.teachmeskills.eshop.commands;

import by.teachmeskills.eshop.exceptions.CommandException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class SearchCommandImpl implements BaseCommand {
    @Override
    public String execute(HttpServletRequest request) throws CommandException, ServletException, IOException {
        return null;
    }
}
