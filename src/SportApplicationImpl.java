
import java.util.Iterator;
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
    private AthleteRegister athleteRegister;
    private RaceResultRegister raceResultRegister;
    
    public SportApplicationImpl(){
        this.athleteRegister = new AthleteRegister();
        this.raceResultRegister = new RaceResultRegister();
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
        int startnumber = reader.nextInt();
        
        System.out.println("Enter athlete personalBest:");
        double personalBest = reader.nextDouble();
        
        athleteRegister.add(new Athlete(name, age, startnumber, personalBest));
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
        Iterator<Athlete> it = this.athleteRegister.getAthleteIterator();
        while(it.hasNext()){
            Athlete athlete = it.next();
            System.out.println();
            System.out.println("Name: " + athlete.getName());
            System.out.println("Age: " + athlete.getAge());
            System.out.println("StartNumber: " + athlete.getStartnumber());
            System.out.println("PersonalBest: " + athlete.getPersonalBest());
        }
        
    }
    
    @Override
    public void showResult()
    {
        System.out.println("showResult() was called..");
        raceResultRegister.sortResults();
        Iterator<RaceResult> it = this.raceResultRegister.getRaceResultIterator();
        while(it.hasNext()){
            RaceResult raceResult = it.next();
            System.out.println();
            System.out.println("Athlete: " + raceResult.getAthlete().getName());
            System.out.println("Time: " + raceResult.getResult());
        }
    }
    
    /**
     * A helper method that fills the register(s) with some
     * data for testing purposes.
     */
    private void fillRegistersWithDataForTesting()
    {
        athleteRegister.add(new Athlete("Usain Bolt", 39, 1, 9.58));
        athleteRegister.add(new Athlete("Florence GriffithJoyner", 39, 2, 10.49));
        raceResultRegister.add(new RaceResult(new Athlete("Florence GriffithJoyner", 39, 2, 10.49), 10.49));
         raceResultRegister.add(new RaceResult(new Athlete("sarmad test", 39, 1, 8.0), 8.0));
        raceResultRegister.add(new RaceResult(new Athlete("Usain Bolt", 39, 1, 9.58), 9.58));
    }        
}
