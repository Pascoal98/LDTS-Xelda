package mainFolder.states;


import mainFolder.controller.Controller;
import mainFolder.controller.game.BattleController;
import mainFolder.model.menu.BattleMenu;
import mainFolder.viewer.Viewer;
import mainFolder.viewer.game.BattleViewer;

public class BattleState extends State<BattleMenu>{

    public BattleState(BattleMenu model) {
        super(model);
    }

    @Override
    protected Viewer<BattleMenu> getViewer() {
        return new BattleViewer(getModel());
    }

    @Override
    protected Controller<BattleMenu> getController() {
        return new BattleController(getModel());
    }
}
