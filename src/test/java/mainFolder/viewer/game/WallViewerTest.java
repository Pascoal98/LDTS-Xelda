package mainFolder.viewer.game;

import mainFolder.gui.GUI;
import mainFolder.model.game.elements.Wall;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class WallViewerTest {

    @Test
    public void testWallViewerImplementsElementViewer() {
        WallViewer viewer = new WallViewer();
        assertTrue(viewer instanceof ElementViewer);
    }
    @Test
    public void testWallViewerDraw() {
        GUI gui = mock(GUI.class);
        WallViewer viewer = new WallViewer();
        Wall wall = new Wall(10, 20);
        viewer.draw(wall, gui);
        verify(gui).drawWall(wall.getPosition());
    }
    @Test
    public void testWallViewerDrawException() {
        GUI gui = mock(GUI.class);
        doThrow(new RuntimeException()).when(gui).drawWall(any());
        WallViewer viewer = new WallViewer();
        Wall wall = new Wall(10, 20);
        try {
            viewer.draw(wall, gui);
            fail("Expected exception to be thrown");
        } catch (RuntimeException e) {
            // expected behavior
        }
    }

}