package mainFolder.controller.game;

import mainFolder.Start;
import mainFolder.controller.Controller;
import mainFolder.gui.GUI;
import mainFolder.model.menu.BattleMenu;
import mainFolder.model.game.labyrinth.LoaderLabyrinthBuilder;
import mainFolder.states.GameState;

import java.io.IOException;

public class BattleController extends Controller<BattleMenu> {

    public BattleController(BattleMenu model) {
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
                if (getModel().isSelectedRock()) game.setState(null);
                if (getModel().isSelectedPaper()) game.setState(new GameState(new LoaderLabyrinthBuilder(1).createLabyrinth()));
                if (getModel().isSelectedScissors()) game.setState(new GameState(new LoaderLabyrinthBuilder(1).createLabyrinth()));
        }
    }
}
