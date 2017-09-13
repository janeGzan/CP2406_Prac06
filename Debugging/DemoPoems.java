public class DemoPoems {
    public static void main (String[] args){
        Poem poem = new Poem("Default poem", 5);
        Couplet couplet= new Couplet("Default couplet");
        Limerick limerick = new Limerick("Default poem");
        Haiku haiku = new Haiku("Default haiku");

        System.out.println(poem.displayInfo());
        System.out.println(couplet.displayInfo());
        System.out.println(limerick.displayInfo());
        System.out.println(haiku.displayInfo());

    }
}
