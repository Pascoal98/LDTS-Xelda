package mainFolder.viewer.game;

import mainFolder.gui.GUI;
import mainFolder.model.game.elements.Shop;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class ShopViewerTest {

    @Test
    public void testShopViewerImplementsElementViewer() {
        ShopViewer viewer = new ShopViewer();
        assertTrue(viewer instanceof ElementViewer);
    }
    @Test
    public void testShopViewerDraw() {
        GUI gui = mock(GUI.class);
        ShopViewer viewer = new ShopViewer();
        Shop shop = new Shop(10, 20);
        viewer.draw(shop, gui);
        verify(gui).drawShop(shop.getPosition());
    }
    @Test
    public void testShopViewerDrawException() {
        GUI gui = mock(GUI.class);
        doThrow(new RuntimeException()).when(gui).drawShop(any());
        ShopViewer viewer = new ShopViewer();
        Shop shop = new Shop(10, 20);
        try {
            viewer.draw(shop, gui);
            fail("Expected exception to be thrown");
        } catch (RuntimeException e) {
            // expected behavior
        }
    }

}