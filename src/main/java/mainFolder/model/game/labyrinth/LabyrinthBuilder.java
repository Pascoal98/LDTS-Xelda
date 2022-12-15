package mainFolder.model.game.labyrinth;

import mainFolder.model.game.elements.*;

import java.util.List;

public abstract class LabyrinthBuilder {

    Labyrinth labyrinth;
    public Labyrinth createLabyrinth() {
        labyrinth = new Labyrinth(getWidth(), getHeight());

        labyrinth.setHero(createHero());
        labyrinth.setMonsters(createMonsters());
        labyrinth.setWalls(createWalls());
        labyrinth.setCoins(createCoins());
        labyrinth.setDoors(createDoors());
        labyrinth.setShop(createShop());
        labyrinth.setKey(createKey());

        return labyrinth;
    }

    public Labyrinth getLabyrinth() {
        return labyrinth;
    }

    public void setLabyrinth(Labyrinth labyrinth) {
        this.labyrinth = labyrinth;
    }

    protected abstract int getWidth();

    protected abstract int getHeight();

    protected abstract List<Wall> createWalls();

    protected abstract List<Monster> createMonsters();

    protected abstract Hero createHero();

    protected abstract List<Coin> createCoins();

    protected abstract List<Door> createDoors();

    protected abstract Shop createShop();

    protected abstract Key createKey();
}

