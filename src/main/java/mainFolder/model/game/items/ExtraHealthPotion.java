package mainFolder.model.game.items;

public class ExtraHealthPotion extends Item {
    public ExtraHealthPotion() {
        super("Extra Health Potion");
    }

    public void useItem() {
        if(hero.hasItem(this)) {
            hero.setMaxHealth(hero.getMaxHealth()+1);
            hero.setHealth(hero.getHealth()+1);
            hero.useItem(this);
        }
    }
}