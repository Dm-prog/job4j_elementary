package ru.job4j.tracker;

import java.util.*;

public class Tracker {

    //private final Item[] items = new Item[100];
    private final List<Item> items = new ArrayList<>();

    private int position = 0;

    public Item add(Item item) {
        item.setId(generateId());
        this.items.set(position++, item);
        return item;
    }

//    public Item[] findAll() {
//        return Arrays.copyOf(items, position);
//    }

    public List<Item> findAll() {
        return items;
    }

//    public Item[] findByName(String key) {
//        int size = 0;
//        Item[] result = new Item[position];
//        for (int index = 0; index < position; index++) {
//            Item item = items[index];
//            if (item.getName().equals(key)) {
//                result[size] = item;
//                size++;
//            }
//        }
//        Arrays.copyOf(result, size);
//        return result;
//    }

    public List<Item> findByName(String key) {
        int size = 0;
        List<Item> result = new ArrayList<>();
        for (int index = 0; index < position; index++) {
            Item item = items.get(index);
            if (item.getName().equals(key)) {
                result.add(item);
                size++;
            }
        }
        Collections.copy(result, items);
        return result;
    }

    public Item findById(String id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < position; index++) {
            if (items.get(index).getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(String id, Item item) {
        boolean result = false;
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            items.add(item);
            result = true;
        }
        return result;
    }

    public boolean delete(String id) {
        int index = indexOf(id);
        if (index != -1) {
            int start = index + 1;
            int distPos = index;
            int size = position - index;
            items.add(null);
            position--;
            System.arraycopy(items, start, items, distPos, size);
        }
        return true;
    }
}
