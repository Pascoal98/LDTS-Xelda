package mainFolder.model.menu;

import mainFolder.model.OptionSelector;

import java.util.Arrays;

public class BattleMenu extends OptionSelector {

    public BattleMenu() {
        super(Arrays.asList("Rock", "Paper", "Scissors"));
    }

    public boolean isSelectedRock() {
        return isSelected(0);
    }

    public boolean isSelectedPaper() {
        return isSelected(1);
    }

    public boolean isSelectedScissors() {
        return isSelected(2);
    }
}
