package mainFolder.model.game.elements;

public class Coin extends Element{

    public Coin(int x, int y){super(x,y);}

    @Override
    public boolean equals(Object o){
        if(o == null || this.getClass() != o.getClass()) return false;

        return(this == o ||
                this.getPosition().equals(((Coin) o).getPosition()));

    }
}
