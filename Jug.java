package ca.utoronto.utm.assignment1.q1;

/**
 *
 * @author Mohammad
 * This class creates Jug objects.
 * Each Jug has jugNumber, jugCapacity and currentAmount.
 * IS-A: inheritance 	(no inheritance is needed for this class).
 * HAS-A: attributes 	(jugNumber, jugCapacity and currentAmount).
 * RESPONDS-TO: methods (addAmount, removeAmount, getJugCapacity, setJugCapacity, getCurrentAmount, setCurrentAmount and toString).
 * CONSTRUCTORS: 		(Jug)
 */
public class Jug {

	private int jugCapacity;
	private int currentAmount;
	private int jugNumber;


	/**
	 * Initialize the attributes used in the Jug class.
	 * @param jugNumber 		 the given jug number.
     * @param jugCapacity        the maximum amount of water the jug can hold (total capacity of the jug).
     * @param currentAmount		 the total amount of water in the jug.
	 */
	public Jug (int jugNumber, int jugCapacity, int currentAmount){
		this.jugCapacity = jugCapacity;
		this.currentAmount = currentAmount;
		this.jugNumber = jugNumber;
	}


	/**
	 * Add one unit of water to the jug.
	 */
	public void addAmount() {
		this.setCurrentAmount(this.getCurrentAmount() + 1);

	}


	/**
	 * Remove one unit of water from the jug.
	 */
	public void removeAmount() {
		this.setCurrentAmount(this.getCurrentAmount() - 1);
	}


	/**
	 * @return The jug's total capacity.
	 */
	public int getJugCapacity() {
		return jugCapacity;
	}


	/**
	 * Set the total jug's capacity equal to jugCapacity.
	 * @param	Total capacity.
	 */
	public void setJugCapacity(int jugCapacity) {
		this.jugCapacity = jugCapacity;
	}


	/**
	 * @return	The total amount of water in the jug.
	 */
	public int getCurrentAmount() {
		return currentAmount;
	}


	/**
	 * Set the total amount of water in jug equal to currentAmount.
	 * @param	Total amount of water.
	 */
	public void setCurrentAmount(int currentAmount) {
		this.currentAmount = currentAmount;
	}


	/**
	 * Return a string representation of the Jug's attributes (jugNumber, currentAmount and jugCapacity).
	 * @return	String representation of Jug's attributes.
	 */
	public String toString() {
		return  jugNumber + ":" + "(" + (currentAmount) + "/" + (jugCapacity) + ")";
	}



}
