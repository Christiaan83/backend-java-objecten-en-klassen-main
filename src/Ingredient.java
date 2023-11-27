package src;

public class Ingredient {
    public double amount;
    public String unit;
    public String name;

    public Ingredient(double amount, String unit, String name) {
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }

    public Ingredient(){
    }

    public double getAmount(){
        return amount;
    }
    public void setAmount(double amount){
        this.amount = amount;
    }
    public String getUnit(){
        return unit;
    }
    public void setUnit(String unit){
        this.unit = unit;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void ApplePieRecipe(){
        System.out.println("* " + ApplePieRecipe.boter.getAmount() + " " + ApplePieRecipe.boter.getUnit() + " " + ApplePieRecipe.boter.getName());

        System.out.println("* " + ApplePieRecipe.basterdSuiker.getAmount() + " " + ApplePieRecipe.basterdSuiker.getUnit() + " " + ApplePieRecipe.basterdSuiker.getName());

        System.out.println("* " + ApplePieRecipe.bakmeel.getAmount() + " " + ApplePieRecipe.bakmeel.getUnit() + " " + ApplePieRecipe.bakmeel.getName());

        System.out.println("* " + ApplePieRecipe.ei.getAmount() + " " + ApplePieRecipe.ei.getUnit() + " " + ApplePieRecipe.ei.getName());

        System.out.println("* " + ApplePieRecipe.vanilleSuiker.getAmount() + " " + ApplePieRecipe.vanilleSuiker.getUnit() + " " + ApplePieRecipe.vanilleSuiker.getName());

        System.out.println("* " + ApplePieRecipe.zout.getAmount() + " " + ApplePieRecipe.zout.getUnit() + " " + ApplePieRecipe.zout.getName());
        System.out.println("* " + ApplePieRecipe.appel.getAmount() + " " + ApplePieRecipe.appel.getUnit() + " " + ApplePieRecipe.appel.getName());
        System.out.println("* " + ApplePieRecipe.kristalSuiker.getAmount() + " " + ApplePieRecipe.kristalSuiker.getUnit() + " " + ApplePieRecipe.kristalSuiker.getName());

        System.out.println("* " + ApplePieRecipe.kaneel.getAmount() + " " + ApplePieRecipe.kaneel.getUnit() + " " + ApplePieRecipe.kaneel.getName());

        System.out.println("* " + ApplePieRecipe.paneermeel.getAmount() + " " + ApplePieRecipe.paneermeel.getUnit() + " " + ApplePieRecipe.paneermeel.getName());

        System.out.println();
    }
}

