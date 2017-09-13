public class DemoHorses {
    public static void main(String[] args){
        Horse horse = new Horse("Whitey" , "white", "05/09/1998");
        RaceHorse raceHorse = new RaceHorse("Blackey", "Black", "13 of September 1995", 15);

        System.out.println(horse.displayInfo());
        System.out.println(raceHorse.displayInfo());

    }
}
