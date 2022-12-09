package mainFolder.model;

import java.util.List;

public class OptionSelector {
    private int currentEntry = 0;
    private final List<String> entries;

    public OptionSelector(List<String> entries) {
        this.entries = entries;
    }


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
}
