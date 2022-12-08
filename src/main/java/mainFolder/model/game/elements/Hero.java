package mainFolder.model.game.elements;

import mainFolder.model.game.Inventory;

public class Hero extends Element{
    private int energy;
    private Inventory inventory;
    public Hero(int x, int y) {
        super(x, y);
        this.energy = 10;
        this.inventory = new Inventory();
    }

    public void decreaseEnergy() {
        this.energy--;
    }

    public int getEnergy() {
        return energy;
    }
}
