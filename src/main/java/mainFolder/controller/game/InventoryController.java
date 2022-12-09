package mainFolder.controller.game;

import mainFolder.Start;
import mainFolder.controller.Controller;
import mainFolder.gui.GUI;
import mainFolder.model.menu.InventoryMenu;
import java.io.IOException;

public class InventoryController extends Controller<InventoryMenu> {
    public InventoryController(InventoryMenu model) {
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
                //TODO: IMPLEMENT GET...
        }
    }
}
