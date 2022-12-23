package mainFolder.viewer.game;

import mainFolder.gui.GUI;
import mainFolder.model.game.elements.Door;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class DoorViewerTest {

    private Door door;
    private DoorViewer viewer;
    private GUI gui;

    @BeforeEach
    void setUp() {
        door = new Door(15, 10);
        viewer = new DoorViewer();
        gui = Mockito.mock(GUI.class);
    }

    @Test
    void drawElement() {
        viewer.draw(door, gui);
        Mockito.verify(gui, Mockito.times(1)).drawHero(door.getPosition());
    }
}
