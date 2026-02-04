package Generics_04_02_2026;

import java.util.*;

// Abstract base class
abstract class WarehouseItem {
    private String name;

    public WarehouseItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void display();
}

// Concrete items
class Electronics extends WarehouseItem {
    public Electronics(String name) {
        super(name);
    }

    public void display() {
        System.out.println("Electronics: " + getName());
    }
}

class Groceries extends WarehouseItem {
    public Groceries(String name) {
        super(name);
    }

    public void display() {
        System.out.println("Grocery: " + getName());
    }
}

class Furniture extends WarehouseItem {
    public Furniture(String name) {
        super(name);
    }

    public void display() {
        System.out.println("Furniture: " + getName());
    }
}

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }

    // Wildcard method
    public static void displayAll(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            item.display();
        }
    }
}
