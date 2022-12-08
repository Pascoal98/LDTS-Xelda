package mainFolder.model.game.elements;

public class Hero extends Element{
    private int energy;

    private boolean isBattle = false;

    public Hero(int x, int y) {
        super(x, y);
        this.energy = 10;
    }

    public void decreaseEnergy() {
        this.energy--;
    }

    public int getEnergy() {
        return energy;
    }

    public void initBattle(Boolean bool) {
        this.isBattle = bool;
    }

    public boolean getBattle() {return isBattle;}
}
