package main;

import accounts.AccountService;
import accounts.UserProfile;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import servlets.UserServlet;

/**
 * @author Sergey Cherepanov on 14.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();

        accountService.addNewUser(new UserProfile("admin"));
        accountService.addNewUser(new UserProfile("test"));

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.addServlet(new ServletHolder(new UserServlet(accountService)), "/api/v1/users");

    }
}
