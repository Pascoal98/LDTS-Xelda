package mainFolder.model.menu;

import mainFolder.model.game.items.Item;

import java.util.ArrayList;
import java.util.List;

public class InventoryMenu {
    private List<String> entries;
    private int currentEntry = 0;
    private List<String> quantities;
    private List<Item> items;

    public InventoryMenu(List<Item> items) {
        this.entries = new ArrayList<>();
        this.quantities = new ArrayList<>();
        this.items = items;
        fillEntries();
        fillQuantities();
    }

    public void fillEntries() {
        for(Item item : items) {
            this.entries.add(item.getName());
        }
        this.entries.add("Exit");
    }

    public void fillQuantities() {
        for(Item item : items) {
            this.quantities.add(Integer.toString(item.getQuantity()));
        }
    }

    public void nextEntry() {
        currentEntry++;
        if(currentEntry > this.entries.size() - 1)
            currentEntry = 0;
    }

    public void previousEntry() {
        currentEntry--;
        if(currentEntry < 0)
            currentEntry = this.entries.size() - 1;
    }

    public String getEntry(int i) {
        return entries.get(i);
    }

    public String getEntryQuantity(int i) {
        //need this condition because entries has 1 more element : "Exit"
        if(i >= quantities.size())
            return null;
        return quantities.get(i);
    }
    public boolean isSelected(int i) {
        return currentEntry == i;
    }

    public int getNumberEntries() {
        return this.entries.size();
    }

    public boolean isSelectedHealthPotion() {
        return entries.get(currentEntry).equals("Health Potion");
    }

    public boolean isSelectedExtraHealth() {
        return entries.get(currentEntry).equals("Extra Health Potion");
    }

    public boolean isSelectedExit() {
        return entries.get(currentEntry).equals("Exit");
    }

    public String addString(int i) {
        if(i >= quantities.size()) {
            return getEntry(i);
        }
        return (getEntry(i) + "(" + getEntryQuantity(i) + ")");
    }
}