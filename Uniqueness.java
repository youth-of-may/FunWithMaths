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
 * The Uniqueness class also implements Operation. This class tries to find out if a class has unique elements or not.
 */
public class Uniqueness implements Operation {
 
    @Override
    public String getOperationName() {
        return " Uniqueness";
    }
    @Override
    public void operate(Integer[] a) {
        boolean unique = true;
        boolean amInull;

        try {
            amInull = a[0] == null ? true : false;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            amInull = true;
        }
        
        if (amInull == false) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j<a.length; j++) {
                if (i != j && a[i] == a[j]) {
                    unique = false;
                }
            }
        }
        if (unique) {
            System.out.println("All the elements are unique.");
        }
        else {
            System.out.println("NOT all the elements are unique.");
        }
    }
    else {
        System.out.println("There are no elements.");
    }
}


}

    
