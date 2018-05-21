/**
 * Represent an athlete.
 * 
 * @author Sarmad Saeed
 */
public class Athlete {
   private final String name;
   private final int age;
   private final int startnumber;
   private double personalBest;
   
   /**
    * Constructor of class athlete.
    * 
    * @param name - name of athlete
    * @param age - age of athlete 
    * @param startnumber - startnumber of athlete
    * @param personalBest - personalBest of athlete
    */
    public Athlete(String name, int age, int startnumber, double personalBest) {
        this.name = name;
        this.age = age;
        this.startnumber = startnumber;
        this.personalBest = personalBest;
    }
    
    /**
     * Returns the name of the athlete.
     * 
     * @return name - name to return
     */
    public String getName() {
        return name;
    }
    
    /**
     * Returns the age of the athlete.
     * 
     * @return age - age to return
     */
    public int getAge() {
        return age;
    }

    /**
     * Returns the startnumber of the athlete.
     * 
     * @return startnumber - startnumber to return
     */
    public int getStartnumber() {
        return startnumber;
    }
    
    /**
     * Returns the personalBest of the athlete.
     * 
     * @return personalBest - personalBest to return
     */
    public double getPersonalBest() {
        return personalBest;
    }
    
    /**
     * Sets/changes the personalBest of the athlete to a new value.
     * 
     * @param personalBest - new personalBest 
     */
    public void setPersonalBest(float personalBest) {
        this.personalBest = personalBest;
    }
   
   
}
