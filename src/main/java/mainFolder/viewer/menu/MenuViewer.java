package mainFolder.viewer.menu;

import mainFolder.gui.GUI;
import mainFolder.model.Position;
import mainFolder.model.menu.MainMenu;
import mainFolder.viewer.Viewer;

public class MenuViewer extends Viewer<MainMenu> {
    public MenuViewer(MainMenu menu) {
        super(menu);
    }

    @Override
    public void drawElements(GUI gui) {
        gui.drawBackground();
        gui.drawXeldaMenu(getModel().getWhite(),getModel().getGreen(),getModel().getBlue(),getModel().getBrown());
        gui.drawBorder(getModel().getBorder());


        for (int i = 0; i < getModel().getNumberEntries(); i++)
            gui.drawText(
                    new Position(5, 9 + i),
                    getModel().getEntry(i),
                    getModel().isSelected(i) ? "#FFD700" : "#FFFFFF", "#4AAB79");
    }
}
