package mainFolder.viewer.game;

import mainFolder.gui.GUI;
import mainFolder.model.game.elements.Monster;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class MonsterViewerTest {

    @Test
    public void testMonsterViewerImplementsElementViewer() {
        MonsterViewer viewer = new MonsterViewer();
        assertTrue(viewer instanceof ElementViewer);
    }
    @Test
    public void testMonsterViewerDraw() {
        GUI gui = mock(GUI.class);
        MonsterViewer viewer = new MonsterViewer();
        Monster monster = new Monster(10, 20);
        viewer.draw(monster, gui);
        verify(gui).drawMonster(monster.getPosition());
    }
    @Test
    public void testMonsterViewerDrawException() {
        GUI gui = mock(GUI.class);
        doThrow(new RuntimeException()).when(gui).drawMonster(any());
        MonsterViewer viewer = new MonsterViewer();
        Monster monster = new Monster(10, 20);
        try {
            viewer.draw(monster, gui);
            fail("Expected exception to be thrown");
        } catch (RuntimeException e) {
            // expected behavior
        }
    }
}