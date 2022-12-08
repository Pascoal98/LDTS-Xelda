package mainFolder.states;

import mainFolder.controller.Controller;
import mainFolder.model.game.Inventory;
import mainFolder.viewer.Viewer;
import mainFolder.viewer.menu.InventoryViewer;

public class InventoryState extends State<Inventory> {
    public InventoryState(Inventory inventory) {
        super(inventory);
    }

    @Override
    protected Viewer<Inventory> getViewer() {
        return new InventoryViewer(getModel());
    }

    @Override
    protected Controller<Inventory> getController() {
        return new InventoryController(getModel());
    }
}
