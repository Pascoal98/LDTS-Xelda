package mainFolder.model.menu;

import java.util.Arrays;

public class BattleMenu extends Menu {

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
