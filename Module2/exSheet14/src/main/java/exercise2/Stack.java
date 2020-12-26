package exercise2;

import java.util.ArrayList;

public class Stack<E> extends ArrayList<E>
{
    private static final long serialVersionUID = 1L;

    public void push(E obj)
    {
	this.add(obj);
    }
    
    public E pop()
    {
	if (this.size() == 0)
	    return null;
	
	return this.remove(this.size() - 1);
    }
    
    public static void main(String[] args)
    {
	Stack<Integer> intStack = new Stack<Integer>();
	
	intStack.push(1);
	intStack.push(2);
	intStack.push(3);
	intStack.push(4);
	intStack.push(5);
	
	System.out.println(intStack.pop());
	intStack.push(6);
	System.out.println(intStack.pop());
	System.out.println(intStack.pop());
	System.out.println(intStack.pop());
	System.out.println(intStack.pop());
	System.out.println(intStack.pop());
    }

}
