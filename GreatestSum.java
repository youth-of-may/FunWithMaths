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
 * The GreatestSum class implements the Operation interface. Using this class you can find the greatest sum of three consecutive integers.\
 * However, it should be kept in mind that if the length of the Integer array is 0, the sum will also be 0.
 */
public class GreatestSum implements Operation {
    @Override
	public void operate(Integer[] a)
	{
        int length = a.length;
        int sum = 0;
        int temp = 0;

        if (length == 0) {
            sum = 0;
        }
        
        else if (length<=3 && length !=0) {
        for (int k = 0; k< length; k++) {
            sum+= a[k];
        }
    }
        else
        {
		for (int i = 0; i < length-2; i++) {
            temp =0;
            
            for (int j = i; j < i+3; j++) {
                temp += a[j];
                
            }
            if (temp > sum) {
                sum = temp;
            }   
        }
    }   
        System.out.println("The greatest sum is " + sum + ".");
	}	
	@Override
	public String getOperationName()
	{
		return " Greatest Sum";
	}
    
}