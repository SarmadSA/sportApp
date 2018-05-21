
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Represents a register that stores all
 * athletes in a list, and provides some functionality
 * such as adding, removeing athletes form the register
 * and finding athlete by name in the register.
 * 
 * @author Sarmad
 * @version 01.06.2018
 */
public class AthleteRegister {
    
    // The list that hold all athlete.
    private ArrayList<Athlete> athleteList;
    
    /**
     * Constructor for object of class athleteRegiser.
     */
    public AthleteRegister() {
        this.athleteList = new ArrayList<>();
    }
    
    /**
     * Adds an athlete to register.
     * 
     * @param athlete - athlete object to add to register
     */
    public void add(Athlete athlete){
        this.athleteList.add(athlete);
    }
    
    /**
     * Removes an athlete form the register.
     * 
     * @param athlete - athlete object to remove form register.
     */
    public void remove(Athlete athlete){
        this.athleteList.remove(athlete);
    }
    
    /**
     * Searches the regiser for an athlete with the 
     * given name, then returns found athlete.
     * 
     * @param name of athlete to find
     * @return found athlete with the spesified name, null if no athlete with such a name found
     */
    public Athlete findByName(String name){
        Iterator<Athlete> it = Athlete.iterator();
        Athlete foundAthlete = null;
        boolean athleteFound = false;
        
        while(!athleteFound && it.hasNext()){
            Athlete athlete = it.next();
            if (athlete.getName().equals(name)){
                foundAthlete = athlete;
            }
        }
        return foundAthlete;
    }
    
    /**
     * Returns and athlete iterator.
     * @return athlete iterator
     */
    public Iterator<Athlete> getAthleteIterator(){
        return athleteList.iterator();
    }
    
}
