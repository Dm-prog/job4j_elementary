package ru.job4j.tracker;



public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        String msg = "";
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(input.askStr(msg));
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = input.askStr(msg);
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
                    String id = input.askStr(msg);
                    Item name = new Item(input.askStr(msg));
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
                String id = input.askStr(msg);
                if (tracker.findById(id).equals(id)) {
                    System.out.println("The item was found");
                } else {
                    System.out.println("The item was not found");
                }
            } else if (select == 5) {
                System.out.println("=== Find items by name ====");
                Item[] result = tracker.findByName("");
                Item key = new Item(input.askStr(msg));
                for (Item i : result) {
                    if (i.equals(key)) {
                        System.out.println(i);
                    } else {
                        System.out.println("Items not found by name");
                    }
                }
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
