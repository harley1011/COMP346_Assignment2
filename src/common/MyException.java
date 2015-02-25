package common;
/**
 * Implements the MyException class.
 * Added this custom exception class to handle errors in the program. 
 * @author Harrison Ianatchkov, Harley McPhee
 *
 */
public class MyException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public MyException(String message)
	{
		super(message);
	}
	
	
}
