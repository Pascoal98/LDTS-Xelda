package mainFolder.controller.game;

import mainFolder.model.Position;
import mainFolder.model.game.elements.Hero;
import mainFolder.model.game.elements.Wall;
import mainFolder.model.game.labyrinth.Labyrinth;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HeroControllerTest {
    private HeroController controller;
    private Hero hero;
    private Labyrinth labyrinth;

    @BeforeEach
    void setUp() {
        labyrinth = new Labyrinth(10, 10,1,3);

        hero = new Hero(5, 5);
        labyrinth.setHero(hero);

        labyrinth.setWalls(Arrays.asList());
        labyrinth.setMonsters(Arrays.asList());

        controller = new HeroController(labyrinth);
    }

    @Test
    void moveHeroRightEmpty() {
        controller.moveHeroRight();
        assertEquals(new Position(6, 5), hero.getPosition());
    }

    @Test
    void moveHeroRightNotEmpty() {
        labyrinth.setWalls(Arrays.asList(new Wall(6, 5)));
        controller.moveHeroRight();
        assertEquals(new Position(5, 5), hero.getPosition());
    }
}