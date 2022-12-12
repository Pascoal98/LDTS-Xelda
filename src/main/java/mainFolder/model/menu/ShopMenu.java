package mainFolder.model.menu;

import java.util.Arrays;

public class ShopMenu extends Menu {
    public ShopMenu() {
        super(Arrays.asList("Health Potion", "Extra Health Potion"));
    }

    public boolean isSelectedHealthPotion() {
        return isSelected(0);
    }

    public boolean isSelectedExtraHealthPotion() {
        return isSelected(1);
    }
}
