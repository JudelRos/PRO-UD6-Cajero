package net.hiperdino;

import java.util.Iterator;
import java.util.Stack;

public class Cashier {
    private int cashierNumber;
    private int totalPrice;
    private Stack<Client> queue;

    public Cashier(int cashierNumber) {
        this.cashierNumber = cashierNumber;
        this.totalPrice = 0;

    }

    /**
     * The function `addClientToQ` adds a `Client` object to a queue.
     * 
     * @param client The `client` parameter is an object of type `Client`, which represents a client
     * that you want to add to a queue.
     */
    public void addClientToQ(Client client) {
        queue.add(client);
    }

    /**
     * The `openCashier` function creates a new stack if it doesn't already exist and prints a message
     * accordingly.
     */
    public void openCashier() {
        if (this.queue == null) {
            this.queue = new Stack<>();
            System.out.print("The cashier has been opened.");
        } else {
            System.out.print("The cashier is opened already");
        }
    }

    /**
     * The `attendClient` function checks if there are clients in the queue and then attends to the
     * next client by popping them from the queue.
     */
    public void attendClient() {
        if (this.queue.empty()) {
            System.out.println("There are no more clients in the queue");
        } else {
            Client client = this.queue.pop();
            System.out.println("The attended client is " + client.getName());
        }
    }

    /**
     * The `showClientsQ` method iterates through a queue of clients and prints their names if they are
     * still in the queue.
     */
    public void showClientsQ() {
        Iterator<Client> value = this.queue.iterator();
        while (value.hasNext()){
            System.out.println(Client.class.cast(value.next()).getName() + "is still in queue.");
        } if (this.queue.empty()){
            System.out.println("There are no clients in the queue.");
        }
    }

    /**
     * The `getClientList` function generates a list of client names from a queue of Client objects.
     * 
     * @return The `getClientList` method returns a string containing a list of client names enclosed
     * in angle brackets, with each name separated by a new line character.
     */
    private String getClientList() {
        String clientNames = "";
        Iterator<Client> value = this.queue.iterator();
        while (value.hasNext()){
            String generatedName = "<" + Client.class.cast(value.next()).getName() + ">";
            clientNames += generatedName + "\n";
        }
        return clientNames;
    }

    @Override
    public String toString(){
        return "* Número de caja: " + "< " + this.cashierNumber + " > \n" + "* Total de clientes: " + "< " + this.queue.size() + " > \n" + "* Clientes en la fila: \n" + getClientList(); 
    }

}
