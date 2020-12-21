package ie.gmit.sw;

import java.util.Iterator;

/**
 * 
 * Omega creates a bridge between the client class and delta/alpha class.
 * It is iterating through types of Kappa which can include beta , zeta etc.
 * It is essentially acting as a state manager / iterator.
 * @author Daniel Gallagher - G00360986
 *
 *
 */

public class Omega {
    
    Delta delta = Delta.getInstance();
    Alpha alpha = new Alpha(Status.Extreme);

    public Omega(){}
    
    /**
     * Iterating through the types of Kappa and also calls their run method.
     */
    public void iterateThroughEach(){
        Iterator<Kappa> kappaIterator = delta.kappaIterator();
        for(Iterator<Kappa> i = kappaIterator; i.hasNext(); ){
            System.out.println(i.next());
            Kappa k = i.next();
            k.run((byte)255);
        }
    }
    
    /**
     * Adds Kappa to the list.
     */
    public void add(Kappa kappa){
        delta.add(kappa);
    }

    /**
     * Removes Kappa from the list.
     */
    public void remove(Kappa kappa){
        delta.remove(kappa);
    }
}
