/*
 * *********************************************************************************************************
 * Assignment 2 - COMP 346 SECTION WW-WA-WI
 * By Harrison Ianatchkov ID: 6607403 and Harley McPhee ID: 7003226
 * Due March 2, 2015
 * *********************************************************************************************************
 */
package task1;
import common.MyException;

/**
 * Class BlockStack
 * Implements character block stack and operations upon it.
 *
 * $Revision: 1.4 $
 * $Last Revision Date: 2015/02/01 $
 *
 * @author Serguei A. Mokhov, mokhov@cs.concordia.ca;
 * Inspired by an earlier code by Prof. D. Probst

 */
class BlockStack
{
	/**
	 * # of letters in the English alphabet + 2
	 */
	public static final int MAX_SIZE = 28;

	/**
	 * Default stack size
	 */
	public static final int DEFAULT_SIZE = 6;

	/**
	 * Current size of the stack
	 */
	public int iSize = DEFAULT_SIZE;
	
	/**
	 * This access counter will keep track of the number of times the stack is accessed. 
	 */
	public int accessCounter = 0;
	
	/**
	 * Current top of the stack
	 */
	public int iTop  = 3;
	
	/**
	 * stack[0:5] with four defined values
	 */
	public char acStack[] = new char[] {'a', 'b', 'c', 'd', '$', '$'};
	
	public char[] getAcStack() {
		return acStack;
	}
	
	/**
	 * Added this accessor method
	 * @return the access counter
	 */
	public int getAccessCounter() {
		return accessCounter;
	}
	
	/**
	 * Added this accessor method
	 * @return the size of the stack
	 */
	public int getISize() {
		return iSize;
	}
	
	/**
	 * Added this accessor method
	 * @return the current index for the top of the stack
	 */
	public int getITop() {
		return iTop;
	}
	
	/**
	 * Added this method to determine if stack is empty.
	 * @return True if stack is empty, false otherwise.
	 */
	public boolean isEmpty()
	{
		return (this.iTop == -1);
	}

	/**
	 * Default constructor
	 */
	public BlockStack()
	{
	}

	/**
	 * Supplied size
	 */
	public BlockStack(final int piSize)
	{
        if(piSize != DEFAULT_SIZE)
		{
			this.acStack = new char[piSize];

			// Fill in with letters of the alphabet and keep
			// 2 free blocks
			for(int i = 0; i < piSize - 2; i++)
				this.acStack[i] = (char)('a' + i);

			this.acStack[piSize - 2] = this.acStack[piSize - 1] = '$';

			this.iTop = piSize - 3;
                        this.iSize = piSize;
		}
	}

	/**
	 * Picks a value from the top without modifying the stack
	 * @return top element of the stack, char
	 */
	public char pick()
	{
		accessCounter++; // Increment the number of times stack is accessed.
		return this.acStack[this.iTop];
	}

	/**
	 * Returns arbitrary value from the stack array
	 * @return the element, char
	 */
	public char getAt(final int piPosition)
	{
		accessCounter++; // Increment the number of times stack is accessed.
		return this.acStack[piPosition];
	}

	/**
	 * Standard push operation
	 * @throws Exception 
	 */
	public void push(final char pcBlock) throws Exception
	{
		accessCounter++; // Increment the number of times stack is accessed.
		this.acStack[++this.iTop] = pcBlock;

	}

	/**
	 * Standard pop operation
	 * @return ex-top element of the stack, char
	 */
	public char pop()
	{
		accessCounter++; // Increment the number of times stack is accessed.
		char cBlock = this.acStack[this.iTop];
		this.acStack[this.iTop--] = '$'; // Leave prev. value undefined
		return cBlock;
	}
}

// EOF
