package gameObjects;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyStroke;

import java.util.ArrayList;
import java.util.List;

public class Labyrinth {

    private int width;
    private int height;
    private MainCharacter mc;
    private List<Wall> walls;
    private boolean flag = true;

    public Labyrinth(int width, int height) {
        this.width = width;
        this.height = height;
        mc = new MainCharacter(10,10);
        this.walls = createWalls();
    }

    public void draw(TextGraphics graphics) {
        graphics.setBackgroundColor(TextColor.Factory.fromString("#222222"));
        graphics.fillRectangle(new TerminalPosition(0, 0), new TerminalSize(width, height), ' ');
        for(Wall wall : walls)
            wall.draw(graphics);
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

    private List<Wall> createWalls() {
        List<Wall> walls = new ArrayList<>();

        for (int c = 0; c < width; c++) {
            walls.add(new Wall(c, 0));
            walls.add(new Wall(c, height - 1));
        }
        for (int r = 1; r < height - 1; r++) {
            walls.add(new Wall(0, r));
            walls.add(new Wall(width - 1, r));
        }

        return walls;
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

    public boolean canHeroMove(Position position) {
        for(Wall wall : walls) {
            if (wall.getPosition().equals(position))
                return false;
        }
        return true;
    }

    public void moveHero(Position position) {
        if(canHeroMove(position))
            mc.setPosition(position);
    }
}
