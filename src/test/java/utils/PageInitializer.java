package utils;

import pages.AddEmployeePage;
import pages.LoginValidationPage;

public class PageInitializer {
    public static LoginValidationPage loginValidationPage;

    public static AddEmployeePage addEmployeePage;

    public static void activatePageObjects() {

        loginValidationPage = new LoginValidationPage();

        addEmployeePage = new AddEmployeePage();
    }

}
