package mainFolder.viewer.game;

import mainFolder.gui.GUI;
import mainFolder.model.game.elements.Key;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class KeyViewerTest {

    private Key key;
    private KeyViewer viewer;
    private GUI gui;

    @BeforeEach
    void setUp() {
        key = new Key(10, 10);
        viewer = new KeyViewer();
        gui = Mockito.mock(GUI.class);
    }

    @Test
    void drawElement() {
        viewer.draw(key, gui);
        Mockito.verify(gui, Mockito.times(1)).drawHero(key.getPosition());
    }
}
