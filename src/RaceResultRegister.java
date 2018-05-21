
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Represents a register that holds all avalible 
 * race results, and provides some functionality 
 * such as add, remove, find by name etc..
 * 
 * @author Sarmad
 * @version 21.05.2018
 */
public class RaceResultRegister {
    
    //List that holds all race results
    private final ArrayList<RaceResult> resultList;
    
    /**
     * Constructor for race result objects. 
     */
    public RaceResultRegister() {
        this.resultList = new ArrayList<>();
    }
    
    public void add(RaceResult raceResult){
        this.resultList.add(raceResult);
    }
    
    public void remove(RaceResult raceResult){
        this.resultList.remove(raceResult);
    }
    
    public Iterator<RaceResult> getRaceResultIterator(){
        return this.resultList.iterator();
    }
}
