package mainFolder.model.game.elements;

import mainFolder.model.game.Inventory;
import mainFolder.model.game.items.Item;

public class Hero extends Element{
    private int MAX_HEALTH = 10;
    private int health;
    private Inventory inventory;
    public Hero(int x, int y) {
        super(x, y);
        this.health = 10;
        this.inventory = new Inventory();
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public static int setMaxHealth() {

    }
    public int getMaxHealth() {
        return max;
    }

    public void decreaseHealth() {
        this.health--;
    }

    public int getHealth() {
        return health;
    }

    public void addItem(Item item) {
        inventory.addItem(item);
    }

    public void useItem(Item item) {
        inventory.useItem(item);
    }
}
