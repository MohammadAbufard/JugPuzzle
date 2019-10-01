package ca.utoronto.utm.assignment1.q2;
import ca.utoronto.utm.assignment1.puzzle.Move;


/**
 *
 * @author Mohammad
 * This class creates Move objects each move has a from and to attributes.
 * IS-A: inheritance 	(inheriting from the Move class (found in the Puzzle package)).
 * HAS-A: attributes 	(from and to).
 * RESPONDS-TO: methods (move and toString).
 * CONSTRUCTORS: 		(MoveJugs).
 */
public class MoveJugs implements Move {

		/**
		 * Create the 3 jugs used in the jug puzzle and assign each of them the correct jug number,
		 * jug capacity and the initial amount of water in each jug.
		 * Store all the jug objects in the storedJugs array.
		 */
		Jug firstJug =  new Jug (0,8, 8);
		Jug secondJug =  new Jug (1,5, 8);
		Jug thirdJug =  new Jug (2,3, 8);
		Jug[] storedJugs = new Jug[] {firstJug, secondJug, thirdJug};

		int from;
		int to;
		/**
		 * Initialize the attributes used in the MoveJugs class.
		 * @param from 		the initial Jug in which water will be removed from.
	     * @param to        the destination Jug in which water will be added to.
		 */
		public MoveJugs (int from, int to){
			this.from = from;
			this.to = to;

		}

	    /**
	     * Get the initial Jug in which we will remove water from and the destination Jug in which we will add water to.
	     * Make the appropriate move by moving the correct amount water from initial Jug to the destination jug.
	     * @param initial 		the initial Jug in which water will be removed from.
	     * @param destination   the destination Jug in which water will be added to.
	     */
		public void move(int initial, int destination) {
			if (initial != destination) {
				while (storedJugs[initial].getCurrentAmount() != 0 && storedJugs[destination].getCurrentAmount() != storedJugs[destination].getJugCapacity()) {
						storedJugs[destination].addAmount();
						storedJugs[initial].removeAmount();
				}
			}
		}

		  /**
	     * Return a string representation of the moves made to solve the jug puzzle.
	     * @return	String representation of moves.
	     */
		public String toString(){
			return "Move from:" + this.from + " to:" + this.to;
		}
}
