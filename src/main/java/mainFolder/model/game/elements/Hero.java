package mainFolder.model.game.elements;

import mainFolder.model.game.Inventory;
import mainFolder.model.game.battle.Battle;
import mainFolder.model.game.items.ExtraHealthPotion;
import mainFolder.model.game.items.HealthPotion;
import mainFolder.model.game.items.Item;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.List;


public class Hero extends Element{
    private int max_health;
    private int health;
    private int score;
    private Inventory inventory;
    private boolean isBattle = false;
    public Hero(int x, int y) {
        super(x, y);
        this.health = 10;
        this.max_health = 10;
        this.inventory = new Inventory();
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setMaxHealth(int max_health) {
        this.max_health = max_health;
    }

    public int getMaxHealth() {
        return max_health;
    }

    public void decreaseHealth() {
        health--;
    }

    public void addItem(Item item) {
        inventory.addItem(item);
    }

    public void useItem(Item item) {
        inventory.useItem(item);
    }

    public boolean hasItem(Item item) {
        return inventory.itemInInventory(item);
    }

    public List<Item> getItems() {
        return inventory.getAllItems();
    }

    public void initBattle(Boolean bool) {
        this.isBattle = bool;
    }

    public boolean getBattle() {return isBattle;}

    public void addScore(){ this.score += 10; }

    public int getScore(){return score;}

    public void setScore(int score) {
        this.score = score;
    }

    public boolean inventoryHasSpace() {
        return inventory.hasSpace();
    }

}
