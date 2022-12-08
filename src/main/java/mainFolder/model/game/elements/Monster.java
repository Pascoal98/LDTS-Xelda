package mainFolder.model.game.elements;

import com.googlecode.lanterna.graphics.TextGraphics;

public class Monster extends Element {

    private int energy;
    public Monster(int x, int y) {
        super(x, y);
        this.energy = 5;
    }

    public void decreaseEnergy() {
        this.energy--;
    }
}
