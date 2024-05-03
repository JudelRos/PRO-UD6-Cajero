import java.util.Scanner;

import net.hiperdino.Cashier;
import net.hiperdino.Menu;

public class App {
    public static void main(String[] args) throws Exception {
        final Scanner SC = new Scanner(System.in);
        Cashier cashier = new Cashier(000);
        Menu menu = new Menu();
        do {
            menu.showMenu();
            int menuSelection = SC.nextInt();

            switch (menuSelection) {
                case 1:
                    cashier.openCashier();
                    break;
                case 2:
                    cashier.addClientToQ();
                    break;
                case 3:
                    cashier.attendClient();
                    break;
                case 4:
                    cashier.showClientsQ();
                    break;
                case 0:
                    boolean emptyQ = cashier.isThereClients();
                    if (!emptyQ) {
                        System.out.println("There are still clients in the Q");
                        break;
                    } else {
                        SC.close();
                        System.out.println("Thank you for using HiperDino services.");
                        return;
                    }
                default:
                    break;
            }
        } while (true);
    }
}