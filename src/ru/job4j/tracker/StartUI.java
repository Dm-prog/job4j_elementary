package ru.job4j.tracker;


public class StartUI {
    private static String msg = "question";
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void createFindAll(Tracker tracker) {
        System.out.println("=== Show all items ====");
        Item[] result = tracker.findAll();
        for (Item i : result) {
            System.out.println(i);
        }
    }

    public static void replaceItem(Input input, Tracker tracker) {
        if (tracker.replace("id", new Item("Ivan"))) {
            String id = input.askStr(msg);
            Item name = new Item(input.askStr(msg));
            tracker.replace(id, name);
            System.out.println("The replacement was made successfully");
        } else {
            System.out.println("No replacement can be made");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        if (tracker.delete("id")) {
            System.out.println("Deletion was performed successfully");
        } else {
            System.out.print("deletion cannot be performed");
        }
    }

    public static void createFindById(Input input, Tracker tracker) {
        System.out.println("=== Find item by Id ====");
        System.out.print("Enter Id: ");
        String id = input.askStr(msg);
        if (tracker.findById(id).equals(id)) {
            System.out.println("The item was found");
        } else {
            System.out.println("The item was not found");
        }
    }

    public static void createFfindByName(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ====");
        Item[] result = tracker.findByName(msg);
        Item key = new Item(input.askStr(msg));
        for (Item i : result) {
            if (i.equals(key)) {
                System.out.println(i);
            } else {
                System.out.println("Items not found by name");
            }
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.createFindAll(tracker);
            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.createFindById(input, tracker);
            } else if (select == 5) {
                StartUI.createFfindByName(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }


    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
