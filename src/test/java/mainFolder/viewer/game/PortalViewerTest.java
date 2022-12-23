package mainFolder.viewer.game;

import mainFolder.gui.GUI;
import mainFolder.model.Position;
import mainFolder.model.game.elements.Portal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class PortalViewerTest {

    @Test
    public void testPortalViewerImplementsElementViewer() {
        PortalViewer viewer = new PortalViewer();
        assertTrue(viewer instanceof ElementViewer);
    }
    @Test
    public void testPortalViewerDraw() {
        GUI gui = mock(GUI.class);
        PortalViewer viewer = new PortalViewer();
        Portal portal = new Portal(10, 20);
        viewer.draw(portal, gui);
        verify(gui).drawPortal(portal.getPosition());
    }
    @Test
    public void testPortalViewerDrawException() {
        GUI gui = mock(GUI.class);
        doThrow(new RuntimeException()).when(gui).drawPortal(any());
        PortalViewer viewer = new PortalViewer();
        Portal portal = new Portal(10, 20);
        try {
            viewer.draw(portal, gui);
            fail("Expected exception to be thrown");
        } catch (RuntimeException e) {
            // expected behavior
        }
    }

    @Test
    public void testPortalViewerDrawNullGUI() {
        GUI gui = null;
        PortalViewer viewer = new PortalViewer();
        Portal portal = new Portal(10, 20);
        try {
            viewer.draw(portal, gui);
            fail("Expected exception to be thrown");
        } catch (NullPointerException e) {
            // expected behavior
        }
    }

}