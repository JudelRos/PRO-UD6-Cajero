package net.hiperdino;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Cashier {
    private int cashierNumber;
    private Queue<Client> clientQueue = new LinkedList<>();
    private boolean isOpen = false;

    public Cashier(int cashierNumber) {
        this.cashierNumber = cashierNumber;
        this.isOpen = false;
    }

    /**
     * The function `addClientToQ` adds a `Client` object to a queue.
     * 
     * @param client The `client` parameter is an object of type `Client`, which
     *               represents a client
     *               that you want to add to a queue.
     */
    public void addClientToQ() {
        if (this.isOpen == true) {
            Client client = new Client();
            Random ran = new Random();
            int numberOfProducts = ran.nextInt(1, 12);
            for (int i = 0; i < numberOfProducts; i++) {
                client.addToCart();
            }
            System.out.println("Client added to queue: " + client.getName());
            this.clientQueue.add(client);
        } else {
            System.out.println("The cashier Q isn't open");
        }
    }

    /**
     * The `openCashier` function creates a new stack if it doesn't already exist
     * and prints a message
     * accordingly.
     */
    public void openCashier() {
        if (this.clientQueue == null || !this.isOpen) {
            System.out.print("The cashier has been opened. \n");
            this.isOpen = true;
        } else {
            System.out.print("The cashier is opened already. \n");
        }
    }

    /**
     * The `attendClient` function checks if there are clients in the queue and then
     * attends to the
     * next client by popping them from the queue.
     */
    public void attendClient() {
        if (this.clientQueue.isEmpty()) {
            System.out.println("There are no more clients in the queue");
        } else {
            Client client = this.clientQueue.remove();
            System.out.println("The attended client is " + client.getName());
        }
    }

    public boolean isThereClients() {
        return this.clientQueue.isEmpty();
    }

    /**
     * The `showClientsQ` method iterates through a queue of clients and prints
     * their names if they are
     * still in the queue.
     */
    public void showClientsQ() {
        Iterator<Client> value = this.clientQueue.iterator();
        while (value.hasNext()) {
            System.out.println(Client.class.cast(value.next()).getName() + " is still in queue.");
        }
        if (this.clientQueue.isEmpty()) {
            System.out.println("There are no clients in the queue.");
        }
    }

    /**
     * The `getClientList` function generates a list of client names from a queue of
     * Client objects.
     * 
     * @return The `getClientList` method returns a string containing a list of
     *         client names enclosed
     *         in angle brackets, with each name separated by a new line character.
     */
    private String getClientList() {
        String clientNames = "";
        Iterator<Client> value = this.clientQueue.iterator();
        while (value.hasNext()) {
            String generatedName = "<" + Client.class.cast(value.next()).getName() + ">";
            clientNames += generatedName + "\n";
        }
        return clientNames;
    }

    /**
     * Overrides the function toString to obtain information about the required
     * object
     * matching the professor enquires.
     */
    @Override
    public String toString() {
        return "* Número de caja: " + "< " + this.cashierNumber + " > \n" + "* Total de clientes: " + "< "
                + this.clientQueue.size() + " > \n" + "* Clientes en la fila: \n" + getClientList();
    }

}
