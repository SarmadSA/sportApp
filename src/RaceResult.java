/**
 * Represent result of race.
 * 
 * @author Sarmad Saeed
 */
public class RaceResult {
    private Athlete athlete;
    private float result;
    
    /**
     * Constructor of class result
     * 
     * @param athlete - athlete
     * @param result - result of the given athlete
     */
    public RaceResult(Athlete athlete, float result) {
        this.athlete = athlete;
        this.result = result;
    }

    /**
     * Returns the athlete.
     * 
     * @return Athlete - Athlete to return
     */    
    public Athlete getAthlete() {
        return athlete;
    }
    
    /**
     * Returns the result of the athlete.
     * 
     * @return result - result to return
     */ 
    public float getResult() {
        return result;
    }
    
    /**
     * Sets/changes the result to a new result.
     * 
     * @param result - new result
     */
    public void setResult(float result) {
        this.result = result;
    }
    
    /**
     * Compares two restult, one of witch is the objects
     * result with another result, and returns a value
     * indicating wether this objects result is less then,
     * greater then or equal to the parameter result.
     * 
     * @param raceResult
     * @return returnValue - indication-value to return.
     */
    public int compareTo(RaceResult raceResult){
        int returnValue = 0;
        if(result < raceResult.getResult()){
            returnValue = -1;
        }
        else if(result == raceResult.getResult()){
            returnValue = 0;
        }
        else if(result > raceResult.getResult()){
            returnValue = 1;
        }
        return returnValue;
    }
    
}
