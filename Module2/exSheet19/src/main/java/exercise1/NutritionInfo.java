package exercise1;

public class NutritionInfo
{
    private int servings;
    private double weight, protein, fat, carbohydrates, sodium;
    
    
    private NutritionInfo(int servings, double weight, double protein, 
	    double fat, double carbohydrates, double sodium)
    {
	this.servings = servings;
	this.weight = weight;
	this.protein = protein;
	this.fat = fat;
	this.carbohydrates = carbohydrates;
	this.sodium = sodium;
    }

    @Override
    public String toString()
    {
	return "NutritionInfo [servings=" + servings + ", weight=" + weight + ", protein=" + protein + ", fat=" + fat
		+ ", carbohydrates=" + carbohydrates + ", sodium=" + sodium + "]";
    }

    public static class NutritionInfoBuilder
    {	
	 private int servings;
	 private double weight, protein, fat, carbohydrates, sodium;
	    
	public NutritionInfoBuilder(int servings, double weight)
	{
	    this.servings = servings;
	    this.weight = weight;
	}
	
	public NutritionInfoBuilder protein(double protein)
	{
	    this.protein = protein;
	    return this;
	}
	
	public NutritionInfoBuilder fat(double fat)
	{
	    this.fat = fat;
	    return this;
	}
	
	public NutritionInfoBuilder carbohydrates(double carbohydrates)
	{
	    this.carbohydrates = carbohydrates;
	    return this;
	}
	
	public NutritionInfoBuilder sodium(double sodium)
	{
	    this.sodium = sodium;
	    return this;
	}
	
	NutritionInfo build()
	{
	    return new NutritionInfo(servings, weight, protein, fat, carbohydrates, sodium);
	}
    }

    public static void main(String[] args)
    {
	NutritionInfo i = new NutritionInfo.NutritionInfoBuilder(1, 200)
		.protein(55)
		.fat(15)
		.carbohydrates(30)
		.sodium(5)
		.build();
	
	System.out.println(i);
    }
}
