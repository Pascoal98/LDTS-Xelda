package gameObjects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PositionTest {

    Position position;

    @BeforeEach
    public void helper() {
        this.position = new Position(5, 10);
    }

    @Test
    public void getX() {
        Assertions.assertEquals(5, position.getX());
    }

    @Test
    public void getY() {
        Assertions.assertEquals(10, position.getY());
    }

    @Test
    public void setX() {
        position.setX(20);
        Assertions.assertEquals(20,position.getX());
    }

    @Test
    public void setY() {
        position.setY(2);
        Assertions.assertEquals(2, position.getY());
    }

    @Test
    public void equalsTrueDiffObject() {
        Position position2 = new Position(5, 10);
        Assertions.assertEquals(position, position2);
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
}
