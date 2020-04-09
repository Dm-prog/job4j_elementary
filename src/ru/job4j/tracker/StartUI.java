package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Show all items ====");
                System.out.print("Enter items: ");
                tracker.findAll();
            } else if (select == 2) {
                System.out.println("=== Edit item ====");
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                Item item = new Item(id);
                tracker.replace(id, item);
            } else if (select == 3) {
                System.out.println("=== Create Delete item ====");
                System.out.print("Enter item: ");
                String name = scanner.nextLine();
                tracker.delete(name);
            } else if (select == 4) {
                System.out.println("=== Find item by Id ====");
                System.out.print("Enter name: ");
                String id = scanner.nextLine();
                tracker.delete(id);
            } else if (select == 5) {
                System.out.println("=== Find items by name ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                tracker.findByName(name);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("Show all items");
        System.out.println("Edit item");
        System.out.println("Delete item");
        System.out.println("Find item by Id");
        System.out.println("Find items by name");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
