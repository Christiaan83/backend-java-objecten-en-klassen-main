package src;

public class ApplePieRecipe {

    static Ingredient boter = new Ingredient(200, "gram", "ongezouten roomboter");
    static Ingredient basterdSuiker = new Ingredient(200, "gram", "witte bastard suiker");
    static Ingredient bakmeel = new Ingredient(400, "gram", "zelfrijzend bakmeel");
    static Ingredient ei = new Ingredient(2,"stuk(s)", "ei");
    static Ingredient vanilleSuiker = new Ingredient(8,"gram", "vanillesuiker");
    static Ingredient zout = new Ingredient(1,"snuf", "zout");
    static Ingredient appel = new Ingredient(1.5,"kilo","zoetzure appels");
    static Ingredient kristalSuiker = new Ingredient(75, "gram", " kristal suiker");
    static Ingredient kaneel = new Ingredient(3,"theelepels", "kaneel");
    static Ingredient paneermeel = new Ingredient(15, "gram", "paneermeel");

    public void voorverwarmen(){
        System.out.println("* Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
    }
    public void loskloppen(){
        System.out.println("* Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.)");
    }
    public void mengen(){
        System.out.println("* Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }
    public void schillen(){
        System.out.println("* Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }
    public void inVetten(){
        System.out.println("* Vet de springvorm in en bestrooi deze met bloem");
    }
    public void bedekken(){
        System.out.println("* Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }public void appels(){
        System.out.println("* Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    }public void deegUitrollen(){
        System.out.println("* Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }public void deegStroken(){
        System.out.println("* Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
    }public void oven(){
        System.out.println("* Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
    }
}
    
    

