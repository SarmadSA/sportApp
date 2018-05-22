/**
 * Represents an exception class that is responsible for
 * validating object states that hold numbers, such as 
 * age, time and other number that can not be negative.
 * 
 * @author Sarmad
 * @version 22.05.2018
 */
public class NegativeNumberException extends Exception {

    /**
     * Creates a new instance of <code>NegativeNumberException</code> without detail message.
     */
    public NegativeNumberException() {
    }

    /**
     * Constructs an instance of <code>NegativeNumberException</code> with the specified detail message.
     *
     * @param msg the detail message.
     */
    public NegativeNumberException(String msg) {
        super(msg);
    }
}
