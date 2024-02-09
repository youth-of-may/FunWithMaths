/**
	This is a template for a Java file.
	
	@author Princess May Giron (232869)
	@version 30 January 2023
	
	I have not discussed the Java language code in my program 
	with anyone other than my instructor or the teaching assistants 
	assigned to this course.

	I have not used Java language code obtained from another student, 
	or any other unauthorized source, either modified or unmodified.

	If any Java language code or documentation used in my program 
	was obtained from another source, such as a textbook or website, 
	that has been clearly noted with a proper citation in the comments 
	of my program.
**/

/**
 * The starter class makes use of other classes like Operation, Uniqueness, LargestIntegers, GreatestSum, and MenuGen that acts as the runner or "executor" of all these classes.
 */

public class Starter {
    public static void main(String[] args) {
        Operation[] o1 = new Operation[3];
        o1[0] = new Uniqueness();
        o1[1]= new LargestIntegers();
        o1[2] = new GreatestSum();
        MenuGen menu = new MenuGen(o1);
        menu.run();

    }
}