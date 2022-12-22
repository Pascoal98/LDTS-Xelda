package mainFolder.model.menu;

import mainFolder.model.Position;

import java.util.List;

public abstract class Menu {
    private List<Position> White;
    private List<Position> Green;
    private List<Position> Blue;
    private List<Position> Brown;

    private List<Position> Border;
    private final List<String> entries;
    private int currentEntry = 0;

    public Menu (List<String> entries) {this.entries = entries;}

    public void nextEntry() {
        currentEntry++;
        if (currentEntry > this.entries.size() - 1)
            currentEntry = 0;
    }

    public void previousEntry() {
        currentEntry--;
        if (currentEntry < 0)
            currentEntry = this.entries.size() - 1;
    }

    public String getEntry(int i) {
        return entries.get(i);
    }

    public boolean isSelected(int i) {
        return currentEntry == i;
    }

    public int getNumberEntries() {
        return entries.size();
    }

    public List<Position> getWhite() {return White;}
    public List<Position> getGreen() {return Green;}
    public List<Position> getBlue() {return Blue;}
    public List<Position> getBrown() {return Brown;}
    public List<Position> getBorder() {return Border;}

    public void setWhite(List<Position> White) {this.White = White;}
    public void setGreen(List<Position> Green) {this.Green = Green;}
    public void setBlue(List<Position> Blue) {this.Blue = Blue;}
    public void setBrown(List<Position> Brown) {this.Brown = Brown;}
    public void setBorder(List<Position> Border) {this.Border = Border;}

}
