package mainFolder.model.game.battle;

public class BattleUsePaper extends Battle{

    public BattleUsePaper() {
    }

    public void usePaper() {
        int monsterMove = randomMove();

        if(moves.get(monsterMove).equals("Rock")) {
            monster.decreaseEnergy();
        }
        if(moves.get(monsterMove).equals("Scissors")) {
            hero.decreaseEnergy();
        }
    }
}
