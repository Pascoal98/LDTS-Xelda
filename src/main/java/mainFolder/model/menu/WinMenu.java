package mainFolder.model.menu;

import mainFolder.gui.GUI;

import java.util.Arrays;

public class WinMenu extends Menu {

    public WinMenu() {
        super(Arrays.asList("Play New Game", "Exit"));
    }

    public boolean isSelectedPlayNewGame() {
        return isSelected(0);
    }

    public boolean isSelectedExit() {
        return isSelected(1);
    }
}
