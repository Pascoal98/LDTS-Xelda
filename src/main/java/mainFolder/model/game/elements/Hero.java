package mainFolder.model.game.elements;

import mainFolder.model.game.Inventory;

public class Hero extends Element{
    private int MAX_HEALTH = 10;
    private int health;
    private Inventory inventory;
    public Hero(int x, int y) {
        super(x, y);
        this.health = 10;
        this.inventory = new Inventory();
    }

    public void decreaseHealth() {
        this.health--;
    }

    public int getHealth() {
        return health;
    }

}
