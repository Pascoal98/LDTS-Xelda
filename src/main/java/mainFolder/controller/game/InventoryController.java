package mainFolder.controller.game;

import mainFolder.Start;
import mainFolder.controller.Controller;
import mainFolder.gui.GUI;
import mainFolder.model.game.labyrinth.LoaderLabyrinthBuilder;
import mainFolder.model.menu.InventoryMenu;
import mainFolder.states.GameState;

import java.io.IOException;

public class InventoryController extends Controller<InventoryMenu> {
    public InventoryController(InventoryMenu model) {
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
                //TODO: FIX "CONDITIONS" TO REAL SOLUTIONS
                if(getModel().isSelectedExtraHealthPotion()) {
                    getModel().useExtraHealthPotion();
                    game.setState(new GameState(getModel().getLabyrinth()));
                }
                if(getModel().isSelectedHealthPotion()) {
                    getModel().useHealthPotion();
                    game.setState(new GameState(getModel().getLabyrinth()));
                }
                if(getModel().isSelectedExit()) game.setState(new GameState(getModel().getLabyrinth()));
        }
    }
}
