package net.hiperdino;

public class Menu {
    final String MENU = """
            ****************SUPERMERCADO HIPERDINO****************
            --- MENU DE USUARIO ---
                1.- Open cashier
                2.- Add new client
                3.- Attend client
                4.- Show unnattended clients
                0.- Close supermarket
            -------------------------
                """;

    public void showMenu() {
        System.out.println(MENU);
    }

}
