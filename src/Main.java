package src;

public class Main {
    public static void main(String[] args) {
    ApplePieRecipe recept = new ApplePieRecipe();
    Ingredient ingredients = new Ingredient();

        System.out.println("Ingrediënten:");
        System.out.println();

    ingredients.ApplePieRecipe();
        System.out.println();
        System.out.println("Stappen:");
        System.out.println();
    recept.voorverwarmen();
    recept.loskloppen();
    recept.mengen();
    recept.schillen();
    recept.inVetten();
    recept.bedekken();
    recept.appels();
    recept.deegUitrollen();
    recept.deegStroken();
    recept.oven();

    }
}
