package gameObjects;

import mainFolder.model.Position;
import mainFolder.model.game.elements.Wall;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class PositionTest {

    private Position position;

    @BeforeEach
    public void helper() {
        this.position = new Position(5, 10);
    }

    @Test
    public void getLeft() {
        Position p = new Position(4, 10);
        Assertions.assertEquals(p, position.getLeft());
    }

    @Test
    public void getRight() {
        Position p = new Position(6, 10);
        Assertions.assertEquals(p, position.getRight());
    }

    @Test
    public void getUp() {
        Position p = new Position(5, 9);
        Assertions.assertEquals(p, position.getUp());
    }

    @Test
    public void getDown() {
        Position p = new Position(5, 11);
        Assertions.assertEquals(p, position.getDown());
    }

    @Test
    public void getRandomNeighbour() {
        List<Position> positions = Arrays.asList(position.getDown(), position.getUp(), position.getLeft(), position.getRight());
        Position p = position.getRandomNeighbour();
        int count = 0;
        for (Position pos : positions) {
            if(p.equals(pos)) {
                count++;
            }
        }
        Assertions.assertNotEquals(p, position);
        Assertions.assertEquals(1, count);
    }

    @Test
    public void getX() {
        Assertions.assertEquals(5, position.getX());
    }

    @Test
    public void setX() {
        position.setX(2);
        Assertions.assertEquals(2, position.getX());
    }

    @Test
    public void getY() {
        Assertions.assertEquals(10, position.getY());
    }

    @Test
    public void setY() {
        position.setY(1);
        Assertions.assertEquals(1, position.getY());
    }

    @Test
    public void equalsTrueDiffObject() {
        Position p = new Position(5, 10);
        Assertions.assertEquals(position, p);
    }

    @Test
    public void equalsTrueSameObject() {
        Assertions.assertEquals(position, position);
    }

    @Test
    public void equalsFalseDiffObject() {
        Position position2 = new Position(5, 20);
        Assertions.assertNotEquals(position, position2);
        Position position3 = new Position(20, 10);
        Assertions.assertNotEquals(position, position3);
    }

    @Test
    public void equalsFalseNull() {
        Assertions.assertNotEquals(position, null);
    }

    @Test
    public void equalsFalseDiffClass() {
        Wall wall = new Wall(5,10);
        Assertions.assertNotEquals(position, wall);
    }

    @Test
    public void test_hashCodeTrue() {
        Position p = new Position(5, 10);
        Assertions.assertNotSame(position, p);
        Assertions.assertEquals(position.hashCode(), p.hashCode());
    }

    @Test
    public void test_hashCodeFalse() {
        Position pos = new Position(30, 40);
        Assertions.assertNotSame(position, pos);
        Assertions.assertNotEquals(position.hashCode(), pos.hashCode());
    }

    @Test
    public void test_hashCodeSame() {
        Assertions.assertEquals(position.hashCode(), position.hashCode());
    }
}