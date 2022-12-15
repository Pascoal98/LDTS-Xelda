package mainFolder.controller.game;

import mainFolder.Start;
import mainFolder.controller.Controller;
import mainFolder.gui.GUI;
import mainFolder.model.game.battle.BattleMenu;
import mainFolder.model.game.labyrinth.Labyrinth;
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
                    getModel().useRock();
                }
                if (getModel().isSelectedPaper()) {
                    getModel().usePaper();
                }
                if (getModel().isSelectedScissors()) {
                    getModel().useScissors();
                }
                if(getModel().getHero().getHealth() == 0 || getModel().getMonster().getHealth() == 0) {
                    getModel().getHero().initBattle(false);
                    getModel().getLabyrinth().removeMonster(getModel().getMonster().getPosition());
                    game.setState(new GameState(getModel().getLabyrinth()));
                }
        }
    }
}