package mainFolder.viewer.menu;

import mainFolder.gui.GUI;
import mainFolder.model.Position;
import mainFolder.model.menu.WinMenu;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class WinMenuViewerTest {
    private WinMenu winMenu;
    private WinMenuViewer winMenuViewer;
    private GUI gui;

    @BeforeEach
    public void setUp() {
        // Create a mock GUI object
        gui = mock(GUI.class);

        // Create a WinMenu object and a WinMenuViewer object
        winMenu = new WinMenu(100);
        winMenuViewer = new WinMenuViewer(winMenu);
    }

    @Test
    public void testDrawElementsDrawsYouWin() {

        // Call the drawElements method on the viewer
        winMenuViewer.drawElements(gui);

        // Verify that the GUI's drawText method was called with the correct arguments
        verify(gui).drawText(new Position(5, 3), "YOU WIN!", "#FFFFFF", "#000000");
    }

    @Test
    public void testDrawElementsDoesNotHighlightUnselectedOptions() {
        // Call the drawElements method on the winMenuViewer
        winMenuViewer.drawElements(gui);

        // Verify that the GUI's drawText method was called with the correct arguments
        // for the unselected "Exit" option
        verify(gui).drawText(new Position(5, 8), "Exit", "#FFFFFF", "#000000");
    }
}