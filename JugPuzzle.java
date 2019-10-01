package ca.utoronto.utm.assignment1.q1;

/**
 *
 * @author Mohammad
 * This class contains the main methods of the game that will allow it to function correctly.
 * IS-A: inheritance 	(no inheritance is needed for this class).
 * HAS-A: attributes 	(no attributes were made in this class).
 * RESPONDS-TO: methods (getMoves, move, isPuzzleSolved and toString).
 * CONSTRUCTORS: 		(no constructor needed for this class).
 */
public class JugPuzzle {

	/**
	 * Create the 3 jugs used in the jug puzzle and assign each of them the correct jug number,
	 * jug capacity and the initial amount of water in each jug.
	 * Store all the jug objects in the storedJugs array.
	 */
	Jug firstJug =  new Jug (0,8, 8);
	Jug secondJug =  new Jug (1,5, 0);
	Jug thirdJug =  new Jug (2,3, 0);

	Jug[] storedJugs = new Jug[] {firstJug,secondJug, thirdJug};


	int movesCounter = 0;

    /**
     * Return the total number of moves made to solve the Jug puzzle.
     * @return	Total number of moves.
     */
	public int getMoves() {
		return movesCounter;

	}


    /**
     * Get the initial Jug in which we will remove water from and the destination Jug in which we will add water to.
     * Make the appropriate move by moving the correct amount water from initial Jug to the destination jug.
     * @param initial 		the initial Jug in which water will be removed from.
     * @param destination   the destination Jug in which water will be added to.
     */
	public void move(int initial, int destination) {
		movesCounter ++;

		if (initial != destination) {
			while (storedJugs[initial].getCurrentAmount() != 0 && storedJugs[destination].getCurrentAmount() != storedJugs[destination].getJugCapacity()) {
					storedJugs[destination].addAmount();
					storedJugs[initial].removeAmount();

			}
		}
	}


	  /**
     * Game only ends when both the first and second jugs have a total amount of 4 in each Jug.
     * If both the first and second jugs have a total amount of 4 in each Jug return True else return False.
     * @return	True if puzzle solved, else False.
     */
	public boolean isPuzzleSolved() {
		if (firstJug.getCurrentAmount() == 4 && secondJug.getCurrentAmount() == 4) {
			return true;
		}
		else {
			return false;
		}

	}


	  /**
     * Return a string representation the total number of moves made and the total amount of water in each Jug.
     * @return	String representation of number of moves and jugs.
     */
	public String toString() {
		return movesCounter + " " + firstJug.toString() + " " + secondJug.toString() + " " + thirdJug.toString();
	}
}
