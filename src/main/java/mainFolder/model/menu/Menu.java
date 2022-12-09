package mainFolder.model.menu;

import mainFolder.model.OptionSelector;

import java.util.Arrays;

public class Menu extends OptionSelector {
    public Menu() {
        super(Arrays.asList("Start", "Exit"));
    }

    public boolean isSelectedExit() {
        return isSelected(1);
    }

    public boolean isSelectedStart() {
        return isSelected(0);
    }
}
