// Pastry.java
package Bakery;

public class Pastry {
    private double flour;
    private double butter;
    private double sugar;
    private double milk;
    private double eggs;
    private double bakingPowder;
    private String name;
    private String status;
    private String recipe;
    private double weight;

    public Pastry(double flour, double butter, double sugar, double milk, double eggs, double bakingPowder, String name, String status, String recipe, double weight) {
        this.flour = flour;
        this.butter = butter;
        this.sugar = sugar;
        this.milk = milk;
        this.eggs = eggs;
        this.bakingPowder = bakingPowder;
        this.name = name;
        this.status = status;
        this.recipe = recipe;
        this.weight = weight;
    }

    public String getIngredients() {
        return "Flour: " + flour + ", Butter: " + butter + ", Sugar: " + sugar + ", Milk: " + milk + ", Eggs: " + eggs + ", Baking Powder: " + bakingPowder;
    }

    public String getRecipe() {
        return recipe;
    }

    public void bake() {
        status = "baked";
    }
}