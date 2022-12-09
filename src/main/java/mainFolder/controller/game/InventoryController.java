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
                if(getModel().isSelectedExtraHealth()) game.setState(null);
                if(getModel().isSelectedHealthPotion()) game.setState(new GameState(new LoaderLabyrinthBuilder(1).createLabyrinth()));
                if(getModel().isSelectedExit()) game.setState(null);
        }
    }
}
