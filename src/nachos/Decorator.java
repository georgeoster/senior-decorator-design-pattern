package nachos;

/*
 * @author george oster
 */

public class Decorator implements Nacho {

    Nacho temp;

    public Decorator(Nacho toDecorate) {
        temp = toDecorate;
    }

    @Override
    public String getDescription() {
        return temp.getDescription();
    }

    @Override
    public double getCost() {
        return temp.getCost();
    }

}
