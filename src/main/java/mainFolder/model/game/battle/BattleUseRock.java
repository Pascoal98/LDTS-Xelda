package mainFolder.model.game.battle;

import mainFolder.model.game.elements.Hero;
import mainFolder.model.game.elements.Monster;

public class BattleUseRock extends Battle{


    public BattleUseRock() {
    }

    public void useRock() {
        int monsterMove = randomMove();

        if(moves.get(monsterMove).equals("Paper")) {
            hero.decreaseEnergy();
        }
        if(moves.get(monsterMove).equals("Scissors")) {
            monster.decreaseEnergy();
        }
    }
}
