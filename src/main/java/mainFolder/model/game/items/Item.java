package mainFolder.model.game.items;

import mainFolder.model.game.elements.Hero;

public class Item {

    Hero hero;
    private final String name;
    private int quantity = 0;
    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity < 0) {
            return;
        }
        this.quantity = quantity;
    }

    public void incrementsQuantity() {
        this.quantity++;
    }

    public void decrementsQuantity() {
        if(this.quantity == 0) {
            return;
        }
        this.quantity--;
    }
}