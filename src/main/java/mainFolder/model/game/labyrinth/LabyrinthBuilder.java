package mainFolder.model.game.labyrinth;

import mainFolder.model.game.elements.Hero;
import mainFolder.model.game.elements.Monster;
import mainFolder.model.game.elements.Wall;

import java.util.List;

public abstract class LabyrinthBuilder {
    public Labyrinth createLabyrinth() {
        Labyrinth labyrinth = new Labyrinth(getWidth(), getHeight());

        labyrinth.setHero(createHero());
        labyrinth.setMonsters(createMonsters());
        labyrinth.setWalls(createWalls());

        return labyrinth;
    }

    protected abstract int getWidth();

    protected abstract int getHeight();

    protected abstract List<Wall> createWalls();

    protected abstract List<Monster> createMonsters();

    protected abstract Hero createHero();
}

