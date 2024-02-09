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
 * The LargestIntegers class finds the largest integer in a given Integer Array. It returns a value/values depending on the array's number of elements.
 */
import static java.lang.System.out;
public class LargestIntegers implements Operation {
   
    @Override
	public void operate(Integer[] a)
	{
        boolean amInull;
        try {
        amInull = a[0] == null ? true : false;
        }
        catch (IndexOutOfBoundsException e) {
        amInull = true;
        }
        
        int length = a.length;
        int maximum = 0;
        int index = 0;
        Integer[] nums = new Integer[3];
        String message = "";

        if (amInull == false) {
        for (int i = 0; i <3; i++) {
            maximum = 0;
            for (int j = 0; j< length;j++) {
                if (a[j] > maximum) {
                    maximum = a[j];
                    index = j;
                }              
            }
            nums[i] = maximum;
            a[index] = 0;
        }
            message = switch (length) {
            case 1-> "The largest integer is " + nums[0] + ".";
            case 2 -> "The larget integers are " + nums[1] + " and " + nums[0] + ".";
            default -> "The larget integers are " + nums[2] + ", " + nums[1] + ", and " + nums[0] + ".";
        };
        }
        else {
            message = "There are no integers.";
        }
        
		out.println(message);
	}
	
	@Override
	public String getOperationName()
	{
		return " Largest Integers";
	}
    
}