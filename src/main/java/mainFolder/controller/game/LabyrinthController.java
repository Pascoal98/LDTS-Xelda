package mainFolder.controller.game;

import mainFolder.Start;
import mainFolder.gui.GUI;
import mainFolder.model.game.labyrinth.Labyrinth;
import mainFolder.model.menu.*;
import mainFolder.model.game.battle.BattleMenu;
import mainFolder.states.*;

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
        if (action == GUI.ACTION.QUIT)
            game.setState(null);
        else if(getModel().getHero().getHealth() == 0)
            game.setState(new GameOverMenuState(new GameOverMenu()));
        else if(action == GUI.ACTION.INVENTORY)
            game.setState(new InventoryState(new InventoryMenu(getModel().getHero().getItems())));
        else if(action == GUI.ACTION.SHOP) {
            if(getModel().inRangeShop())
                game.setState(new ShopState(new ShopMenu(getModel().getShop().getShop(), getModel(), getModel().getHero())));
        }
        else if(getModel().getHero().getBattle()) {
                game.setState(new BattleMenuState(new BattleMenu(getModel().getHero(), getModel().getMonster(getModel().getHero().getPosition()), getModel())));
        }
        else {
            heroController.step(game, action, time);
            monsterController.step(game, action, time);
        }
    }
}

