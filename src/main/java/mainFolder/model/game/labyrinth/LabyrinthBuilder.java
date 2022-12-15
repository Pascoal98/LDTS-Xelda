package mainFolder.model.game.labyrinth;

import mainFolder.model.Position;
import mainFolder.model.game.elements.*;

import java.util.List;

public abstract class LabyrinthBuilder {

    Labyrinth labyrinth;
    public Labyrinth createLabyrinth() {
        labyrinth = new Labyrinth(getWidth(), getHeight(), getLevel(), getMaxLevel());

        labyrinth.setHero(createHero());
        labyrinth.setMonsters(createMonsters());
        labyrinth.setWalls(createWalls());
        labyrinth.setCoins(createCoins());
        labyrinth.setDoors(createDoors());
        labyrinth.setShop(createShop());
        labyrinth.setPortal(createPortal());

        return labyrinth;
    }

    public Labyrinth createLabyrinth(Hero hero) {
        labyrinth = new Labyrinth(getWidth(), getHeight(), getLevel(), getMaxLevel());
        
        hero.setPosition(loadHero());
        labyrinth.setHero(createHero());
        labyrinth.setHero(hero);
        labyrinth.setMonsters(createMonsters());
        labyrinth.setWalls(createWalls());
        labyrinth.setCoins(createCoins());
        labyrinth.setDoors(createDoors());
        labyrinth.setShop(createShop());
        labyrinth.setPortal(createPortal());

        return labyrinth;
    }

    public Labyrinth load() {

        labyrinth.setHero(labyrinth.getHero());
        labyrinth.setMonsters(labyrinth.getMonsters());
        labyrinth.setWalls(labyrinth.getWalls());
        labyrinth.setCoins(labyrinth.getCoins());
        labyrinth.setDoors(labyrinth.getDoors());
        labyrinth.setShop(labyrinth.getShop());
        labyrinth.setPortal(labyrinth.getPortal());
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

    protected abstract Position loadHero();

    protected abstract List<Coin> createCoins();

    protected abstract List<Door> createDoors();

    protected abstract Shop createShop();

    protected abstract int getLevel();

    protected abstract int getMaxLevel();

    protected abstract Portal createPortal();

    protected abstract Key createKey();

}

