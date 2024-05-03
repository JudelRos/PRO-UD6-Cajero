## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## What is this project?

This app refers to a cashier simulator where a random client
packs a random amount of supermarket items into a virtual kart and waits
in a queue of other clients until its his turn for cashing out their basket.
The cashier will attend the customers one by one and wont be able to get
closed until there are no more clients on the queue.

## How can i use this app?

![HIPERDINO](https://raw.githubusercontent.com/JudelRos/PRO-UD6-Cajero/main/assets/Menu_Hiperdino.png)

1. **Open cashier** - Opens a new cashier for clients to check out, if there is no cashier open, clients cannot form a new queue.
2. **Add new client** - Generates a new client with a random amount of products linked to them through a cart and a random name attached to them from a set list.
3. **Attend client** - Selects the first client in the queue, shows information about his name and checks him out from the list.
4. **Show unnatended clients** - Prints a list of clients who are already in the queue but haven't been attended by the cashier yet.
5. **Close supermarket** - Closes the supermarket by exiting the application. Can only be done if there are no more clients in the queue.
