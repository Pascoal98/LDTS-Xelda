package mainFolder.model.menu;

import mainFolder.model.game.items.Item;

import java.util.ArrayList;
import java.util.List;

public class InventoryMenu {
    private List<String> entries;
    private int currentEntry = 0;

    private List<Item> items;
    public InventoryMenu(List<Item> items) {
        this.entries = new ArrayList<>();
        this.items = items;
        fillEntries();
    }

    public void fillEntries() {
        List<String> names= new ArrayList<>();
        for(Item item : items) {
            String quant = Integer.toString(item.getQuantity());
            names.add(item.getName() + "(" + quant + ")");
        }
        this.entries.addAll(names);
        this.entries.add("Exit");
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

    public boolean isSelected(int i) {
        return currentEntry == i;
    }

    public int getNumberEntries() {
        return this.entries.size();
    }
}
