package adapter.after;

import adapter.after.security.LoginHandler;
import adapter.after.security.UserDetailsService;

public class App {

    public static void main(String[] args) {
        AccountService accountService  = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("호순", "호순");
        System.out.println("login = " + login);
    }
}
