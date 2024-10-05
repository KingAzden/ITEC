// SourdoughBread.java
package Bakery;

public class SourdoughBread {
    private double flour;
    private double water;
    private double salt;
    private double yeast;
    private double sugar;
    private double starter;
    private String name;
    private String status;
    private String recipe;
    private double weight;

    public SourdoughBread(double flour, double water, double salt, double yeast, double sugar, double starter, String name, String status, String recipe, double weight) {
        this.flour = flour;
        this.water = water;
        this.salt = salt;
        this.yeast = yeast;
        this.sugar = sugar;
        this.starter = starter;
        this.name = name;
        this.status = status;
        this.recipe = recipe;
        this.weight = weight;
    }

    public String getIngredients() {
        return "Flour: " + flour + ", Water: " + water + ", Salt: " + salt + ", Yeast: " + yeast + ", Sugar: " + sugar + ", Starter: " + starter;
    }

    public String getRecipe() {
        return recipe;
    }

    public void bake() {
        status = "baked";
    }
}