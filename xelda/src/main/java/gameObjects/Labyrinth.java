package gameObjects;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyStroke;

public class Labyrinth {

    private int width;
    private int height;
    private MainCharacter mc;
    private boolean flag = true;

    public Labyrinth(int width, int height) {
        this.width = width;
        this.height = height;
        mc = new MainCharacter(10,10);
    }

    public void draw(TextGraphics graphics) {
        graphics.setBackgroundColor(TextColor.Factory.fromString("#336699"));
        graphics.fillRectangle(new TerminalPosition(0, 0), new TerminalSize(width, height), ' ');
        mc.draw(graphics);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public void processKey(KeyStroke key) {

        switch (key.getKeyType()) {
            case ArrowUp:
                moveHero(mc.moveUp());
                break;
            case ArrowDown:
                moveHero(mc.moveDown());
                break;
            case ArrowLeft:
                moveHero(mc.moveLeft());
                break;
            case ArrowRight:
                moveHero(mc.moveRight());
                break;
            case EOF:
                setFlag(false);
                break;
            case Character:
                if (key.getCharacter() == 'q') setFlag(false);
                break;
        }
        System.out.println(key);
    }

    public void moveHero(Position position) {
        mc.setPosition(position);
    }
}
