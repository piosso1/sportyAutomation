package utils;

import pages.BetPage;
import pages.LoginPage;

public class PageInitalizer {

    public  static LoginPage login;
    public  static BetPage betPage;

    public static void initializePageObjects(){
        login = new LoginPage();
        betPage = new BetPage();
    }
}
