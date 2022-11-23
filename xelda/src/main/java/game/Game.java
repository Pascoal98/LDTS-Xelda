package game;

import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;
import gameObjects.Labyrinth;

import java.io.IOException;

public class Game {

    private static Screen screen;
    private Labyrinth lab;
    public Game() {

        lab = new Labyrinth(40,20);

        try {
            TerminalSize terminalSize = new TerminalSize(lab.getWidth(), lab.getHeight());
            DefaultTerminalFactory terminalFactory = new DefaultTerminalFactory().setInitialTerminalSize(terminalSize);
            Terminal terminal = terminalFactory.createTerminal();

            screen = new TerminalScreen(terminal);
            screen.setCursorPosition(null); // we don't need a cursor
            screen.startScreen(); // screens must be started
            screen.doResizeIfNecessary(); // resize screen is necessary


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void processKey(KeyStroke key) {
        lab.processKey(key);
    }

    private void draw() throws IOException {
        screen.clear();
        lab.draw(screen.newTextGraphics());
        screen.refresh();
    }

    public void startGame() {
        while(lab.getFlag()) {
            try {
                KeyStroke key = screen.readInput();
                processKey(key);
                draw();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            screen.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
