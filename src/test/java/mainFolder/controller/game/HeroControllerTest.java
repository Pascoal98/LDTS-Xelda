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
    @Test
    public void testMoveHeroLeft() {
        Labyrinth labyrinth = new Labyrinth(5, 5,1,3);
        HeroController controller = new HeroController(labyrinth);
        controller.moveHeroLeft();
        Position expectedPosition = new Position(0, 0).getLeft();
        assertEquals(expectedPosition, controller.getModel().getHero().getPosition());
    }

    @Test
    public void testMoveHeroRight() {
        Labyrinth labyrinth = new Labyrinth(5, 5,1,3);
        HeroController controller = new HeroController(labyrinth);
        controller.moveHeroRight();
        Position expectedPosition = new Position(0, 0).getRight();
        assertEquals(expectedPosition, controller.getModel().getHero().getPosition());
    }

    @Test
    public void testMoveHeroUp() {
        Labyrinth labyrinth = new Labyrinth(5, 5,1,3);
        HeroController controller = new HeroController(labyrinth);
        controller.moveHeroUp();
        Position expectedPosition = new Position(0, 0).getUp();
        assertEquals(expectedPosition, controller.getModel().getHero().getPosition());
    }

    @Test
    public void testMoveHeroDown() {
        Labyrinth labyrinth = new Labyrinth(5, 5,1,3);
        HeroController controller = new HeroController(labyrinth);
        controller.moveHeroDown();
        Position expectedPosition = new Position(0, 0).getDown();
        assertEquals(expectedPosition, controller.getModel().getHero().getPosition());
    }
}