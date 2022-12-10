package mainFolder.model.game.battle;

import mainFolder.model.game.elements.Hero;
import mainFolder.model.game.elements.Monster;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Battle {

    Hero hero;
    Monster monster;
    String move;
    final List<String> moves = Arrays.asList("Rock", "Paper", "Scissors");

    public Battle() {

    }

    public int randomMove() {
        return new Random().nextInt(moves.size());
    }
}
