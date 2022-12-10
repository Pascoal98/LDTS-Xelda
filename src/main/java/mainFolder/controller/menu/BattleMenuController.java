package mainFolder.controller.menu;

import mainFolder.Start;
import mainFolder.controller.Controller;
import mainFolder.gui.GUI;
import mainFolder.model.game.battle.BattleUsePaper;
import mainFolder.model.game.battle.BattleUseRock;
import mainFolder.model.game.battle.BattleUseScissors;
import mainFolder.model.game.labyrinth.LoaderLabyrinthBuilder;
import mainFolder.model.menu.BattleMenu;
import mainFolder.states.BattleState;
import mainFolder.states.GameState;

import java.io.IOException;

public class BattleMenuController extends Controller<BattleMenu> {

    public BattleMenuController(BattleMenu model) {
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
                if (getModel().isSelectedRock()) {
                    game.setState(new BattleState(new BattleUseRock()));
                    game.setState(new GameState(new LoaderLabyrinthBuilder(1).load()));
                }
                if (getModel().isSelectedPaper()) game.setState(new BattleState(new BattleUsePaper()));
                if (getModel().isSelectedScissors()) game.setState(new BattleState(new BattleUseScissors()));
        }
    }
}
