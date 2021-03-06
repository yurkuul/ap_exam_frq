/**
 * This question involves reasoning about a simulation of a frog hopping in a
 * straight line. The frog attempts to hopto a goal within a specified number
 * of hops. The simulation is encapsulated in the following FrogSimulation
 * class. You will write two of the methods in this class. See document for
 * more details.
 * Example outputs for FrogSimulation sim = new FrogSimulation(24, 5):
 * <ul>
 *  <li>Values returned by hopDistance(): 5, 7, -2, 8, 6; Final position of
 * frog: 24; Return value of sim.simulate(): true
 *  <li>Values returned by hopDistance(): 6, 7, 6, 6; Final position of
 * frog: 25; Return value of sim.simulate(): true
 *  <li>Values returned by hopDistance(): 6, -6, 31; Final position of
 * frog: 31; Return value of sim.simulate(): true
 *  <li>Values returned by hopDistance(): 4, 2, -8; Final position of
 * frog: -2; Return value of sim.simulate(): false
 *  <li>Values returned by hopDistance(): 5, 4, 2, 4, 3; Final position of
 * frog: 18; Return value of sim.simulate(): false
 * </ul>
 * 
 * @author LZ-FSDev
 * @see https://tinyurl.com/FrogSimulationFRQ
 * @since 17.0.1
 * @version 0.0.3
 */
public class FrogSimulation {
    //Distance, in inches, from the starting position to the goal.
    private int goalDistance;
    //Maximum number of hops allowed to reach the goal.
    private int maxHops;

    /**
     * Constructs a FrogSimulation. Precondition: dist > 0; numHops > 0.
     * 
     * @param dist Distance, in inches, from the starting position to the goal.
     * @param numHops Maximum number of hops allowed to reach the goal.
     * @since 0.0.1
     */
    public FrogSimulation(int dist, int numHops) {
        goalDistance = dist;
        maxHops = numHops;
    }

    public static void main(String[] args) {
        System.out.println("Testing one simulation: FrogSimulation f1 = new FrogSimulation(25, 5)...");
        FrogSimulation f1 = new FrogSimulation(25, 5);
        System.out.println("simulate() results:");
        f1.simulate();

        System.out.println();

        System.out.println("Testing 100 simulations: f1");
        System.out.println("runSimulations(100) results:");
        System.out.println(f1.runSimulations(100));
    }

    /**
     * Returns an integer representing the distance (positive or negative), in
     * inches, to be moved when the frog hops. A positive distance represents a
     * move toward the goal. A negative distance represents a move away from
     * the goal. The returned distance may vary from call to call. Each time
     * the frog hops, its position is adjusted by the value returned by a call
     * to the hopDistance method.
     * 
     * @return Distance the frog moves when the frog hops.
     * @since 0.0.2
     */
    private int hopDistance() {
        return (int)(Math.random()*10);
    }

    /**
     * Simulates a frog attempting to reach the goal. Simulates the frog
     * attempting to hop in a straight line to a goal from the frog's starting
     * position of 0 within a maximum number of hops. The frog hops until one
     * of the following conditions becomes true:
     * <ul>
     *  <li>The frog has reached or passed the goal.
     *  <li>The frog has reached a negative position.
     *  <li>The frog has taken the maximum number of hops without reaching the
     * goal.
     * </ul>
     * 
     * @return true if the frog successfully reached or passed the goal during
     * the simulation; false otherwise.
     * @since 0.0.2
     */
    public boolean simulate() {
        int currDistance = 0;
        for (int i = 0; i < maxHops; i++) {
            int distance = hopDistance();
            //For testing/visual purposes
            System.out.print(distance + ", ");
            currDistance += distance;
            if (currDistance >= goalDistance) {
                //For testing/visual purposes
                System.out.println("true");
                return true;
            } else if (currDistance < 0) {
                //For testing/visual purposes
                System.out.println("false");
                return false;
            }
        }
        //For testing/visual purposes
        System.out.println("false");
        return false;
    }

    /**
     * Runs num simulations. Precondition: num > 0;. Performs a given number of
     * simulations and returns the proportion of simulations in which the frog
     * successfully reached or passed the goal. For example, if the parameter
     * passed to runSimulations() is 400, and 100 of the 400 simulate method
     * calls returned true, then the runSimulations method should return 0.25.
     * 
     * @param num The number of simulations to be run.
     * @return The number of simulations it took for the frog to
     * successfully reach or pass the goal.
     * @since 0.0.2
     */
    public double runSimulations(int num) {
        int totalSuccesses = 0;
        for (int i = 0; i < num; i++) {
            if (simulate()) {
                totalSuccesses++;
            }
        }
        return (double)totalSuccesses/num;
    }
}
