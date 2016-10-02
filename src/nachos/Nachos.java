package nachos;

/*
 * @author george oster
 */

public class Nachos {

    public static void main(String[] args) {
        
        BasicNacho plain = new BasicNacho();
        System.out.println(plain.getDescription() + " : " + plain.getCost());
        
        Jalapeno withJalapeno = new Jalapeno(new BasicNacho());
        System.out.println(withJalapeno.getDescription() + " : " + withJalapeno.getCost());
        
        SourCream withSourCream = new SourCream(new BasicNacho());
        System.out.println(withSourCream.getDescription() + " : " + withSourCream.getCost());
        
        Pico withPico = new Pico(new BasicNacho());
        System.out.println(withPico.getDescription() + " : " + withPico.getCost());
        
        Pico withPicoJalapeno = new Pico(new Jalapeno( new BasicNacho() ) );
        System.out.println(withPicoJalapeno.getDescription() + " : " + withPicoJalapeno.getCost());
        
        Pico theWorks = new Pico( new SourCream( new Jalapeno( new BasicNacho() ) ) );
        System.out.println(theWorks.getDescription() + " : " + theWorks.getCost());
   
    }
    
    

}
