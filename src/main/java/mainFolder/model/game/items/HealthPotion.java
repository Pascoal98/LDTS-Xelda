package mainFolder.model.game.items;

import mainFolder.model.game.elements.Hero;

public class HealthPotion extends Item {
    public HealthPotion() {
        super("Health Potion");
    }

    public void useItem() {
        if(hero.hasItem(this)) {
            hero.setHealth(hero.getMaxHealth());
            hero.useItem(this);
        }
    }
}
