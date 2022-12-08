package mainFolder.viewer.game;

import mainFolder.gui.GUI;
import mainFolder.model.Position;
import mainFolder.model.game.Inventory;
import mainFolder.viewer.Viewer;
import mainFolder.viewer.menu.MenuViewer;

public class InventoryViewer extends Viewer<Inventory> {

    public InventoryViewer(Inventory inventory) {
        super(inventory);
    }

    @Override
    protected void drawElements(GUI gui) {
        gui.drawText(new Position(5, 5), "Inventory", "#FFFFFF");

        for(int i = 0; i < getModel().getNumberEntries(); i++)
            gui.drawText(
                    new Position(5, 7+i),
                    getModel().getEntry(i);
                    getModel().isSelected(i) ? "#FFD700" : "FFFFFF"
            );
    }
}
