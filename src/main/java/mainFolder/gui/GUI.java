package mainFolder.gui;

import mainFolder.model.Position;
import mainFolder.model.game.elements.Door;

import java.io.IOException;

public interface GUI {
    ACTION getNextAction() throws IOException;

    void drawCoin(Position position);

    void drawDoor(Position position);

    void drawHero(Position position);

    void drawWall(Position position);

    void drawMonster(Position position);

    void drawText(Position position, String text, String color);

    void clear();

    void refresh() throws IOException;

    void close() throws IOException;

    enum ACTION {UP, RIGHT, DOWN, LEFT, NONE, QUIT, SELECT}

}
