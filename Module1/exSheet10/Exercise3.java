package exSheet10;

public class Exercise3 {

	public static void main(String[] args) 
	{
		Pizza[] pizzas = new Pizza[5];
		int[] sizes = {26, 32, 50};
		
		pizzas[0] = new Pizza("Ananas", sizes, new float[]{4, 5.5f, 10} );
		pizzas[1] = new Pizza("Sucuk", sizes, new float[]{4, 5.5f, 10} );
		pizzas[2] = new Pizza("Sardelle", sizes, new float[]{4, 5, 10} );
		pizzas[3] = new Pizza("Scampi", sizes, new float[]{5, 7, 12} );
		pizzas[4] = new Pizza("Margherita", sizes, new float[]{3.5f, 4.5f, 10} );
		
		for (Pizza p : pizzas)
			System.out.println(p);
	}

}
