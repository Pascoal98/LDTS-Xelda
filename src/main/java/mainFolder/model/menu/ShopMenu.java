package mainFolder.model.menu;

import mainFolder.model.game.labyrinth.Labyrinth;

import java.util.Arrays;
import java.util.HashMap;

public class ShopMenu extends Menu {

    private final HashMap<String, Integer> shop;

    private Labyrinth labyrinth;
    public ShopMenu(HashMap<String, Integer> shop, Labyrinth labyrinth) {
        super(Arrays.asList("Health Potion", "Extra Health Potion", "Exit"));
        this.labyrinth = labyrinth;
        this.shop = shop;
    }

    public Labyrinth getLabyrinth() {
        return labyrinth;
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
