/**
 * The Bus class simulates the activity of a bus. A bus moves back and forth
 * along a single route, making stops along the way. The stops on the route are
 * numbered consecutively starting from 1, up to and including a number that is
 * provided when the Bus object is created. You may assume that the number of 
 * stops will always be greater than 1. The bus starts at the first stop and is
 * initially heading toward the last stop. At each step of the simulation, the
 * bus is at a particular stop and is heading toward either the first or last
 * stop. When the bus reaches the first or last stop, it reverses direction.
 * The following table contains a sample code execution sequence and the
 * corresponding results (see link, question 2). Write the complete Bus class,
 * including the constructor and any required instance variables and methods.
 * Your implementation must meet all specifications and conform to the example.
 * 
 * @author LZ-FSDev
 * @see https://tinyurl.com/BusFRQ
 * @since 17.0.1
 * @version 0.0.1
 */
public class Bus {
    //Holds onto the current stop
    private int currStop;
    //Holds onto the total number of stops
    private int totalStops;

    /**
     * Constructs a bus with a specified number of stops from start to finish.
     * 
     * @param totalStops The total number of stops the bus takes from the start
     * to the finish.
     * @since 0.0.1
     */
    public Bus(int totalStops) {
        this.totalStops = totalStops;
        currStop = 0;
    }

    /**
     * Gets the current stop that the bus is at.
     * 
     * @return The stop that the bus is at.
     * @since 0.0.1
     */
    private int getCurrentStop() {
        return 0;
    }

    /**
     * Moves the bus forward one stop (can be left or right depending on what
     * direction the bus is heading). If the bus is at the last or first stop,
     * the bus reverses direction.
     * 
     * @since 0.0.1
     */
    private void move() {

    }
}
