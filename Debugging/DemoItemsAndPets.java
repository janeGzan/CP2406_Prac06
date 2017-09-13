public class DemoItemsAndPets {
    public static void main(String[] args) {
        ItemSold itemSold = new ItemSold(1, "It is round", 5.5);
        PetSold cat = new PetSold(2, "Its a cat named kitty", 100, "Y", "Y", "N");

        System.out.println(itemSold.displayInfo());
        System.out.println(cat.displayInfo());
    }
}