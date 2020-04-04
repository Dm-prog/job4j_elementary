package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {

    private final Item[] items = new Item[100];

    private int position = 0;

    public Item add(Item item) {
        item.setId(generateId());
        this.items[position++] = item;
        return item;
    }

    public Item[] findAll() {
        int size = 0;
        for (int index = 0; index < position; index++) {
            Item item = items[index];
            if (item != null) {
                items[size] = item;
                size++;
            }
        }
        Arrays.copyOf(items, size);
        return items;
    }

    public Item[] findByName(String key) {
        int size = 0;
        Item[] result = new Item[position];
        for (int index = 0; index < position; index++) {
            Item item = items[index];
            if (item.getName().equals(key)) {
                result[size] = item;
                size++;
            }
        }
        Arrays.copyOf(result, size);
        return result;
    }

    public Item findById(String id) {
        Item item = null;
        for (int index = 0; index < position; index++) {
            Item current = items[index];
            if (current.getId().equals(id)) {
                item = current;
                break;
            }
        }
        return item;
    }

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }
}
