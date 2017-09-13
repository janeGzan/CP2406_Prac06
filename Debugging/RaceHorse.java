public class RaceHorse extends Horse{
    private int numberOfRaces;
    RaceHorse(String name,String color,String birth, int numOfRaces ){
        super (name,color,birth);
        this.numberOfRaces = numOfRaces;

    }
    @Override
    public String displayInfo(){
        return this.name + " is color " + this.color + ", born in " + this.birth + ". He participated in "
                + this.numberOfRaces + " races";

    }
}
