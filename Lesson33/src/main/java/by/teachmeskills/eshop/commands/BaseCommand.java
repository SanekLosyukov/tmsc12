package by.teachmeskills.eshop.commands;

import by.teachmeskills.eshop.exceptions.CommandException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public interface BaseCommand {
    String execute(HttpServletRequest request) throws CommandException, ServletException, IOException; //execute - выполнять
}


