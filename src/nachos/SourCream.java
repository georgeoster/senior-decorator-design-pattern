package nachos;

/*
 * @author george oster
 */

public class SourCream extends Decorator{
    
    public SourCream(Nacho toDecorate) {
        super(toDecorate);
    }

    @Override
    public String getDescription() {
        return temp.getDescription() + ", sour cream";
    }

    public double getCost() {
        return temp.getCost() + .25;
    }
    
    
    
    
}
