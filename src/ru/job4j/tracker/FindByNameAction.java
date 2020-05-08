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
        for (Item i : result) {
            if (result.length > 0) {
                System.out.println(i);
            } else {
                System.out.println("The item was not found");
            }
        }
        return true;
    }
}
