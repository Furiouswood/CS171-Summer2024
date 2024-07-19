/**
 * 
 * This class represents a table where a game is being played.
 * 
 * It implements the Table interface and is designed to work with Card and
 * CardPlayer objects.
 * 
 * <p>
 * Each table instance must keep track of the cards that players place on the table
 * during the game. The number of places available has a fixed size (<code>NUMBER_OF_PLACES</code>),
 * so we use a regular Java array to represent a CardTable's places field. 
 * Each entry in this places array contains 
 * the cards that were added to that place, which is a more dynamic structure (we don't know 
 * in advance how many cards will be added to this place!). 
 * <p>
 * Therefore, each place
 * entry in this array will reference an ArrayList of Card objects.  
 * <p> 
 * Here is how to declare the array of ArrayLists field <code>places</code>:  
 * 
 * <p>
 * <code>
 * 		private ArrayList&lt;Card&gt;[] places = new ArrayList[NUMBER_OF_PLACES];  
 * </code>
 * <p>
 * 
 * Note that the Field Summary section below will only show you public fields, 
 * but you must declare the required field places described above, which is private.
 * You are also free to create additional fields in your class implementation, if deemed necessary.
 * 
 */

// TODO: Complete the implementation of class CardTable below according 
// to the class documentation described here: 
// https://www.cs.emory.edu/~nelsay2/cs171_s23/a2/doc/cs171a2/CardTable.html

public class CardTable {  // TODO: Fix class declaration to implement Table interface (see documentation) 

	// TODO: create all required instance variables (you can add more variables if needed)


	// TODO: basic, no-argument constructor initializes all table 
	// places to new ArrayLists of Card objects 

	
	// TODO: implement all required CardTable methods (you can add helper methods if needed)
	
}
