package ru.job4j.tracker;

public class CreateFindById implements UserAction {
    private static String msg = "question";

    @Override
    public String name() {
        return "=== Find item by Id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr(msg);
        Item found = tracker.findById(id);
        if (found != null) {
            System.out.println(found);
        } else {
            System.out.println("The item was not found");
        }
        return true;
    }
}
