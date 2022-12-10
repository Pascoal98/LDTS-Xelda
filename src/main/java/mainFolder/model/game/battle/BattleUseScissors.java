package mainFolder.model.game.battle;

import mainFolder.model.game.elements.Hero;
import mainFolder.model.game.elements.Monster;

import java.util.Arrays;
import java.util.List;

public class BattleUseScissors extends Battle{


    public BattleUseScissors() {
    }

    public void useScissors() {
        int monsterMove = randomMove();

        if(moves.get(monsterMove).equals("Paper")) {
            monster.decreaseEnergy();
        }
        if(moves.get(monsterMove).equals("Rock")) {
            hero.decreaseEnergy();
        }
    }
}
