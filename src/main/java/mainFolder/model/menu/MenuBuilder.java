package mainFolder.model.menu;

import com.sun.tools.javac.Main;
import mainFolder.model.Position;

import java.util.List;

public abstract class MenuBuilder {
    public MainMenu createMenu(){
        MainMenu mainMenu = new MainMenu();
        mainMenu.setWhite(createWhite());
        mainMenu.setBlue(createBlue());
        mainMenu.setBrown(createBrown());
        mainMenu.setGreen(createGreen());
        mainMenu.setBorder(createBorder());
        mainMenu.setYellow(createYellow());
        return mainMenu;
    }
    /*
    public GameOverMenu createGameOverMenu(){
        GameOverMenu gameOverMenu = new GameOverMenu(1);
        gameOverMenu.setBorder(createBorder());
        return gameOverMenu;
    }

    public WinMenu createWinMenu(){
        WinMenu victoryMenu = new WinMenu(1);
        victoryMenu.setBorder(createBorder());
        return victoryMenu;
    }
    */
    protected abstract List<Position> createWhite();
    protected abstract List<Position> createBlue();
    protected abstract List<Position> createBrown();
    protected abstract List<Position> createGreen();
    protected abstract List<Position> createBorder();
    protected abstract List<Position> createYellow();



}
