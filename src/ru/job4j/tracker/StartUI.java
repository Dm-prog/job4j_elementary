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
                Item[] result = tracker.findAll();
                for (Item i : result) {
                    System.out.println(i);
                }
            } else if (select == 2) {
                if (tracker.replace("", new Item(""))) {
                    String id = scanner.nextLine();
                    Item name = new Item(scanner.nextLine());
                    tracker.replace(id, name);
                    System.out.println("The replacement was made successfully");
                } else {
                    System.out.println("No replacement can be made");
                }
            } else if (select == 3) {
                if (tracker.delete("")) {
                    System.out.println("Deletion was performed successfully");
                } else {
                    System.out.print("deletion cannot be performed");
                }
            } else if (select == 4) {
                System.out.println("=== Find item by Id ====");
                System.out.print("Enter Id: ");
                String id = scanner.nextLine();
                if (tracker.findById(id).equals(id)) {
                    System.out.println("The item was found");
                } else {
                    System.out.println("The item was not found");
                }
            } else if (select == 5) {
                System.out.println("=== Find items by name ====");
                Item[] result = tracker.findByName("");
                Item key = new Item(scanner.nextLine());
                for (Item i : result) {
                    if (i.equals(key)) {
                        System.out.println(i);
                    }
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        for (int i = 0; i < 6; i++) {
            System.out.println("select menu item: " + i);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
