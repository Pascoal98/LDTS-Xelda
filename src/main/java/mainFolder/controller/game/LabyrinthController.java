package mainFolder.controller.game;

import mainFolder.Start;
import mainFolder.gui.GUI;
import mainFolder.model.game.labyrinth.Labyrinth;
import mainFolder.model.menu.InventoryMenu;
import mainFolder.model.menu.Menu;
import mainFolder.states.InventoryState;
import mainFolder.states.MenuState;

import java.io.IOException;

public class LabyrinthController extends GameController{

    private final HeroController heroController;
    private final MonsterController monsterController;


    public LabyrinthController(Labyrinth labyrinth) {
        super(labyrinth);

        this.heroController = new HeroController(labyrinth);
        this.monsterController = new MonsterController(labyrinth);
    }

    public void step(Start game, GUI.ACTION action, long time) throws IOException {
        if (action == GUI.ACTION.QUIT || getModel().getHero().getHealth() == 0)
            game.setState(new MenuState(new Menu()));
        else if(action == GUI.ACTION.INVENTORY)
            game.setState(new InventoryState(new InventoryMenu(getModel().getHero().getItems())));
        else {
            heroController.step(game, action, time);
            monsterController.step(game, action, time);
        }
    }
}

