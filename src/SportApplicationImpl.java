
import java.util.ArrayList;
import java.util.Scanner;


/**
 * Represents the SportApplication. The class is a delegate for the main
 * application and the menu-system. Any functions triggered by a menu selection
 * leads to a call to one of the methods in this class (via the
 * SportApplication interface).
 *
 * @author asty
 * @version 0.1
 */
public class SportApplicationImpl implements SportApplication
{
    
    private ArrayList<Athlete> athletes; 
            
    public SportApplicationImpl(){
        this.athletes = new ArrayList<>();
    }
            
    @Override
    public void init()
    {
        this.fillRegistersWithDataForTesting();
    }
    
    @Override
    public void registerAthlete()
    {
        System.out.println("registerAthlete() was called..");
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Enter athlete name:");
        String name = reader.nextLine();
        
        System.out.println("Enter athlete age:");
        int age = reader.nextInt();
        
        System.out.println("Enter athlete startnumber:");
        float startnumber = reader.nextFloat();
        
        System.out.println("Enter athlete personalBest:");
        float personalBest = reader.nextFloat();
        
        this.athletes.add(new Athlete(name, age, startnumber, personalBest));
        System.out.println("Athlete: " + name + " Has been registerd!");
    }

    @Override
    public void registerResult()
    {
        System.out.println("registerResult() was called..");    
    }
    
    @Override
    public void listCompetitors()
    {
        System.out.println("listCompetitors() was called..");
        
    }
    
    @Override
    public void showResult()
    {
        System.out.println("showResult() was called..");    
    }
    
    /**
     * A helper method that fills the register(s) with some
     * data for testing purposes.
     */
    private void fillRegistersWithDataForTesting()
    {
        //TODO: Fill in code that creates some athletes and some results
    }        
}
