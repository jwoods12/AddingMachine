/* Name: John Woods
 * Date: October 4, 2020
 * Class: CSE 360 Tuesdays 9:00 AM
 * Program Description: this program does basic arithmetic
 */

package cse360assignment02;

public class AddingMachine {
	//stores total
	private int total;
	//stores history of addition and subtraction
	private String history;
	
	// constructor
	public AddingMachine() {
		total = 0; // not needed - included for clarity
		history = "";
	}
	
	// returns total
	public int getTotal() {
		return total;
	}
	
	// adds value to total and updates history
	public void add(int value) {
		total = total + value;
		history = history + " + " + value;
	}
	
	// subtracts value from total and updates history
	public void subtract(int value) {
		total = total - value;
		history = history + " - " + value;
	}
	
	// returns history
	public String toString() {
		return "0" + history;
	}
	
	//clears total and history
	public void clear() {
		total = 0;
		history = "";
	}	
}

