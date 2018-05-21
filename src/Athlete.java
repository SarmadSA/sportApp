/**
 * Represent an athlete.
 * 
 * @author Sarmad Saeed
 */
public class Athlete {
   private String name;
   private int age;
   private float startnumber;
   private float personalBest;
   
   /**
    * Constructor of class athlete.
    * 
    * @param name - name of athlete
    * @param age - age of athlete 
    * @param startnumber - startnumber of athlete
    * @param personalBest - personalBest of athlete
    */
    public Athlete(String name, int age, float startnumber, float personalBest) {
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
    public float getStartnumber() {
        return startnumber;
    }
    
    /**
     * Returns the personalBest of the athlete.
     * 
     * @return personalBest - personalBest to return
     */
    public float getPersonalBest() {
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
