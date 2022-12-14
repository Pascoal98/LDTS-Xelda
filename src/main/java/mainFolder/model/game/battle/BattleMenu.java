package mainFolder.model.game.battle;

import mainFolder.model.game.elements.Hero;
import mainFolder.model.game.elements.Monster;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BattleMenu extends Battle{

    private int currentEntry = 0;

    private final List<String> entries = Arrays.asList("Rock", "Paper", "Scissors");

    public BattleMenu(Hero hero, Monster monster) {
        super(hero, monster);
    }

    public boolean isSelectedRock() {
        return isSelected(0);
    }

    public void useRock() {
        int monsterMove = randomMove();

        if(entries.get(monsterMove).equals("Paper")) {
            hero.decreaseHealth();
        }
        if(entries.get(monsterMove).equals("Scissors")) {
            monster.decreaseHealth();
        }
    }

    public void usePaper() {
        int monsterMove = randomMove();

        if(entries.get(monsterMove).equals("Rock")) {
            monster.decreaseHealth();
        }
        if(entries.get(monsterMove).equals("Scissors")) {
            hero.decreaseHealth();
        }
    }

    public void useScissors() {
        int monsterMove = randomMove();

        if(entries.get(monsterMove).equals("Paper")) {
            monster.decreaseHealth();
        }
        if(entries.get(monsterMove).equals("Rock")) {
            hero.decreaseHealth();
        }
    }

    public boolean isSelectedPaper() {
        return isSelected(1);
    }

    public boolean isSelectedScissors() {
        return isSelected(2);
    }

    public void nextEntry() {
        currentEntry++;
        if (currentEntry > entries.size() - 1)
            currentEntry = 0;
    }

    public void previousEntry() {
        currentEntry--;
        if (currentEntry < 0)
            currentEntry = entries.size() - 1;
    }

    public int getNumberEntries() {
        return entries.size();
    }

    public String getEntry(int i) {
        return entries.get(i);
    }

    public boolean isSelected(int i) {
        return currentEntry == i;
    }

    public int randomMove() {
        return new Random().nextInt(entries.size());
    }

}