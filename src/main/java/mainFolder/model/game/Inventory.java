package mainFolder.model.game;

import mainFolder.model.Position;
import mainFolder.model.game.items.Item;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private final static int MAX_SIZE = 10;
    private int size;
    private List<Item> items;

    public Inventory() {
        this.items = new ArrayList<>();
        this.size = 0;
    }

    public void setSize(int size) {
        if(size <= MAX_SIZE)
            this.size = size;
    }
    public boolean hasSpace() {
        return size < Inventory.MAX_SIZE;
    }

    public int getSize() {
        return this.size;
    }

    public int getMaxSize() {
        return Inventory.MAX_SIZE;
    }

    public boolean itemInInventory(Item item) {
        return items.contains(item);
    }


    //TODO: display message saying inventory is full
    public void addItem(Item item) {
        if(size >= Inventory.MAX_SIZE)
            return;
        if(items.contains(item)) {
            for(Item it : items) {
                if (it.equals(item)) {
                    it.incrementsQuantity();
                    size++;
                    return;
                }
            }
        }
        items.add(item);
        item.incrementsQuantity();
        size++;
    }

    public Item getItem(String itemName) {
        for(Item i : items) {
            if(itemName.equals(i.getName()))
                return i;
        }
        return null;
    }

    public void useItem(String itemName) {
        Item it = getItem(itemName);
        it.useItem();
        if(it.getQuantity() == 1) {
            this.items.remove(it);
        }
        this.size--;
        it.setQuantity(it.getQuantity()-1);
    }

    public List<Item> getAllItems() {
        List<Item> it = new ArrayList<>();
        it.addAll(items);
        return it;
    }

    public List<String> getItemsNames() {
        List<String> names = new ArrayList<>();
        for(Item item : items) {
            names.add(item.getName());
        }
        return names;
    }
}