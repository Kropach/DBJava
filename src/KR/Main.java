package KR;

import KR.DAO.HCRep;
import KR.Services.MainService;
import KR.UI.ConsoleUI;

public class Main {
    public static void main(String[] args) {
        ConsoleUI consoleUI = new ConsoleUI(HCRep.getInstance());
        consoleUI.showMenu();
    }
}
