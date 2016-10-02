package nachos;

/*
 * @author george oster
 */

public class Jalapeno extends Decorator {

    public Jalapeno(Nacho toDecorate) {
        super(toDecorate);
    }

    @Override
    public String getDescription() {
        return temp.getDescription() + ", jalapenos";
    }

    @Override
    public double getCost() {
        return temp.getCost() + .50;
    }

}
