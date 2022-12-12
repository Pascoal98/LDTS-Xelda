package mainFolder.model.menu;

import com.sun.tools.javac.Main;
import mainFolder.model.Position;

import java.util.List;

public abstract class MenuBuilder {
    public MainMenu createMenu(){
        MainMenu mainMenu = new MainMenu();
        mainMenu.setYellow(createYellow());
        mainMenu.setBlue(createBlue());
        mainMenu.setBrown(createBrown());
        mainMenu.setGreen(createGreen());
        mainMenu.setBorder(createBorder());
        return mainMenu;
    }
    /*
    public GameOverMenu createGameOverMenu(){
        GameOverMenu gameOverMenu = new GameOverMenu();
        gameOverMenu.setBorder(createBorder());
        return gameOverMenu;
    }

    public VictoryMenu createVictoryMenu(){
        VictoryMenu victoryMenu = new VictoryMenu();
        victoryMenu.setBorder(createBorder());
        return victoryMenu;
    }
     */
    protected abstract List<Position> createYellow();
    protected abstract List<Position> createBlue();
    protected abstract List<Position> createBrown();
    protected abstract List<Position> createGreen();
    protected abstract List<Position> createBorder();



}
