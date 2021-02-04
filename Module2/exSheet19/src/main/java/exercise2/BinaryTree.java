package exercise2;

public class BinaryTree<T extends Comparable<T>>
{
    private Node<T> root = null;
    
    public void add(T data)
    {
	Node<T> node = new Node<>(data);
	if (root == null)
	    root = node;
	else
	    root.add(node);
    }
    
    public void traverse()
    {
	if (root != null)
	    root.traverse();
    }

    @Override
    public String toString()
    {
	return "BinaryTree [root=" + root + "]";
    }

    private static class Node<E extends Comparable<E>>
    {
	private Node<E> left = null, right = null;
	private E data;
	
	public Node(E data)
	{
	    this.data = data;
	}
	
	public E getData()
	{
	    return data;
	}
	
	public void add(Node<E> node)
	{
	    if (this.data.compareTo(node.getData()) > 0)
	    {
		if (left == null)
		    left = node;
		else
		    left.add(node);
	    }
	    else
	    {
		if (right == null)
		    right = node;
		else
		    right.add(node);
	    }
	}

	@Override
	public String toString()
	{
	    return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
	}
	
	public void traverse()
	{
	    if (left != null)
		left.traverse();
	    System.out.println(data);
	    if (right != null)
		right.traverse();
	}
    }

    public static void main(String[] args)
    {
	BinaryTree<String> tree = new BinaryTree<>();
	tree.add("Cool");
	tree.add("Aaronson");
	tree.add("Zylla");
	tree.add("Garret");
	tree.add("Garret");
	
	System.out.println(tree);
	tree.traverse();
    }

}
