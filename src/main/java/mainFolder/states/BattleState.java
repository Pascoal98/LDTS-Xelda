package mainFolder.states;

import mainFolder.controller.Controller;
import mainFolder.model.game.battle.Battle;
import mainFolder.viewer.Viewer;

public class BattleState extends State<Battle> {

    public BattleState(Battle battle) {
        super(battle);
    }
    @Override
    protected Viewer<Battle> getViewer() {
        return null;
    }

    @Override
    protected Controller<Battle> getController() {
        return null;
    }
}
