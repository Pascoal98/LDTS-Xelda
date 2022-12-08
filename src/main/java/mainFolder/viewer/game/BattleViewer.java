package mainFolder.viewer.game;

import mainFolder.gui.GUI;
import mainFolder.model.Position;
import mainFolder.model.menu.BattleMenu;
import mainFolder.viewer.Viewer;


public class BattleViewer extends Viewer<BattleMenu> {

    public BattleViewer(BattleMenu battleMenu) {
        super(battleMenu);
    }
    @Override
    protected void drawElements(GUI gui) {
        gui.drawText(new Position(5,1), "Battle Scene", "#FFFFFF");
        for(int i = 0; i < getModel().getNumberEntries(); i++) {
            gui.drawText(
                    new Position(5, 7 + i),
                    getModel().getEntry(i),
                    getModel().isSelected(i) ? "#FFD700" : "#FFFFFF");
        }
    }
}
