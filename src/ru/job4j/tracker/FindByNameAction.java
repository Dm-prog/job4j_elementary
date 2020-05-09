package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find items by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String key = input.askStr("Enter name: ");
        Item[] result = tracker.findByName(key);
        if (result.length > 0) {
            for (Item i : result) {
                System.out.println(i);
            }
        } else {
            System.out.println("The item was not found");
        }
        return true;
    }
}
