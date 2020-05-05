package ru.job4j.tracker;

public class CreateFindByName implements UserAction {
    private static String msg = "question";

    @Override
    public String name() {
        return "=== Find items by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String key = input.askStr(msg);
        Item[] result = tracker.findByName(key);
        for (Item i : result) {
            System.out.println(i);
        }
        return true;
    }
}
