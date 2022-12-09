package mainFolder.model.game.labyrinth;


import mainFolder.model.game.elements.*;
import mainFolder.model.Position;
import mainFolder.gui.LanternaGUI;
import mainFolder.model.game.items.ExtraHealthPotion;
import mainFolder.model.game.items.HealthPotion;
import mainFolder.model.game.items.Item;

import java.util.ArrayList;
import java.util.List;

public class Labyrinth {

    private List<Coin> coins;

    private List<Door> doors;
    private int width;
    private int height;
    private Hero hero;

    private List<Monster> monsters;

    private List<Wall> walls;
    private boolean flag = true;

    public Labyrinth(int width, int height) {
        this.width = width;
        this.height = height;
        hero = new Hero(10,10);
        this.walls = createWalls();
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
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
    public boolean canHeroMove(Position position) { //isEmpty do prof
        for(Wall wall : walls) {
            if (wall.getPosition().equals(position))
                return false;
        }
        return true;
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public List<Monster> getMonsters() {
        return monsters;
    }

    public void setMonsters(List<Monster> monsters) {
        this.monsters = monsters;
    }

    public List<Wall> getWalls() {
        return walls;
    }

    public void setWalls(List<Wall> walls) {
        this.walls = walls;
    }

    public boolean isMonster(Position position) {
        for (Monster monster : monsters)
            if (monster.getPosition().equals(position))
                return true;
        return false;
    }
    public List<Door> getDoors() {return doors;}
    public void setDoors(List<Door> doors) {this.doors = doors;}
    public List<Coin> getCoins(){return coins;}
    public void setCoins(List<Coin> coins) {this.coins = coins;}
}
