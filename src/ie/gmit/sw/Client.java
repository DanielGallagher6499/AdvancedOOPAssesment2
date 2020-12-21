package ie.gmit.sw;

/**
 * 
 * Client is acting as a runner class. It can iterate add and remove from the Omega class.
 *@author Daniel Gallagher - G00360986
 *
 *
 */

public class Client {

    static Omega omega = new Omega();
    public static void main(String[] args){
        add(new Beta());
        add(new Epsilon());
        add(new Gamma());
        add(new Zeta());

        iterate();
    }

    public static void iterate(){
        omega.iterateThroughEach();
    }

    public static void add(Kappa kappa){
        omega.add(kappa);
    }

    public static void remove(Kappa kappa){
        omega.remove(kappa);
    }
}
