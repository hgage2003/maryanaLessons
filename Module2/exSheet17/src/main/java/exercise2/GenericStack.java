package exercise2;

import java.util.ArrayList;

public class GenericStack<E>
{
    private ArrayList<E> arrayList;
    
    public GenericStack()
    {
	arrayList = new ArrayList<>();
    }
    
    public void push(E element)
    {
	arrayList.add(element);
    }
    
    public E pop()
    {
	return arrayList.remove(arrayList.size() - 1);
    }

    public static void main(String[] args) 
    {
	GenericStack<String> s = new GenericStack<>(); 
	s.push("Hallo");
	s.push("Welt");
	System.out.println(s.pop());
	System.out.println(s.pop()); 
    }
}
