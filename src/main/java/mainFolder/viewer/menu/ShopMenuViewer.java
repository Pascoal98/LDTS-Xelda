package mainFolder.viewer.menu;

import mainFolder.gui.GUI;
import mainFolder.model.Position;
import mainFolder.model.menu.ShopMenu;
import mainFolder.viewer.Viewer;

public class ShopMenuViewer extends Viewer<ShopMenu> {
    public ShopMenuViewer(ShopMenu model) {
        super(model);
    }

    @Override
    protected void drawElements(GUI gui) {
        gui.drawText(new Position(5,1), "Shop", "#FFFFFF");
        for(int i = 0; i < getModel().getNumberEntries(); i++) {
            gui.drawText(
                    new Position(5,7+i),
                    getModel().getEntry(i),
                    getModel().isSelected(i) ? "#FFD700" : "#FFFFFF");
        }
    }
}
