package mainFolder.model.game.elements;

import mainFolder.model.game.Inventory;
import mainFolder.model.game.items.Item;

public class Hero extends Element{
    private int max_health;
    private int health;
    private Inventory inventory;
    public Hero(int x, int y) {
        super(x, y);
        this.health = 10;
        this.max_health = 10;
        this.inventory = new Inventory();
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMaxHealth(int max_health) {
        this.max_health = max_health;
    }

    public int getMaxHealth() {
        return this.max_health;
    }

    public void decreaseHealth() {
        this.health--;
    }

    public int getHealth() {
        return this.health;
    }

    public void addItem(Item item) {
        inventory.addItem(item);
    }

    public void useItem(Item item) {
        inventory.useItem(item);
    }
}
