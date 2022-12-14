package mainFolder.controller.game;

import mainFolder.Start;
import mainFolder.controller.Controller;
import mainFolder.gui.GUI;
import mainFolder.model.game.battle.BattleMenu;

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
                    System.out.println(getModel().getHero().getHealth());
                    System.out.println(getModel().getMonster().getHealth());
                }
                if (getModel().isSelectedPaper()) {
                    getModel().usePaper();
                    System.out.println(getModel().getHero().getHealth());
                    System.out.println(getModel().getMonster().getHealth());
                }
                if (getModel().isSelectedScissors()) {
                    getModel().useScissors();
                    System.out.println(getModel().getHero().getHealth());
                    System.out.println(getModel().getMonster().getHealth());
                }
        }
    }
}