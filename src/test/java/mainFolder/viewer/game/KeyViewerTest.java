package mainFolder.viewer.game.elements;

import mainFolder.gui.GUI;
import mainFolder.model.game.elements.Key;
import mainFolder.viewer.game.ElementViewer;
import mainFolder.viewer.game.KeyViewer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class KeyViewerTest {
    @Test
    public void testKeyViewerImplementsElementViewer() {
        KeyViewer viewer = new KeyViewer();
        assertTrue(viewer instanceof ElementViewer);
    }
    @Test
    public void testKeyViewerDraw() {
        GUI gui = mock(GUI.class);
        KeyViewer viewer = new KeyViewer();
        Key key = new Key(10, 20);
        viewer.draw(key, gui);
        verify(gui).drawKey(key.getPosition());
    }
    @Test
    public void testKeyViewerDrawException() {
        GUI gui = mock(GUI.class);
        doThrow(new RuntimeException()).when(gui).drawKey(any());  // configure mock GUI to throw exception
        KeyViewer viewer = new KeyViewer();
        Key key = new Key(10, 20);
        try {
            viewer.draw(key, gui);  // call draw() method
            fail("Expected exception to be thrown");  // if no exception is thrown, fail the test
        } catch (RuntimeException e) {
            // expected behavior: exception is caught and test passes
        }
    }
}
