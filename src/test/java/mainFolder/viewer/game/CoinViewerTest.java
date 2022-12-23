package mainFolder.viewer.game;

import mainFolder.gui.GUI;
import mainFolder.model.game.elements.Coin;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class CoinViewerTest {

    private Coin coin;
    private CoinViewer viewer;
    private GUI gui;

    @BeforeEach
    void setUp() {
        coin = new Coin(10, 10);
        viewer = new CoinViewer();
        gui = Mockito.mock(GUI.class);
    }

    @Test
    void drawElement() {
        viewer.draw(coin, gui);
        Mockito.verify(gui, Mockito.times(1)).drawHero(coin.getPosition());
    }
}
