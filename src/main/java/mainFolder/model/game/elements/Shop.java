package mainFolder.model.game.elements;

import mainFolder.model.game.items.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Shop extends Element {

    private final HashMap<Item, Integer> shop;

    public Shop(int x, int y) {
        super(x, y);
        this.shop = new HashMap<>();
        fillShop();
    }

    private void fillShop() {
        shop.put(new Item("Health Potion"), 5);
        shop.put(new Item("Extra Health Potion"), 10);
    }
}
