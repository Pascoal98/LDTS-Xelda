package mainFolder.viewer.game.elements;

import mainFolder.gui.GUI;
import mainFolder.model.game.elements.Door;
import mainFolder.viewer.game.DoorViewer;
import mainFolder.viewer.game.ElementViewer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class DoorViewerTest {
    @Test
    public void testDoorViewerImplementsElementViewer() {
        DoorViewer viewer = new DoorViewer();
        assertTrue(viewer instanceof ElementViewer);
    }
    @Test
    public void testDoorViewerDraw() {
        GUI gui = mock(GUI.class);
        DoorViewer viewer = new DoorViewer();
        Door door = new Door(10, 20);
        viewer.draw(door, gui);
        verify(gui).drawDoor(door.getPosition());
    }
    @Test
    public void testDoorViewerDrawException() {
        GUI gui = mock(GUI.class);
        doThrow(new RuntimeException()).when(gui).drawDoor(any());
        DoorViewer viewer = new DoorViewer();
        Door door = new Door(10, 20);
        try {
            viewer.draw(door, gui);
            fail("Expected exception to be thrown"); //if no execption is thrown, the test is set to fail
        } catch (RuntimeException e) {
            // expected behavior : execption is caught and test passes
        }
    }
}
