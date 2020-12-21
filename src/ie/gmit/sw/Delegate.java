package ie.gmit.sw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 
 * Delegate is being used as an alpha / delta delegate and extended by both.
 * Instead of calling methods in Delta or Alpha they can be called here.
 *@author Daniel Gallagher - G00360986
 *
 *
 */

public abstract class Delegate {
    
    public Collection<Kappa> kappas = new ArrayList<Kappa>();

	public void add(Kappa kappa){
		kappas.add(kappa);
	}

	public void remove(Kappa kappa){
		kappas.remove(kappa);
	}

	public Iterator<Kappa> kappaIterator(){
		return kappas.iterator();
	}

	public boolean hasKappa(Kappa kappa){
		return kappas.contains(kappa);
	}
}