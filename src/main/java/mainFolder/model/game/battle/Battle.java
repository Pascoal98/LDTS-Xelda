package mainFolder.model.game.battle;

import mainFolder.model.game.elements.Hero;
import mainFolder.model.game.elements.Monster;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Battle {

    public Hero hero;
    public Monster monster;

    public Battle(Hero hero, Monster monster) {
        this.hero = hero;
        this.monster = monster;
    }


    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

}
