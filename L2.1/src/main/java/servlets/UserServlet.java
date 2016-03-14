package servlets;

import accounts.AccountService;

import javax.servlet.http.HttpServlet;

/**
 * @author Sergey Cherepanov on 14.03.2016.
 */
public class UserServlet extends HttpServlet {

    private final AccountService accountService;

    public UserServlet(AccountService accountService) {
        this.accountService = accountService;
    }

    //TODO
}
