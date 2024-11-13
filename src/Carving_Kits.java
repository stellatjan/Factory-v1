public class Carving_Kits {
    int price;
    String recomendedage;
    boolean isOnsale;

    public Carving_Kits() {
        price = 10;
        recomendedage = "8 years old and up";
        isOnsale = false;
    }

    public void printInfotwo() {
        System.out.println(price);
        System.out.println(recomendedage);
        System.out.println(isOnsale);

        if (isOnsale) {
            System.out.println("10% off!!");
        } else {
            System.out.println("Regular Price");
        }
    }

public Carving_Kits(int pprice , String precomendedage, boolean pisOnsale) {
    price = pprice;
    recomendedage = precomendedage;
    isOnsale = pisOnsale;
}
}

