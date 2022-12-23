package mainFolder.model.menu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameOverMenuTest {

    private GameOverMenu gameOverMenu;

    @BeforeEach
    void setUp() {
        gameOverMenu = new GameOverMenu(100);
    }

    @Test
    void testStringScore() {
        assertEquals("Score:100", gameOverMenu.stringScore());
    }

    @Test
    void testIsSelectedRetry() {
        gameOverMenu.isSelected(0);
        assertTrue(gameOverMenu.isSelectedRetry());
    }
    /*
    @Test
    void testIsSelectedExit() {
        gameOverMenu.isSelected(1);
        assertTrue(gameOverMenu.isSelectedExit());
    }
    */

}