package mainFolder.viewer.game.elements;

import mainFolder.gui.GUI;
import mainFolder.model.game.elements.Coin;
import mainFolder.viewer.game.CoinViewer;
import mainFolder.viewer.game.ElementViewer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CoinViewerTest {
    @Test
    public void testCoinViewerImplementsElementViewer() {
        CoinViewer viewer = new CoinViewer();
        assertTrue(viewer instanceof ElementViewer);
    }
    @Test
    public void testCoinViewerDraw() {
        GUI gui = mock(GUI.class);
        CoinViewer viewer = new CoinViewer();
        Coin coin = new Coin(10, 20);
        viewer.draw(coin, gui);
        verify(gui).drawCoin(coin.getPosition());
    }
    @Test
    public void testCoinViewerDrawException() {
        GUI gui = mock(GUI.class);
        doThrow(new RuntimeException()).when(gui).drawCoin(any());
        CoinViewer viewer = new CoinViewer();
        Coin coin = new Coin(10, 20);
        try {
            viewer.draw(coin, gui);
            fail("Expected exception to be thrown");
        } catch (RuntimeException e) {
            // expected behavior
        }
    }
}
