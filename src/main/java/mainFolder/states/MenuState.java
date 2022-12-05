package mainFolder.states;

import mainFolder.controller.Controller;
import mainFolder.controller.menu.MenuController;
import mainFolder.model.menu.Menu;
import mainFolder.viewer.Viewer;
import mainFolder.viewer.menu.MenuViewer;

public class MenuState extends State<Menu>{
    public MenuState(Menu model) {
        super(model);
    }

    @Override
    protected Viewer<Menu> getViewer() {
        return new MenuViewer(getModel());
    }

    @Override
    protected Controller<Menu> getController() {
        return new MenuController(getModel());
    }
}
