package mainFolder.model.menu;

import mainFolder.model.game.items.Item;

import java.util.Arrays;
import java.util.HashMap;

public class ShopMenu extends Menu {

    private final HashMap<String, Integer> shop;

    public ShopMenu(HashMap<String, Integer> shop) {
        super(Arrays.asList("Health Potion", "Extra Health Potion", "Exit"));
        this.shop = shop;
    }

    public boolean isSelectedHealthPotion() {
        return isSelected(0);
    }

    public boolean isSelectedExtraHealthPotion() {
        return isSelected(1);
    }

    public boolean isSelectedExit() {
        return isSelected(2);
    }

    public String addString(int i) {
        if(i == getNumberEntries() - 1)
            return getEntry(i);
        return getEntry(i) + "(" + shop.get(getEntry(i)) + "c)";
    }
}
