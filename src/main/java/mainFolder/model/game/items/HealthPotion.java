package mainFolder.model.game.items;

import mainFolder.model.game.elements.Hero;

public class HealthPotion extends Item {
    public HealthPotion() {
        super("Health Potion");
    }

    public void useItem() {
        hero.setHealth(hero.getMaxHealth());
    }
}
