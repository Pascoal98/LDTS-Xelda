package mainFolder.model.game.labyrinth;

import mainFolder.model.game.elements.Monster;

import java.util.List;

public class LabyrinthSave extends Labyrinth{
    public LabyrinthSave(int width, int height, int level, int maxLevel) {
        super(width, height, level, maxLevel);
        saveMonsters();
    }

    public void saveMonsters() {

        List<Monster> listMons = getMonsters();
    }
}
