package mainFolder.controller.menu;

import mainFolder.Start;
import mainFolder.controller.Controller;
import mainFolder.gui.GUI;
import mainFolder.model.game.labyrinth.LoaderLabyrinthBuilder;
import mainFolder.model.menu.ShopMenu;
import mainFolder.states.GameState;
import mainFolder.states.MenuState;

import java.io.IOException;

public class ShopMenuController extends Controller<ShopMenu> {

    public ShopMenuController(ShopMenu model) {
        super(model);
    }

    @Override
    public void step(Start game, GUI.ACTION action, long time) throws IOException {

        switch (action) {
            case UP:
                getModel().previousEntry();
                break;
            case DOWN:
                getModel().nextEntry();
                break;
            case SELECT:
                if(getModel().isSelectedHealthPotion()) game.setState(null);
                if(getModel().isSelectedExtraHealthPotion()) game.setState(new GameState(new LoaderLabyrinthBuilder(1).createLabyrinth()));
                if(getModel().isSelectedExit()) game.setState(new GameState(getModel().getLabyrinth()));
        }

    }
}
