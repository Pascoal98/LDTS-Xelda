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
        gui.drawText(new Position(5,2), "Shop", "#FFFFFF");
        gui.drawText(new Position(5,4), getModel().stringCoins(), "#FFFFFF");
        gui.drawText(new Position(5,5), getModel().stringInventorySpace(), "#FFFFFF");

        for(int i = 0; i < getModel().getNumberEntries(); i++) {
            gui.drawText(
                    new Position(5,7+i),
                    getModel().addString(i),
                    getModel().isSelected(i) ? "#FFD700" : "#FFFFFF");
        }
    }
}
