package mainFolder.model.game.labyrinth;

import mainFolder.model.Position;
import mainFolder.model.game.elements.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class LabyrinthTest {
    Labyrinth labyrinth;

    @BeforeEach
    public void helper() {
        labyrinth = new Labyrinth(20, 10, 1, 3);
    }

    @Test
    public void getLevelTest() {
        Assertions.assertEquals(1, labyrinth.getLevel());
    }

    @Test
    public void getMaxLevel() {
        Assertions.assertEquals(3, labyrinth.getMaxLevel());
    }

    @Test
    public void getPortalTest() {
        Portal portal = new Portal(5, 5);
        labyrinth.setPortal(portal);
        Assertions.assertEquals(portal, labyrinth.getPortal());
    }

    @Test
    public void setPortalTest() {
        Portal portal = new Portal(1, 1);
        labyrinth.setPortal(portal);
        Assertions.assertEquals(portal, labyrinth.getPortal());
        Portal p = new Portal(2, 2);
        labyrinth.setPortal(p);
        Assertions.assertEquals(p, labyrinth.getPortal());
    }

    @Test
    public void getShopTest() {
        Shop shop = new Shop(5, 5);
        labyrinth.setShop(shop);
        Assertions.assertEquals(shop, labyrinth.getShop());
    }

    @Test
    public void setShopTest() {
        Shop shop = new Shop(1, 1);
        labyrinth.setShop(shop);
        Assertions.assertEquals(shop, labyrinth.getShop());
        Shop s = new Shop(2, 2);
        labyrinth.setShop(s);
        Assertions.assertEquals(s, labyrinth.getShop());
    }

    public void canHeroMoveTest() {

    }

    @Test
    public void getHeroTest() {
        Hero hero = new Hero(5, 5);
        labyrinth.setHero(hero);
        Assertions.assertEquals(hero, labyrinth.getHero());
    }

    @Test
    public void setHeroTest() {
        Hero hero = new Hero(1, 1);
        labyrinth.setHero(hero);
        Assertions.assertEquals(hero, labyrinth.getHero());
        Hero h = new Hero(2, 2);
        labyrinth.setHero(h);
        Assertions.assertEquals(h, labyrinth.getHero());
    }

    public void inRangeShopTest() {
        Shop shop = Mockito.mock(Shop.class);
        Hero hero = Mockito.mock(Hero.class);

    }


}
