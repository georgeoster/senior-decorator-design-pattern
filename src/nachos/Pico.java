package nachos;

/*
 * @author george oster
 */

public class Pico extends Decorator {

    public Pico(Nacho toDecorate) {
        super(toDecorate);
    }

    @Override
    public String getDescription() {
        return temp.getDescription() + ", pico de gallo";
    }

    @Override
    public double getCost() {
        return temp.getCost() + .10;
    }

}
