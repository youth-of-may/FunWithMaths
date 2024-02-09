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
 * The Operation interface is implemented by other classes like GreatestSum. This interface acts as a blueprint that should be followed strictly by whatever class implemented it.
 */
public interface Operation {
    abstract void operate(Integer[] a);
    abstract String getOperationName();
}