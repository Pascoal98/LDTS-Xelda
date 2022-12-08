package mainFolder.model.game.battle;

import mainFolder.model.game.elements.Hero;
import mainFolder.model.game.elements.Monster;

public class Battle {

    Hero hero;
    Monster monster;

    private int turns;

    public void createBattle(Hero hero, Monster monster) {
        this.hero = hero;
        this.monster = monster;
        this.turns = 0;
    }


}
