package mainFolder.model.game.items;

import mainFolder.model.game.elements.Hero;

public class ExtraHealthPotion extends Item {
    public ExtraHealthPotion(Hero hero) {
        super("Extra Health Potion");
        this.hero = hero;
    }

    public void useItem() {
        hero.setMaxHealth(hero.getMaxHealth()+1);
        hero.setHealth(hero.getHealth()+1);
    }
}