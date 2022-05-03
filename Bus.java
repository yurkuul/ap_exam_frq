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
 * @version 0.0.3
 */
public class Bus {
    //Holds onto the current stop
    private int currStop;
    //Holds onto the total number of stops
    private int totalStops;
    //Holds onto if the bus is moving forward or backwards
    private boolean moveForward;

    /**
     * Constructs a bus with a specified number of stops from start to finish.
     * 
     * @param totalStops The total number of stops the bus takes from the start
     * to the finish.
     * @since 0.0.2
     */
    public Bus(int totalStops) {
        this.totalStops = totalStops;
        currStop = 1;
        moveForward = true;
    }

    public static void main(String[] args) {
        //Below are tests of the statements/expressions from the question
        Bus bus1 = new Bus(3);
        Bus bus2 = new Bus(5);

        System.out.println("Current stop of bus 1: " + bus1.getCurrentStop());

        System.out.println("Moving bus 1...");
        bus1.move();
        System.out.println("Current stop of bus 1: " + bus1.getCurrentStop());

        System.out.println("Moving bus 1...");
        bus1.move();
        System.out.println("Current stop of bus 1: " + bus1.getCurrentStop());

        System.out.println("Moving bus 1...");
        bus1.move();
        System.out.println("Current stop of bus 1: " + bus1.getCurrentStop());

        System.out.println("Moving bus 1...");
        bus1.move();
        System.out.println("Moving bus 1...");
        bus1.move();
        System.out.println("Current stop of bus 1: " + bus1.getCurrentStop());
        System.out.println("Current stop of bus 1: " + bus1.getCurrentStop());

        System.out.println("Current stop of bus 1: " + bus1.getCurrentStop());
        System.out.println("Current stop of bus 2: " + bus2.getCurrentStop());
    }

    /**
     * Gets the current stop that the bus is at.
     * 
     * @return The stop that the bus is at.
     * @since 0.0.2
     */
    private int getCurrentStop() {
        return currStop;
    }

    /**
     * Moves the bus forward one stop (can be left or right depending on what
     * direction the bus is heading). If the bus is at the last or first stop,
     * the bus reverses direction.
     * 
     * @since 0.0.2
     */
    private void move() {
        if (currStop == totalStops) {
            moveForward = false;
        } else if (currStop == 1) {
            moveForward = true;
        }
        if (moveForward) {
            currStop++;
        } else {
            currStop--;
        }
    }
}
