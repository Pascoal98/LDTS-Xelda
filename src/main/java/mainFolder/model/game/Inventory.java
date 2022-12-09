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

    public int getSize() {
        return this.size;
    }

    public boolean itemInInventory(Item item) {
        return items.contains(item);
    }


    //TODO: display message saying inventory is full
    public void addItem(Item item) {
        if(size >= Inventory.MAX_SIZE)
            return;
        items.add(item);
        size++;
    }

    public Item getItem(Item item) {
        if(itemInInventory(item)) {
            for(Item i : items) {
                if(item.equals(i))
                    return i;
            }
        }
        return null;
    }

    public void useItem(Item item) {
        Item it = getItem(item);
        if(it.getQuantity() == 1) {
            this.items.remove(it);
            this.size--;
        }
        it.setQuantity(it.getQuantity()-1);
    }

    public List<Item> getAllItems() {
        List<Item> it = new ArrayList<>();
        for(Item i : items) {
            it.add(i);
        }
        return it;
    }
}